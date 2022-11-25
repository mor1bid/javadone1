import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class dz {
    public static void main(String[] args) {
        Scanner work = new Scanner(System.in);
        // System.out.println("1. Введите число: ");
        // String input = work.nextLine();
        // int num = Integer.parseInt(input);
        // long tri = 1, fac = 1;
        // for (int i = 2; i <= num; i++) {
        //     tri += i;
        //     fac *= i;
        // }
        // System.out.println("Треугольное число " + num + ": " + tri);
        // if (num < 0) {
        //     System.out.println("Факториала отрицательного целого числа не существует.");
        // }
        // else {
        // System.out.println("Факториал числа " + num + ": " + fac + "\n2.");
        // }

        // for (int i = 1; i <= 1000; i++) {
        //     System.out.print(i + " \t");
        // }
		// System.out.println("\n3. Калькулятор! \nДоступные арифметические действия: сложение (+), вычитание (-), умножение (*), деление (/) \nВведите первый аргумент: ");
		// String arg1 = work.nextLine();
		// int numa = 0, numb = 0;
		// if (arg1.chars().allMatch(Character::isDigit)) { numa = Integer.parseInt(arg1); }
		// else System.out.println("Заданный аргумент не является числом!");
		// System.out.println("Укажите желаемое действие: ");
		// String opera = work.nextLine();
		// System.out.println("Введите второй аргумент: ");
		// String arg2 = work.nextLine();

		// if (arg1.chars().allMatch(Character::isDigit)) { numb = Integer.parseInt(arg2); }
		// else System.out.println("Заданный аргумент не является числом!");

		// if (opera.equals("+")) { int res = numa + numb; System.out.println("Ответ: " + res); }
		// else if (opera.equals("-")) { int res = numa - numb; System.out.println("Ответ: " + res); }
		// else if (opera.equals("*")) { int res = numa * numb; System.out.println("Ответ: " + res); }
		// else if (opera.equals("/")) { int res = numa / numb; System.out.println("Ответ: " + res); }
		// else System.out.println("ошибка");

        System.out.println("4. Введите ваш запрос через пробел, по формуле (a + b = c; a, b, c >= 0)");
        String quest = work.nextLine();
        // String quest = "2? + 5? = 69";
        String[] arq = quest.split(" ");
        int arqsi = arq.length;
        int goal = Integer.parseInt(arq[arqsi-1]);
        int arg1part = 0;
        int arg2part = 0;
        int a1temp = 0;
        int a2temp = 0;
        String arg1 = arq[0];
        String arg2 = arq[2];
        String arg01 = arg1.replace("?", "");
        String arg02 = arg2.replace("?", "");
        for (int i = 0; i < 20; i++) {
            int randnum = ThreadLocalRandom.current().nextInt(0, 10);
            arg1part = randnum;
            String arg01part = String.valueOf(arg1part);
            String arg11 = arg01 + arg01part;
            int arg111 = Integer.parseInt(arg11);
            arg2part = randnum;
            String arg02part = String.valueOf(arg2part);
            String arg22 = arg02part + arg02;
            int arg222 = Integer.parseInt(arg22);
            int argsum = arg111 + arg222;
            if (arg111 != a1temp && arg222 != a2temp) 
            {
                // System.out.println(arg111 + " + " + arg222 + " = " + argsum);
                if (argsum == goal) 
                {
                    System.out.println(arg111 + " + " + arg222 + " = " + argsum);
                    a1temp = arg111;
                    a2temp = arg222;
                }
            }
        }

		work.close();
		}
    }
