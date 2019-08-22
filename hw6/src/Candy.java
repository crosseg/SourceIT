public class Candy extends Confection {
    public Candy(double weight, String name) {
        super(weight, name);
    }
    @Override
    public double sugarWeight() {
        return weight * 0.3;
    }
    @Override
    public String getName() {
        return "Candy :".concat(name);
    }
}
