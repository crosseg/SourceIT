public class Lollipop extends Confection {
    public Lollipop(double weight, String name) {
        super(weight, name);
    }
    @Override
    public double sugarWeight() {
        return weight*0.6;
    }
    @Override
    public String getName() {
        return "Lollipop :".concat(name);
    }
}
