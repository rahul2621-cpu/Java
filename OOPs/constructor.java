public class constructor {
    String name;
    int age;

    public constructor(){
        this.name = "BOB";
        this.age = 19;
        System.out.println("Default constructor is called");
    }

    public constructor(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Parametriaed constructor is called");
    }

    public constructor(constructor other){
        this.name = other.name;
        this.age = other.age;
        System.out.println("Copy constructor is called");
    }

    public void display(){
        System.out.println(name +","+age);
    }
    public static void main(String[] args) {
        constructor c1 = new constructor();
        c1.display();

        constructor c2 = new constructor("Alice",21);
        c2.display();

        constructor c3 = new constructor(c2);
        c3.display();
    }
}
