import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Valentina on 10.09.2016.
 */
/*Дан текст, состоящий только из маленьких латинских букв и запятых. Последовательность подряд идущих букв, окруженную запятыми (началом, концом строки), назовем словом. Слово может быть пустым.
Ваша задача — удалить из текста все слова короче k символов.
Входные данные
Первая строка входных данных — это текст, состоящий только из строчных латинских букв и запятых. Его длина не превосходит 1000 символов. На второй строке находится единственное число k — минимальная допустимая длина слова (0 ≤ k ≤ 1000).
Выходные данные
Выведите текст в таком же формате, как он задан — слова следует разделять запятыми.
*/
public class Parts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String srRead=in.nextLine();
        int count=in.nextInt();
        String arrStr[]=srRead.split(",");
        ArrayList<String> finStr=new ArrayList<String>();
        for (int i=0; i<arrStr.length; i++){
            if (arrStr[i].length()>=count)
                finStr.add(arrStr[i]);
        }
        String finString;
        if(finStr.size()!=0){
            finString=finStr.get(0);
            for (int j=1; j<finStr.size(); j++) {
                finString=finString+","+finStr.get(j);
            }

        }
        else finString="";
        if (count==0){
            finString= srRead;
        }
        System.out.println(finString);
    }
}
