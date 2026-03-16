/*
1. Create a class called Person with name (String) and age (int) attributes.
Implement a constructor to set these attributes upon object creation.
Create two Person objects, set their details, and print them.
*/

class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Rahul", 20);
        Person p2 = new Person("Anita", 22);

        p1.display();
        p2.display();
    }
}



