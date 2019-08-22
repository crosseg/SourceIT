public abstract class Confection {
    protected double weight;
    protected String name;

    public abstract double sugarWeight();

    public Confection(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Confection() {
    }

}
