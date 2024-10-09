import java.util.*;

public class Factorial_with_loop {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
		input.close();
        // Write your code here
        int i=1;
        long factorial=1;
        while(i<=n){
            factorial*=i;
            i++;
        }
        System.out.println(factorial);
    }
}