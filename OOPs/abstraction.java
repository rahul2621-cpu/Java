abstract class vehicle{
    abstract void start();

    void stop(){
        System.out.println("Vehicle Stopped");
    }

    void fuelcapacity(int capacity){
        System.out.println(("Fuel Capacity:"+capacity+"litres"));
    }
}

class car extends vehicle{
    void start(){
        System.out.println("Car Started");
    }

    void openSunroof(){
        System.out.println("Sunroof is opened:");
    }
}

public class abstraction {
    public static void main(String[] args) {
        vehicle vh = new car();
        vh.start();
        vh.stop();
        vh.fuelcapacity(50);
    }
    
}
