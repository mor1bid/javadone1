import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class dz {
    public static void main(String[] args) {
        Scanner work = new Scanner(System.in);
        System.out.println("1. Введите число: ");
        String input = work.nextLine();
        int num = Integer.parseInt(input);
        long tri = 1, fac = 1;
        for (int i = 2; i <= num; i++) {
            tri += i;
            fac *= i;
        }
        System.out.println("Треугольное число " + num + ": " + tri);
        if (num < 0) {
            System.out.println("Факториала отрицательного целого числа не существует.");
        }
        else {
        System.out.println("Факториал числа " + num + ": " + fac + "\n2.");
        }

        for (int i = 1; i <= 1000; i++) {
            System.out.print(i + " \t");
        }
		System.out.println("\n3. Калькулятор! \nДоступные арифметические действия: сложение (+), вычитание (-), умножение (*), деление (/) \nВведите первый аргумент: ");
		String arga = work.nextLine();
		int numa = 0, numb = 0;
		if (arga.chars().allMatch(Character::isDigit)) { numa = Integer.parseInt(arga); }
		else System.out.println("Заданный аргумент не является числом!");
		System.out.println("Укажите желаемое действие: ");
		String opera = work.nextLine();
		System.out.println("Введите второй аргумент: ");
		String argb = work.nextLine();
		if (arga.chars().allMatch(Character::isDigit)) { numb = Integer.parseInt(argb); }
		else System.out.println("Заданный аргумент не является числом!");

		if (opera.equals("+")) { int res = numa + numb; System.out.println("Ответ: " + res); }
		else if (opera.equals("-")) { int res = numa - numb; System.out.println("Ответ: " + res); }
		else if (opera.equals("*")) { int res = numa * numb; System.out.println("Ответ: " + res); }
		else if (opera.equals("/")) { int res = numa / numb; System.out.println("Ответ: " + res); }
		else System.out.println("ошибка");

        System.out.println("4. Введите ваш запрос через пробел, по формуле (a + b = c; a, b, c >= 0)");
        String quest = work.nextLine();
        // String quest = "2? + ?5 = 69";
        String[] arq = quest.split(" ");
        int co = 0;
        int arqsi = arq.length;
        int goal = Integer.parseInt(arq[arqsi-1]);
        int arg1part = 0;
        int arg2part = 0;
        int a1temp = 0;
        int a2temp = 0;
        String arg1 = arq[0];
        String arg2 = arq[2];
        for (int i = 0; i < 100; i++) {
            int randnum = ThreadLocalRandom.current().nextInt(0, 10);
            arg1part = randnum;
            String arg01part = String.valueOf(arg1part);
            String arg01 = arg1.replace("?", arg01part);
            int arg111 = Integer.parseInt(arg01);
            arg2part = randnum;
            String arg02part = String.valueOf(arg2part);
            String arg02 = arg2.replace("?", arg02part);
            int arg222 = Integer.parseInt(arg02);
            int argsum = arg111 + arg222;
            if (arg111 != a1temp && arg222 != a2temp && argsum == goal) 
                {
                    System.out.println(arg111 + " + " + arg222 + " = " + argsum);
                    a1temp = arg111;
                    a2temp = arg222;
                }
            else co -= 1;
            if (co == -99) System.out.println("По вашему запросу не было найдено правильного ответа.");
        }

		work.close();
		}
    }
