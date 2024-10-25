package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Ievadi skaitļi: ");
        while(true){
            int number = scanner.nextInt();
            if(number == -1){
                break;
            }
            numbers.add(number);
        }
        System.out.println("Search for? ");
        int search = Integer.valueOf(scanner.nextInt());
        for (int i = 0; i < numbers.size(); i++){
            if(numbers.get(i)==search){
                System.out.println(search + " Is at index " + i);
            }
        }
    }
}

