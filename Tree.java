import java.util.*;

public class Tree<T extends Comparable<T>> {
    // FIXME: 29.05.2023 Домашнее задание
    // Сделать класс Node параметризованным типом T
    // Переписать все упоминания int value на T value
    // Заменить все проверки > < == на вызовы compareTo

    private class Node<T> {
        T value;
        Node<T> left;
        Node<T> right;

        Node(T value) {
            this.value = value;
        }
    }

    private Node<T> root;

    public boolean add(T value) {
        if (root == null) {
            root = new Node<T>(value);
            return true;
        }

        return addNode(root, value);
    }

    private boolean addNode(Node<T> current, T value) {
        // value < current.value ~ value.compareTo(current.value) == 0
        if (value.compareTo(current.value) == 0) {
            return false;

            // value < current.value ~ value.compareTo(current.value) < 0
        } else if (value.compareTo(current.value) < 0) {
            // Вставялем в левое поддерево
            if (current.left == null) {
                current.left = new Node<T>(value);
                return true;
            } else {
                return addNode(current.left, value);
            }
            // value > current.value ~ value.compareTo(current.value) > 0
        } else { // value > root.value
            // Вставляем в правое поддерево
            if (current.right == null) {
                current.right = new Node<T>(value);
                return true;
            } else {
                return addNode(current.right, value);
            }
        }
    }

    public boolean contains(T value) {
        return findNode(root, value) != null;
    }

    private Node<T> findNode(Node<T> current, T value) {
        if (current == null) {
            return null;
        }

        // найди узел в дереве current, значение которого равно value
        if (value.compareTo(current.value) == 0) {
            return current;
        } else if (value.compareTo(current.value) < 0) {
            return findNode(current.left, value);
        } else { // value > current.value
            return findNode(current.right, value);
        }
    }

    public void remove(T value) {
        root = removeNode(root, value);
    }

    private Node<T> removeNode(Node<T> current, T value) {
        if (current == null) {
            return null;
        }

        // value = 8, current = 6
        // 6.right = 7

        // value = 8, current = 8
        if (value.compareTo(current.value) < 0) {
            // нужно удалить в левом поддереве
            current.left = removeNode(current.left, value);
            return current;
        } else if (value.compareTo(current.value) > 0) {
            // нужно удалить в правом поддереве
            current.right = removeNode(current.right, value);
            return current;
        }

        // Нужно удалить узел current
        // Есть 3 случая:
        // 1. Дочерних узлов нет
        if (current.left == null && current.right == null) {
            return null;
        }

        // 2. Есть только один дочерний узел
        if (current.left == null && current.right != null) {
            return current.right;
        }
        if (current.left != null && current.right == null) {
            return current.left;
        }

        // 3. Есть оба дочерних узла
        // Нужно найти минимальный элемент справа
        Node<T> smallestNodeOnTheRight = findFirst(current.right);
        T smallestValueOnTheRight = smallestNodeOnTheRight.value;
        current.value = smallestValueOnTheRight;
        current.right = removeNode(current.right, smallestValueOnTheRight);
        return current;
    }

    public T findFirst() {
        if (root == null) {
            throw new NoSuchElementException();
        }
        return findFirst(root).value;
    }

    private Node<T> findFirst(Node<T> current) {
        if (current.left == null) {
            return current;
        }
        return findFirst(current.left);
    }

    public List<T> dfs() {
        if (root == null) {
            return List.of();
        }

        List<T> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    private void dfs(Node<T> current, List<T> result) {
        // In-order
        if (current.left != null) {
            dfs(current.left, result);
        }
        result.add(current.value);
        if (current.right != null) {
            dfs(current.right, result);
        }
    }

    public List<T> bfs() {
        if (root == null) {
            return List.of();
        }

        List<T> result = new ArrayList<>();
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node<T> next = queue.poll();
            result.add(next.value);

            if (next.left != null) {
                queue.add(next.left);
            }
            if (next.right != null) {
                queue.add(next.right);
            }
        }
        return result;
    }
}
