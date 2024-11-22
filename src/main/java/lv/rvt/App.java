package lv.rvt;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
public class App 
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<books> books= new ArrayList<>();
        
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new books(title, pages, pages));
        }

        System.out.println("What information will be printed? ");
        String information = scanner.nextLine();

        for (books books2 : books){
            if (information.equals("everything")){
                System.out.println(books2);
            }else if (information.equals("name")){
                System.out.println(books2.getTitle());
            }
        }
    }
}