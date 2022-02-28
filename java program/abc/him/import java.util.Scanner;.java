import java.util.Scanner;
public claass palindrome{
    public claass void main(String args[]){
        int n,r,sum;=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        n=sc.nextInt();
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.print("it is palindrome");
        }
        else{
            System.out.print("it is not palindrome")
        }

    }
}