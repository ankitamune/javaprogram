import java.util.Scanner;
public class armstrong{
    public static void main(String args[]){
        int n,r,sum=0;
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        n=sc.nextInt();
        n==a;
        
        while(n>0){
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;

        }
        if(a==sum){
            System.out.print("it is armstrong");
        }
        else{
            System.out.print("it is not armstrong");
        }
    }
}