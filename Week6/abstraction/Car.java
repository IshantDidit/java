package Week6.abstraction;

public class Car implements Vehicle, FourWheeler{

    @Override
    public void start() {
        System.out.println("car start");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }
    @Override
    public void engine(){
        System.out.println("car engine");
    }
    @Override
    public void brake(){
        System.out.println("car brake");
    }

}
