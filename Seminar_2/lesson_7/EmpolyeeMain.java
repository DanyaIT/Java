package Seminar_2.lesson_7;

public class EmpolyeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("Daniil", "Smith", "Personnel Service", 100000);
        Employee e2 = new Employee("Danya", "Smith", "Technical Department", 150000);
        Employee e3 = new Employee("Den", "Smith", "Technical Department", 135000);

        System.out.println("e1: " + e1 + "\ne2: " + e2 + "\nрезультат сравнения (equals):" + e1.equals(e2) + "\n");
        System.out.println("e2: " + e2 + "\ne3: " + e3 + "\nрезультат сравнения (equals):" + e2.equals(e3) + "\n");

        System.out.println(e1.hashCode() == e2.hashCode());
        System.out.println(e2.hashCode() == e3.hashCode());
    }
}
