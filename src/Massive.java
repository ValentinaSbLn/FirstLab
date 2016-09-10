

/**
 * Created by Valentina on 10.09.2016.
 */

/*Задан массив из n целых чисел (a1, a2,..., an). Каждое число равно или 0, или 1, или 2, или 3, или 4. Ваша задача — подсчитать сколько каких чисел встречается в массиве.
Входные данные
В первой строке входного файла дано число n (1 ≤ n ≤ 100) — количество чисел в массиве. Во второй строке через пробел записаны числа a1, a2,..., an (0 ≤ ai ≤ 4).
Выходные данные Выведите в выходной файл все пары вида (x, cntx), где x — значение, cntx — сколько раз оно встречается в массиве. Числа в паре разделяйте пробелом, каждую пару выводите на отдельной строке, причем, пары выводите в порядке возрастания x. Не выводите пару, если cntx равно 0.
*/
import java.util.Scanner;
public class Massive {
    public static void main(String[] args) {
        System.out.print("Введите количество чисел в массиве: ");
        Scanner in = new Scanner(System.in);
        String count=in.nextLine();

        System.out.print("Введите числа массива через пробел: ");
        String numSt=in.nextLine();
        String [] num=(numSt).split(" ");
        int sum=0;
        int countNum[]=new int[5];
        for (int i=0; i<Integer.valueOf(count); i++){
            switch(num[i]) {
                case "0":
                    countNum[0]+=1;
                    break;
                case "1":
                    countNum[1]+=1;
                    break;
                case "2":
                    countNum[2]+=1;
                    break;
                case "3":
                    countNum[3]+=1;
                    break;
                case "4":
                    countNum[4]+=1;
                    break;
                case "5":
                    countNum[5]+=1;
                    break;
            }
        }
        for (int i=0; i<5; i++){
            if (countNum[i]!=0)
            System.out.println(i+" "+countNum[i]);
        }

    }

}
