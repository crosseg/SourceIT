public class SortBySugar implements Sort {
    @Override
    public int compare(Confection o1, Confection o2) {
        return Double.compare(o1.sugarWeight(), o2.sugarWeight());

    }
}
