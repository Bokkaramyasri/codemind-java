import java.util.Scanner;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int c=0;
        for(int i=1; i<x;i++)
        {
            for(int j=0; j<x; j++)
            {
              if(i+j==x  && i%2==0 && j%2==0)  
                   {
                       c++;
                       break;
                   }
        
            }
        }
        if(c==0)
        {
            System.out.print("NO");
        }
        else
        {
            System.out.print("YES");
        }
    }
}