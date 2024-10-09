import java.util.*;
public class Check_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        // your code here
        if(n%2 == 0){
            System.out.println(n+" is not a prime number"); 
        }
        else if(n%2 != 0){
            System.out.println(n+" is a prime number"); 
        }
        
		sc.close();
    }
}