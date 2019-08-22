public class Demo {
    public static void main(String[] args) {
        Gift gift = new Gift();
        gift.add(new Lollipop(1, "Cock"));
        gift.add(new Candy(3, "Cancers"));
        gift.add(new ChocolateBar(8, "Milka"));
        gift.add(new Candy(5, "JuiceChew"));
        System.out.print(gift.toString());
        System.out.print(gift.toString());
        gift.sort(new SortBySugar());
        System.out.print(gift.toString());
        System.out.print(gift.range(1, 5).getName());
    }
}

