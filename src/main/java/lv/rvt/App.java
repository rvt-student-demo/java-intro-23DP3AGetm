package lv.rvt;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
public class App 
{
    public static void main(String[] args) {
        Counter count = new Counter(15);
        
        count.increase();
        System.out.println(count);
        count.increase(10);
        System.out.println(count);
        count.increase(-10);
        System.out.println(count);
        count.decrease();
        System.out.println(count);
        count.decrease(11);
        System.out.println(count);
        count.decrease(-11);
        System.out.println(count);
    }
}