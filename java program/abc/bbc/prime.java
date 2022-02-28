import java.util.Scanner;
public class prime 
{
    public static void main(String args[])
    {
        int i,a=0,n;
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        n=sc.nextInt();
        for( i=2;i<=n-1;i++)
        if (n%i==0){
            a=a+1;

        }
        if(a>0){
            System.out.print("not prime number");
        }
        else{
            System.out.print(" prime number");
        }
    }
}


