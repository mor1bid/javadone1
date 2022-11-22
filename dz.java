import java.util.Scanner;

public class dz {
    public static void main(String[] args) {
    Scanner work = new Scanner(System.in);
    System.out.println("1. Введите число: ");
    String input = work.nextLine();
    int num = Integer.parseInt(input);
    work.close();
    int tri = 1, fac = 1;
    for (int i = 2; i <= num; i++) {
        tri += i;
        fac *= i;
    }
    System.out.println("Треугольное число " + num + ": " + tri);
    if (num < 0) {
        System.out.println("Факториала отрицательного числа не существует.");
    }
    else {
    System.out.println("Факториал числа " + num + ": " + fac);
    }
    }
}
