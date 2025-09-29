public class overloading {

    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a, double b){
        return a+b;
    }

    public double add(int a,  double b){
        return a+b;
    }

    public static void main(String[] args) {
        overloading o = new overloading();

        System.out.println(o.add(1,2));
        System.out.println(o.add(1,2,3));
        System.out.println(o.add(1.5,1.6));
        System.out.println(o.add(1,0.0));
    }
    
}
