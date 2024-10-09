import java.util.*;

public class HCF_of_two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        // your code here
        int temp;
        while(b > 0){
        temp = b;
        b=a % b;
        a=temp;
        }
        System.out.println(a); 
        
    }
}