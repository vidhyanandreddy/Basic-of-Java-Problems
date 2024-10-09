import java.util.*;

public class  Reverse_digits_of_a_Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		//Write your code here
        while(n>0){
            int d=n%10;
            System.out.print(d);
            n=n/10;
        }
        sc.close();
    }
}