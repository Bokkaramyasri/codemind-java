import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x=x1+y1;
        int y=x2+y2;
        if(x<y)
        {
            System.out.println(x);
        }
        else
        System.out.println(y);
    }
}