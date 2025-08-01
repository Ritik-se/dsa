/* Online Java Compiler and Editor */
class employee {

    int age;
    String name;
    float salary;

    employee(int age, String name, float salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public void print() {
        System.out.println("age" + age + "name=" + name + "salary=" + salary);
    }
}

public class main1 {

    public static void main(String[] args) {
        employee emp = new employee(18, "ritik", 1200000);
        emp.print();

    }
}
