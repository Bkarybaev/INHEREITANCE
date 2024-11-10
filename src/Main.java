public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW",5.5,400);
        Truck truck = new Truck();
        truck.setVolume(4.3);
        truck.setModel("truck 1");
        truck.setStrength(500);
        System.out.println(car);
    }
}