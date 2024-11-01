package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class App 
{

    public static void main(String[] args) 
    {
    //    Random random = new Random();
    //    int[]numbers = new int[10];
    //    for(int i = 0; i<numbers.length;i++){
    //     numbers[i] = random.nextInt(10);
    //    }
    //    for(int num : numbers){
    //     System.out.println(num);
    //    }
    //    int min = numbers[0];
    //    int max = numbers[0];
    //    int sum = 0;
    //    for(int num : numbers){
    //     if(num < min){
    //         min = num;
    //     }
    //     if(num > max){
    //         max = num; 
    // }
    //    }
    //    double avarage = (double) sum/numbers.length;
    //    for(int num : numbers){
    //     System.out.println(num);
    //    }
    //    System.out.println("Max: " + max);
    //    System.out.println("Min: " + min);
    //    System.out.println("Avarage: " + avarage);


        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> years = new ArrayList<>();
        System.out.println("Enter name and birthday: ");
        while (true) {
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            String[] parts = input.split(", ");
            String name = parts[0];
            int year = Integer.valueOf(parts[1]);
            names.add(name);
            years.add(year);
        }
        String longname = "";
        int TotalYears = 0;
        for(String name : names){
            if (name.length()>longname.length()){
                longname = name;
            }
        }
        for(int year : years){
            TotalYears += year; 
        }
        double avarageYear = (double) TotalYears / years.size();
        System.out.println("Longest name: " + longname);
        System.out.println("Avarage of the birth years: " + avarageYear);
    }

}



