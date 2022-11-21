/**
 * smn
 */
import java.util.Scanner;
public class smn {
    public static void main(String[] args) {
        boolean fl = true && false;
        boolean fl1 = 123 <= 234; // true
        boolean fl2 = 123 >= 234; // false
        System.out.println(fl2 ^ fl1); // раздел. дизъюнкция, возвращает true только когда лишь 1 из значений true
        String s = "lol";
        float e = 2.8f; // Обязательно
        int antidb = 28;
        double ntidb = antidb;
        double db = 0.28;
        char ch = 321; // При письме цифр без скобок, в данном случае цифровое значение будет являться кодом символа
        System.out.println("hi bob");
        System.out.println("hi ron");
        System.out.print(
            ntidb + " - " + db + " = ");
        System.out.print(ntidb - db);
        System.out.println(ch);
        var hm = 123; // Неявный тип данных var
        String ss = "xyzzy";
        System.out.println(ss.charAt(1));
        int mm = --hm - hm--;
        boolean bb = ss.length() >= 6 & ss.charAt(0) == 'x'; // при одиночном амперсанде, перед выводом всегда проверяются ВСЕ условия. при двойном, если одно условие false, проверка останавливается. при "||", если одно условие true, проверка останавливается
        // Приоритет инкремента\декремента (++\--) в окончании переменной ниже, чем обычный вывод данных
        System.out.println(mm);
        System.out.println(bb);

        int[] arr = new int[10]; //{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int ber = 0;
        arr[3] = 13;
        System.out.println(arr[3]);
        // Многомерный
        int[] ray[] =  new int[3] [5];
        for (int[] line : ray) {
            for (int item : line) {
                item = ber;
                ber++;
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
        // Более подробно, в стиле c#
        int[] roy[] =  new int[3] [5];
        for (int i = 0; i < roy.length; i++) {
            for (int j = 0, num = 0; j < roy[i].length; j++) {
                roy[i][j] = num;
                num++;
                System.out.printf("%d ", roy[i][j]);
            }
            System.out.println();
    }
    System.out.println("\n");
    // Наконец-то взаимодействие
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("name: ");
    String name = iScanner.nextLine();
    System.out.println("Привiт, " + name);
    iScanner.close();

    int bd = (int)db;
    System.out.println(bd);
}
}