public class Demo {
    public static void main(String[] args) {

        String s = "ChillFlex";
        String s1 = "Ricrado";
        String s2 = "Milos";
        String s3 = "flexing";
        String s4 = "2134 times";
        String s5 = String.valueOf(Math.E);

        DefaultMyList myList = new DefaultMyList();
        myList.add(s);
        myList.add(s1);
        myList.add(s2);
        myList.add(s3);
        myList.add(s4);
        myList.add(s5);

        for( int i = 0; i< myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        Boolean balabol = myList.remove(s2);

    }
}
