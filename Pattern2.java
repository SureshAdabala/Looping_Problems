//Enter the Number: 
//6
//1 2 3 4 5 6 
//1 2 3 4 5 6 
//1 2 3 4 5 6 
//1 2 3 4 5 6 
//1 2 3 4 5 6 
//1 2 3 4 5 6 
import java.util.*;
public class Pattern2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                System.out.print(j+" ");
            }System.out.println();
        }
    }
}