package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String input;
        int greatest = Integer.MIN_VALUE;
        System.out.println("Ievadit skaitļi: ");
        input = scanner.nextLine();
        String[] numbers = input.split(" ");
        for (String num:numbers){
            int number = Integer.parseInt(num);
            if (number == -1) {
                break;
            }
            if (number>greatest){
                greatest = number;
            }
        }
        System.out.println("The greatest number: " + greatest);
    }
}

