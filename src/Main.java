
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {


        int[] array = arrayRandom(30);
        //SUM FOR MOTH
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println("Сумма трат за месяц составила" + sum);

        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("Минимальная сумма трат за день составила" + min + "рублей Максимальная сумма трат за день составила" +max+" рублей");
        ///found maximum and minimum
        System.out.println("Средняя сумма трат за месяц составила" +(double)sum/ array.length+ "рублей");

        ////Задание 4
        String value = "ivan ivanov";

        char[] intArray = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i=intArray.length-1;i>=0;i--)
                 System.out.print(intArray[i] + "  ");
    }





        public static int[] arrayRandom ( int length){
            java.util.Random random = new java.util.Random();
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
    }


