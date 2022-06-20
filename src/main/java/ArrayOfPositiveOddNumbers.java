import java.util.Random;

public class ArrayOfPositiveOddNumbers {
    public static void main (String []args) {
        int[] array = new int[100];
        Random r = new Random();
        int sumOfPositiveOddNumbers=0;
        for (int i = 0; i < array.length; i++) {
            int x = r.nextInt();
            array[i] = x;
            System.out.println(i+" "+ array[i]);
            if(x>0&x%2!=0) {
                sumOfPositiveOddNumbers+=1;
            }
        }
        System.out.println("Summ of positive odd numbers = "+sumOfPositiveOddNumbers);
    }
}
