class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    String company;

    Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    // Method overriding
    @Override
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Company: " + company);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 30, "Google");
        emp.displayInfo();  // Overridden method
    }
}
