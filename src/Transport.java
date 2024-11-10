public class Transport {
    private String model;
    private double volume;

    public Transport() {
    }


    public Transport(String model, double volume) {
        this.model = model;
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return  "model= " + model +
                ", volume=" + volume;
    }
}
