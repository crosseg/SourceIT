public class SortByWeight implements Sort {

    @Override
    public int compare(Confection o1, Confection o2) {
        return Double.compare(o1.getWeight(), o2.getWeight());
    }
}