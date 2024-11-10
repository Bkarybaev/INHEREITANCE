public class Car extends Transport{
    private double speed;

    public Car() {
    }

    public Car(String model, double volume, double speed) {
        super.setModel(model);
        super.setVolume(volume);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString()  + ", speed =" + speed;
    }
}
