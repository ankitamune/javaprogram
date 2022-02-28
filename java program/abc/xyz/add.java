import java.util.Scanner;
public class add{
    public static void main(String args[]){
        int a ,b,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two value ");
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        System.out.println("sum="+sum);
    }
}