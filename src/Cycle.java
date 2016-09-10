

/**
 * Created by Valentina on 10.09.2016.
 */

/*
Задано n целых чисел. Выведите их сумму.

Входные данные
В первой строке задано целое число n (1 ≤ n ≤ 10000). Вторая строка содержит n целых чисел, каждое от 1 до 10000, включительно.
Выходные данные
Выведите искомую сумму.
*/
import java.util.Scanner;
public class Cycle {
    public static void main(String[] args) {
        System.out.print("Введите количество чисел: ");

        Scanner in = new Scanner(System.in);
        String count=in.nextLine();

        System.out.print("Введите числа через пробел: ");
        String numSt=in.nextLine();
        String [] num=(numSt).split(" ");
        int sum=0;
        for (int i=0; i<Integer.valueOf(count); i++){
            sum+=Integer.valueOf(num[i]);
        }
        System.out.println(sum);
    }

}
