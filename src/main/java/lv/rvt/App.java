package lv.rvt;
import java.util.Scanner;
public class App
{
    public static void main(String[]args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give numbers:");
    int summa = 0;
    int result = 0;
    double vid = 0;
    int odd = 0;
    int even = 0;
    while(true){
        int numbers = Integer.valueOf(scanner.nextLine());
        if (numbers == -1){
            System.out.println("Thx! Bye!");
            System.out.println("Sum: " + summa);
            System.out.println("Numbers: " + result);
            System.out.println("Average: " + (double)summa/result);
            System.out.println("Even: "+ even);
            System.out.println("Odd: " + odd);
            break;
        }
        summa += numbers;
        result = result + 1;
        if(numbers % 2 == 0){
            even ++;
        }
        else{
            odd ++;
        }
    }   
    
}
}

 






