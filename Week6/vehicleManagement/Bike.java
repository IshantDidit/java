package Week6.vehicleManagement;

public class Bike extends Vehicle{
    private String handlebar;

    public Bike(String brandName, double maxSpeed, String handlebar) {
        super(brandName, maxSpeed);
        this.handlebar = handlebar;
    }

    @Override
    public void details() {
        super.details();
        System.out.println("handle bar is" + handlebar);
    }
}
