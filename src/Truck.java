public class Truck extends Transport{
    private int strength;

    public Truck() {
    }

    public Truck(String model, int strength, double volume) {
        super(model, volume);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return super.toString() + ", strength " + strength;
    }
}
