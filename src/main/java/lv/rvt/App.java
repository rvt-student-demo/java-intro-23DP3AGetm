package lv.rvt;
import java.util.Scanner;
public class App
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int Value = Integer.valueOf(scanner.nextInt());
        if(Value>=1000000){
            System.out.println("Tax:" + (142100 +(Value - 1000000) * 0.17));
        }else if(Value>= 200000){
            System.out.println("Tax:" + (22100+(Value - 200000) * 0.15));
        }else if (Value>=55000){
            System.out.println("Tax:" + (47000+(Value - 55000) * 0.12 ));
        }else if (Value>=25000 ){
            System.out.println("Tax:" + (1700+(Value - 25000) * 0.10 ));
        }else if (Value>=5000){
            System.out.println("Tax:" + (100+(Value - 5000) * 0.8 ));
        }else if (Value>=3500){
            System.out.println("No tax!");
        }
}
}
 






