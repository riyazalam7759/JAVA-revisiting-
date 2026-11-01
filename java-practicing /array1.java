import java.util.Scanner;
public class array1
{
    public static void main(String[] args)
    {     
        Scanner sc = new Scanner(System.in);
        int[] a=new int[5];//=> declaration of array 
        System.out.println("the length of the array is :"+a.length);
        System.out.println(a[3]);//=> 0 cause array in java initialize the array during declaration
        a[0]=1;
        a[1]=2;
        a[2]=3;
        for(int i=0;i<a.length;i++)
        {
            if(i>2)
            {
                a[i]=sc.nextInt();//=>assiging value from user 
            }
        }
        System.out.println();
        System.out.println("printing all the elements of the array in one line :");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");//printing all elements in one line 
        }
        System.out.println("printing all the elements in different lines :");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");//printing all the elements of the array a and printing every element in another line  
        }
    }
}