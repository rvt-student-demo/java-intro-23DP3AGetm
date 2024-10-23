package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter number: ");
        while(true){
            int number = scanner.nextInt();
            if(number == -1){
                break;
            }
            numbers.add(number);
        }
        System.out.println("From where? ");
        int index = scanner.nextInt();
        System.out.println("To where? ");
        int index1 = scanner.nextInt();
        if (index >= 0 && index1 < numbers.size() && index <= index1){
            for(int i = index;i <= index1; i++ ){
                System.out.println(numbers.get(i));
            }
        }
    }
}

