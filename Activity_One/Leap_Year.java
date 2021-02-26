import java.util.Scanner;
public class Leap_Year{
    static void leap(int year){
        
        if (year<= 0) {
            System.out.println("Invalid input");
        } else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("yes");
        else
            System.out.println("no");
    }
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
           int year;
           System.out.println("Enter the year");
        year = sc.nextInt();
        leap(year);
        
    }
}