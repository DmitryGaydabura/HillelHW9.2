import java.util.Scanner;

/*1. Создать массив на 20 чисел.

2. Ввести в него значения с консоли.

3. Создать два массива на 10 чисел каждый.

4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 20 integers to determine Big Array");

        int[] bigArray = new int[20];
        for (int i = 0; i < bigArray.length; i++) {
            Scanner in = new Scanner(System.in);
            bigArray[i] = in.nextInt();
        }

        int[] firstSmallArray = new int[10];
        int[] secondSmallArray = new int[10];

        for (int i = 0; i < firstSmallArray.length; i++) {
            firstSmallArray[i] = bigArray[i];
        }

        for (int i = 0; i < firstSmallArray.length; i++) {
            secondSmallArray[i] = bigArray[i + 10];
        }

        System.out.println("Your big array is: ");
        for (int i = 0; i < bigArray.length; i++) {
            System.out.print(bigArray[i] + " ");
        }
        System.out.println("\n------------------------------------------");
        System.out.println("Your first small array is: ");
        for (int i = 0; i < firstSmallArray.length; i++) {
            System.out.print(firstSmallArray[i] + " ");
        }
        System.out.println("\n------------------------------------------");
        System.out.println("Your second small array is: ");
        for (int i = 0; i < secondSmallArray.length; i++) {
            System.out.print(secondSmallArray[i] + " ");
        }
        System.out.println("\n------------------------------------------");


    }
}
