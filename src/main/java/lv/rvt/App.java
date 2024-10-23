package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{

    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);
       ArrayList<String> names = new ArrayList<>();
       while(true){
        System.out.println("Enter name: ");
        String input = scanner.nextLine();
        if(input.isEmpty()){
            break;
        }
        names.add(input);
       }
       System.out.println("In total: " + names.size());
    }
}

