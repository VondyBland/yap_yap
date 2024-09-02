import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n = 2;
        int m = n;
        // Примитивные: целевые вещественные логические символьные
        // Целые bute -1 short -2 int - 4 long - 8
        byte bt = -38; long dd = 45L;
        // Вещественные float-4 double - 8
        double f = 3.14, ff = Math.PI;
        float fl = 2.7F;
        // Логические boolean - true,false
        boolean bbb = true, vvv = n > 10;
        // Символьные: 
        char c = 'x'; char ss = (char)(c + 1);
        System.out.println(ss);
        boolean odd = dd % 2 == 1; long lng = dd / 3;

        // Условия
        if (odd) {
            System.out.println("Нечетное");
        } else {
            System.out.println("Четное");
        }

        switch (n) {
            case 0: 
                     
                break;
            case 2: 
                
                break;
            default:
                break;
        }

        // Циклы while do for
        while (n < 5) {
            n++;
        }

        do {
            n++;
        } while (n<10);

        for (int i = 0; i < 5; n++) {
            if(n== 25) break;
        }
        System.out.println(n);
        Scanner scanner = new Scanner(System.in);
        try {
            n = scanner.nextInt();    
        } catch (InputMismatchException e) {
            System.out.println("Ошибка");
        }
        System.out.println(n);
    }   
}

