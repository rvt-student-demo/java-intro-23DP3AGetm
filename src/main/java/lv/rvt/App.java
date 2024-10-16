package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        int sum = 0;
        while(true){
            System.out.println("Ievada skaitļi:");
            int input = scanner.nextInt();
            if(input ==0){
                break;
            }
            number.add(input);
            sum += input;
            }
        System.out.println("Summa:" + sum); 
    }
}

