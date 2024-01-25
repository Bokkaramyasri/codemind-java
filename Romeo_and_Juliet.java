import java.util.Scanner;
public class Main{
    public static void main(String rgs[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int a=x*5;
        int b=y*10;
        int r=(a+b)/z;
        System.out.println(r);
    } 
}