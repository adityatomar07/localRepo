import java.time.LocalDate;
import java.util.Scanner;

public class calander {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        System.out.println("Enter the day : ");
        int day = sc.nextInt();
        LocalDate date = LocalDate.ofYearDay(year, day);
        System.out.println("date is : " + date);
    }

}// this program for to find the date with help of year and day
