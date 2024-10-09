import java.util.*;

public class Leap_Year {
    public static void main(String[] args) throws Throwable {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        //Write your code here and print the required output
        if(year%4 ==0 && year % 100 !=0){
            System.out.println(1);
        }
        else if(year % 100 ==0 && year %400 ==0){
            System.out.println(1);
        }else{
            System.out.println(0); // Print 1, if the given year is a leap year or 0 otherwise.
        }
        sc.close();
        
    }
}