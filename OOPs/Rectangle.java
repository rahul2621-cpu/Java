public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;

    }

    public double getArea(){
        System.out.println("Area is:");
        return length*width;
    }

    public double getPerimeter(){
        System.out.println("Perimeter is:");
        return 2*(length+width);
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }
    

    public static void main(String[] args){

        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(7.5, 4.5);

        System.out.println(rect1.getArea());
        System.out.println(rect1.getPerimeter());

        System.out.println(rect2.getArea());
        System.out.println(rect2.getPerimeter());
        
        rect1.setLength(6.0);
        rect1.setWidth(4.0);
        System.out.println(rect1.getArea());
    }
}