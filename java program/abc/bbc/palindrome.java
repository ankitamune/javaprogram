import java.util.Scanner;
public class palindrome{
    public static void main (String args[]){
        int sum=0 , r , temp,n;
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        n = scanner.nextInt();
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }


    }
}