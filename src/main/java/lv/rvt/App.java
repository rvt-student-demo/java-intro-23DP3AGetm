package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tank capacity: ");
        int capacity = scanner.nextInt();
        System.out.println("Gage reading: ");
        int Gage = scanner.nextInt();
        System.out.println("Miles per gallon: ");
        int Miles = scanner.nextInt();
        int distance = Gage * Miles;
        if (distance>=200){
            System.out.println("Get Gas!");
        }else{
            System.out.println("Safe to Proceed!");
        }
    }

        
}



