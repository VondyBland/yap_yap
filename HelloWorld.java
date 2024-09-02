// public class HelloWorld {
//     public static void main(String[] args) {
//         System.out.println("Hello World");
//     }
// }
import java.util.Arrays;
import java.util.Random;

public class HelloWorld {
    private static int[] genArray(int length) {
        Random rnd = new Random();
        int[] array = new int[length];
        for (int i =0;i<length;i++) {
            array[i] = rnd.nextInt(1000);

        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println("Hello World"); 
        int[] array = genArray(10);
        System.out.println(Arrays.toString(array));
        System.out.println(array[3]);
        array[5] = array[3];
        System.out.println(array[5]);
        System.out.println(Arrays.toString(array));
    }
}
