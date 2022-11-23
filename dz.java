import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

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
		String arg1 = work.nextLine();
		int numa = 0, numb = 0;
		if (arg1.chars().allMatch(Character::isDigit)) { numa = Integer.parseInt(arg1); }
		else System.out.println("Заданный аргумент не является числом!");
		System.out.println("Укажите желаемое действие: ");
		String opera = work.nextLine();
		System.out.println("Введите второй аргумент: ");
		String arg2 = work.nextLine();

		if (arg1.chars().allMatch(Character::isDigit)) { numb = Integer.parseInt(arg2); }
		else System.out.println("Заданный аргумент не является числом!");

		if (opera.equals("+")) { int res = numa + numb; System.out.println("Ответ: " + res); }
		else if (opera.equals("-")) { int res = numa - numb; System.out.println("Ответ: " + res); }
		else if (opera.equals("*")) { int res = numa * numb; System.out.println("Ответ: " + res); }
		else if (opera.equals("/")) { int res = numa / numb; System.out.println("Ответ: " + res); }
		else System.out.println("ошибка");

	// 	String ask = work.nextLine();
	// 	// ask += "+1";
		work.close();
	// 	String[] mask = ask.split(" ");
	// 	String digray[] = new String[mask.length];
	// 	String dig = "";
	// 	for (int i = 0, j = 0; i < mask.length; i++) {
	// 		if (mask[i].chars().allMatch(Character::isDigit)) {
	// 			dig += mask[i];
	// 		}
	// 		else {
	// 			digray[j] = dig;
	// 			digray[j+1] = mask[i];
	// 			dig = "";
	// 			j++;
	// 		}
	// 	}
	// 	System.out.println(digray[1]);
	// 	int answ = Integer.parseInt(digray[0]);
	// 	int firnum = 0;
	// 	for (int i = 0; i < digray.length - 1; i++) {
	// 		if (digray[i+1].equals("*") || digray[i+1].equals("/")) {
	// 			firnum = Integer.parseInt(digray[i]);
	// 		}
	// 	}
	// 	for (int i = 0; i < digray.length - 1; i++) {
	// 		if (digray[i+1].equals("*")) {
	// 			firnum *= Integer.parseInt(digray[i+2]);
	// 		}
	// 		if (digray[i+1].equals("/")) {
	// 			firnum /= Integer.parseInt(digray[i+2]);
	// 		}
	// 	}
	// 	for (int i = 0; i < digray.length - 1; i++) {
	// 		if (digray[i+1].equals("+")) {
	// 			firnum += Integer.parseInt(digray[i+2]);
	// 		}
	// 		if (digray[i+1].equals("-")) {
	// 			firnum -= Integer.parseInt(digray[i+2]);
	// 		}
	// 	}
	// 	System.out.println(firnum);
		}
    }
