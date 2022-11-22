/**
 * smn
 */

// package "название" - если открыто более 1 каталога

// import java.sql.Date;
// import java.sql.Time;
import java.time.LocalDateTime;
// import java.time.Year;
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
    // Scanner iScanner = new Scanner(System.in);
    // System.out.printf("name: ");
    // String name = iScanner.nextLine();
    // System.out.println("Привiт, " + name);
    // iScanner.close();

    int bd = (int)db;
    System.out.println(bd);

// ---- Семинар
    System.out.println("Hello World");
    System.out.println(LocalDateTime.now());

    Scanner active = new Scanner(System.in);
    System.out.printf("Здравствуйте!, Пожалуйста, введите свой логин:\n");
    String name = active.nextLine();
    System.out.println();
    if (name.equals("xyzzy")) {
        System.out.println("Hi, God"); }
    System.out.println("Вы вошли в систему. Приятной работы, " + name + "!");
    active.close();
    int ho = LocalDateTime.now().getHour();
    int mi = LocalDateTime.now().getMinute();
    System.out.println(ho + " : " + mi);

    if (ho >= 5 && mi >= 0 && ho <= 11 && mi <= 59) {
        System.out.println("Доброе утро, кстати");
    }
    else if (ho >= 12 && mi >= 0 && ho <= 17 && mi <= 59) {
        System.out.println("Добрый день, кстати");
    }
    else if (ho >= 18 && mi >= 0 && ho <= 22 && mi <= 59) {
        System.out.println("Добрый вечер, кстати");
    }
    else if (mi >= 0 && ho <= 4 && mi <= 59) {
        System.out.println("Доброй ночи, кстати");
    }    
    System.out.println("");
    int[] a = {1,1,1,1,0,1,1,1};
    int co = 0;
    int max = 0;
    for(int i = 0; i < a.length; i++) {
        if (a[i] == 1) {
            co++;
        }
        else {
            if (co>max) max = co;
            co = 0;
        }
    }
    System.out.println("Максимальное количество единиц подряд: " + max);

    int[] mass = {3,2,2,3};
    int val = 3;

    int[] fin = new int[mass.length];
    for(int o = 0; o < fin.length; o++) {
        if (mass[o] != val) fin[o] = mass[o];
    }
    for (int d = 0; d < fin.length - 1; d++) { // удаление элемента из массива. ну типа
        fin[d] = fin[d+1];
    }  
    System.out.print('[');
    for(int j = 0; j < fin.length; j++) {
        if (fin[j] == 0) fin[j] = val;

// Решение:
//     for(int y = 0; y < mass.length-1; y++) {
//             if (mass[y] == val) {
//                 for (int x = 0; x<mass.length; x++) {
//                     mass[y] = mass[y+1];
//                 }
//                 mass[mass.length - 1] = val;
//             };

    }
    for(int f = 0; f < fin.length; f++) {
        System.out.print(fin[f] + ",");
    }
    System.out.println("]");
    
    String[] array = {"abscdefg", "abcgkjsdfkl", "bvxhcbdf", "qwerwet", "abc"};
    String value = "abc"; 
    for (int i = 0; i < array.length; i++) {
        if (array[i].substring(0, 3).equals(value)) System.out.println(i);
    }
}
}
