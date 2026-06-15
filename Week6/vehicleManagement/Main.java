package Week6.vehicleManagement;

public class Main {
    static void main(String[] args) {
        Car car=new Car("Ferrari",300,5);
        car.details();
        Bike bike=new Bike("Suzuki",100, "curved");
        bike.details();
    }
}
