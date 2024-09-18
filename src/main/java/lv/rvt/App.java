package lv.rvt;
import java.util.Scanner;
public class App 

{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet 1.skaitlis:");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Ievadiet 2.skaitli:");
        int number2 = Integer.valueOf(scanner.nextLine());
        int summa = number1 + number2;
        int starp = number1 - number2;
        int reiz = number1 * number2;
        System.out.println(number1 + "+" + number2 + "=" + summa);
        System.out.println(number1 + "-" + number2 + "=" + starp);
        System.out.println(number1 + "*" + number2 + "=" + reiz);
        double average = (number1 + number2)/2;
        System.out.println("(" + number1 + "+"+number2 + ")/2=" + average);
    }

}
