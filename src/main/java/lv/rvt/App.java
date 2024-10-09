package lv.rvt;
import java.util.Scanner;
public class App
{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write numbers:");
    int beg = Integer.valueOf(scanner.nextLine());
    int ends = Integer.valueOf(scanner.nextLine());
    divisibleByThreeInRange(beg, ends);
}
public static void divisibleByThreeInRange(int beginning, int end){
for(int number = beginning; number <= end;number++){
    if (number % 3 == 0){
        System.out.println(number);
    }
}
}
}






