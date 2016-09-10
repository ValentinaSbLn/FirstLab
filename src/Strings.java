/*Назовем открывающим тегом строку <x>, где x — любая строчная буква латинского алфивита. Каждому открывающему тегу соответствует закрывающий тег вида
</x> , где x — та же самая буква.

Теги могут вкладываться друг в друга: в этому случае одна пара из открывающего и закрывающего тега находится внутри другой пары.
Определим понятие XML-текста:
пустая строка — это XML-текст
если s — это XML-текст, то s' = <a> + s + </a> — тоже XML-текст, где a — любая строчная буква латинского алфавита
если s1, s2 — это XML-тексты, то s1 + s2 — тоже XML-текст

Вам дан XML-текст (гарантируется, что он корректен), ваша задача — вывести его в формате:
каждый тег (как открывающий, так и закрывающий) находится на отдельной строке
перед тегом выводится 2*h пробелов, где h — уровень вложенности тега.
Входные данные
Входные данные состоят из единственной строки — XML-текста, его длина не превосходит 1000 символов. Гарантируется корректность этого текста.

Выходные данные
Выведите данный XML-текст в соответствии с описанными выше правилами.
*/
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        ArrayList<String> aStr=new ArrayList();

        Scanner in = new Scanner(System.in);
        String srRead=in.nextLine();
        if (srRead.length()==0){
            System.out.println();
            exit(0);
        }
        while (srRead.length()!=0){

            int k = srRead.indexOf(">");
            aStr.add(srRead.substring(0, k + 1));
            srRead = srRead.substring(k + 1, srRead.length());
        }

        int h=0;
        String probel="";

        System.out.println(aStr.get(0));
        for (int j=1; j<aStr.size(); j++) {
            if (aStr.get(j).charAt(1) == '/'){
                if (aStr.get(j).charAt(2) != aStr.get(j-1).charAt((aStr.get(j-1).length())-2))
                    h -= 1;
            }
            else h += 1;
            if (aStr.get(j-1).charAt(1) == '/'&&aStr.get(j).charAt(1) != '/'){

                //if (aStr.get(j-1).charAt(2) != aStr.get(j).charAt(aStr.get(j).length()-2))
                h -= 1;
            }
            for (int m = 0; m < 2 * h; m++) {
                probel += " ";
            }
            System.out.println(probel + aStr.get(j));
            probel= "";
        }

    }
}

