import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int r=4*x;
        if(r<=1000)
        {
            System.out.printf("YES");
        }
        else
        {
            System.out.printf("NO");   
        }
    }
}