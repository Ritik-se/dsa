/* Online Java Compiler and Editor */
class Employee {

    int age;
    String name;
    float salary;

    employee(int age, String name, float salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public static void print() {
        System.out.println(age, name, salary);
    }
}

public class HelloWorld {

    public static void main(String[] args) {
        employee emp = new employee(18, ritik, 1200000);
        emp.print();

    }
}
