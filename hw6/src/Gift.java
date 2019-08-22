import java.util.ArrayList;


public class Gift {

    private ArrayList<Confection> sweets = new ArrayList();

    public Gift() {

    }


    public void add(Confection confection) {
        if (confection == null) {
            throw new IllegalArgumentException();
        }
        sweets.add(confection);
    }


    public double getWeight() {
        double weight = 0;
        for (Confection confection : sweets
        ) {
            weight += confection.getWeight();
        }
        return weight;
    }


    public Confection range(double minSugar, double maxSugar) {
        for (Confection confection : sweets
        ) {
            if (confection.sugarWeight() >= minSugar && confection.sugarWeight() <= maxSugar)
                return confection;
        }
        return null;
    }


    public void sort(Sort t) {
        sweets.sort(t);
    }


    @Override
    public String toString() {
        String s = "";
        for (Confection confection : sweets
        ) {
            s += confection.getName();
            s += "\n";
        }
        return s;
    }
}