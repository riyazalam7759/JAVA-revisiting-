//printing factorial of a number 
import  java.util.Scanner;
public class M7L1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter a number :");
        n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact =i*fact;
        }
        System.out.println("the factorial of number " +n +" is: "+fact);
    }
}