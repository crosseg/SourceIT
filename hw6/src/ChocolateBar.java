public class ChocolateBar extends Confection {
    public ChocolateBar(double weight, String name) {
        super(weight, name);
    }
    @Override
    public double sugarWeight() {
        return weight * 0.5;
    }
    @Override
    public String getName() {
        return "ChocolateBar :".concat(name);
    }
}
