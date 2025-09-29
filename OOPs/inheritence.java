//Single Inheritence//

// class animal{
//     void eat(){
//         System.out.println("Eating");
//     }
// }

// class dog extends animal{
//     void bark(){
//         System.out.println("Barking");
//     }
// }

// public class inheritence {
//         public static void main(String[] args) {
//             dog d = new dog();
//             d.eat();
//             d.bark();
//         }
// }


// Multilevel Inheritence

// class animal{
//     void eat(){
//         System.out.println("Animal eating");
//     }
// }

// class dog extends animal{
//     void bark(){
//         System.out.println("Dog barks");
//     }
// }

// class puppy extends dog{
//     void weep(){
//         System.out.println("Weeping");
//     }
// }

// public class inheritence{
//     public static void main(String[] args) {
//         puppy pu = new puppy();
//         pu.eat();
//         pu.bark();
//         pu.weep();
//     }
// }


// Hierarhical Inheritence

// class animal{
//     void eat(){
//         System.out.println("Animal eating");
//     }
// }

// class dog extends animal{
//     void bark(){
//         System.out.println("Barking");
//     }
// }

// class cat extends animal{
//     void meaow(){
//         System.out.println("Meow");
//     }
// }

// public class inheritence{
//     public static void main(String[] args) {
//         dog d = new dog();
//         cat c = new cat();

//         d.eat();
//         d.bark();
//         c.eat();
//         c.meaow();
//     }
// }

//Hybrid Inheritenc

// interface animal{
//     void sound();
// }

// class mammal{
//     void sleep(){
//         System.out.println("Sleeping");
//     }
// }

// class dog extends mammal implements animal{
//     public void sound(){
//         System.out.println("Barking");
//     }
// }

// public class inheritence{
//     public static void main(String[] args) {
//         dog d = new dog();
//         d.sleep();
//         d.sound();

//     }
// }


// Multiple Inheritence and Diamond problem

interface A{
    default void display(){
        System.out.println("Interface A display");
    }
}

interface B{
    default void display(){
        System.out.println("Interface B display");
    }
}

class C implements A,B{
    public void display(){
        B.super.display();
    }
}

public class inheritence{
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}
