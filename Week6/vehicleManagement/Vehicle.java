package Week6.vehicleManagement;

public class Vehicle {
    private String brandName;
    private double maxSpeed;

    public Vehicle(String brandName, double maxSpeed) {
        this.brandName = brandName;
        this.maxSpeed = maxSpeed;
    }
    public void details(){
        System.out.println("brand namw"+ brandName);
        System.out.println("max speed"+ maxSpeed);
    }
}
