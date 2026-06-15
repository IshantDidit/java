package Week6.vehicleManagement;

public class Car extends Vehicle{
    private int noOfDoors;

    public Car(String brandName, double maxSpeed, int noOfDoors) {
        super(brandName, maxSpeed);
        this.noOfDoors = noOfDoors;
    }

    @Override
    public void details() {
        super.details();
        System.out.println("no of doors"+noOfDoors);
    }
}
