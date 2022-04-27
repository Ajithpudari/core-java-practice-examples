package anonymousObject;

class Employee
{
    String name = "aj";
    int age = 30;

    // Constructor
    Employee()
    {
    }
    // Constructor with Parameters
    Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void initialize(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    void display()
    {
        System.out.println(name+" "+age);
    }
}

public class Main
{
    public static void main(String args[])
    {
        //using constructors to initialize name with given value and display it.
        new Employee("Ajith",28).display();
        new Employee().display();
    }
}

