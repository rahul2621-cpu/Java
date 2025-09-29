class Animal {

    public void sound(){
        System.out.println("Animals make sound");
    }
}
class Dogo extends Animal{
    public void sound(){
        System.out.println("Dog Barks");
    }
}

class Caty extends Animal{
    public void sound(){
        System.out.println("Cat Meows");
    }}


public class overridng{
public static void main(String[] args) {
    Animal o = new Animal();
    Animal dog = new Dogo();
    Animal cat = new Caty();

    o.sound();
    dog.sound();
    cat.sound();
}
}

