import java.util.Comparator;

public interface Sort extends Comparator<Confection> {


        @Override
        int compare(Confection o1, Confection o2);
    }

