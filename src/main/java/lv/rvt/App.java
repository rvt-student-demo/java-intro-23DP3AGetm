package lv.rvt;
import java.util.Scanner;
public class App
{
    public static void main(String[]args)
    {
           Scanner scanner = new Scanner(System.in);
           while(true){
                System.out.println("Shall we carry on?");
                String input = scanner.nextLine();
                if (input.equals("no")){
                    break;
                }
               
            }
            
        }
}
 






