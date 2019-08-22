public class RandomArray {
    public static void randomArray() {
        int[] array10 = new int[10];
        int[] array20 = new int[20];
        for (int i = 0; i < array10.length; i++)
        {
            array10[i] = ((int)(Math.random() * 10));
        }
        for (int i = 0; i < 10; i++)
        {
            array20[i]=array10[i];
            System.out.print(array10[i]);
            System.out.print(" ");
        }

        System.out.println(" ");


        for(int i = 10; i < array20.length; i++)
        {
            array20[i] = array10[i-10] * 2;
        }


        for(int i = 0; i < array20.length; i++)
        {
            System.out.print(array20[i]);
            System.out.print(" ");
        }
    }
}