import java.util.*;

public class Palindrome_Checker_For_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
sc.close();
        //Write your code here and print the required output
        int res=0;
        int p=num;
          while(p> 0) {
            int d = p % 10;
            res =res*10+d;
            p = p / 10;
        }
    if(res == num){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

