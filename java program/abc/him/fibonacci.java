import java.util.Scanner;
public class fibonacci{
    public static void main (String args[]){
        int n ,f1=0,f2=1,temp;
        System.out.println("Enter how may fibonnaci numbers to print");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("The first " + n + " Fibonacci numbers are: ");
        System.out.print(f1 + " " + f2);

        for(int i=0;i<n;i++){
            if(i<=1){
                temp=i;
            }
            else{
                temp=f1+f2;
                f1=f2;
                f2=temp;
            }
            

        }
        System.out.println(""+temp);
    }
}