package Algorithms.Lesson_2;

public class lesson_2 {
    private Node<T> head;
    private int size;

    private class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    /// homework///////////////////////////////////////////
    public int size() {
        return size;
    }

    public boolean contains(T value) {
        if (head == null)
            return false;
        Node<T> cursor = head;
        while (cursor != null) {
            if (cursor.value == value)
                return true;
            cursor = cursor.next;
        }
        return false;
    }

    public T popLast() {
        if (head == null)
            throw new IllegalStateException("Список пустой");
        return pop(size - 1);
    }

    public MyLinkedList<T> reversed() {
        MyLinkedList<T> reverseLinkedList = new MyLinkedList<T>();
        Node<T> tempNode = head;
        while (tempNode != null) {
            reverseLinkedList.addFirst(tempNode.value);
            tempNode = tempNode.next;
        }
        return reverseLinkedList;
    }

    private void addFirst(T value) {
        Node<T> firstNode = new Node<T>(value, head);
        head = firstNode;
    }
    //////////////////////////////////////////////////////

    public void add(T value) {
        Node<T> last = findLast();
        if (last == null) {
            head = new Node<T>(value);
        } else {
            last.next = new Node<T>(value);
        }
        size++;
    }

    public T getFirst() {
        return get(0);
    }

    public T get(int index) {
        if (head == null) {
            throw new IllegalStateException("Список пустой");
        } else if (index < 0) {
            throw new IndexOutOfBoundsException(index);
        }

        Node<T> cursor = head;
        int indexCursor = 0;
        while (cursor != null) {
            if (indexCursor == index) {
                return cursor.value;
            }

            cursor = cursor.next;
            indexCursor++;
        }

        throw new IndexOutOfBoundsException(index);
    }

    public T popFirst() {
        return pop(0);
    }

    public T pop(int index) {
        if (head == null) {
            throw new IllegalStateException("Список пустой");
        } else if (index < 0) {
            throw new IndexOutOfBoundsException(index);
        }

        if (index == 0) {
            T pop = head.value;
            head = head.next;
            size--;
            return pop;
        }

        Node<T> cursor = head;
        int indexCursor = 1;
        while (cursor.next != null) {
            if (indexCursor == index) {
                T pop = cursor.next.value;
                cursor.next = cursor.next.next;
                size--;
                return pop;
            }

            cursor = cursor.next;
            indexCursor++;
        }

        throw new IndexOutOfBoundsException(index);
    }

    private Node<T> findLast() {
        if (head == null) {
            return null;
        }

        Node<T> cursor = head;
        while (cursor.next != null) {
            cursor = cursor.next;
        }
        return cursor;
    }

    @Override
    public String toString() {
        // [1 -> 2 -> 3 -> 4 -> 5 -> ]
        StringBuilder result = new StringBuilder("[");
        Node<T> cursor = head;
        while (cursor != null) {
            result.append(cursor.value).append(" -> ");
            cursor = cursor.next;
        }

        int length = result.length();
        if (length > 4) {
            result.delete(length - 4, length);
        }

        result.append("]");
        return result.toString();
    }
}
