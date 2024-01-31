import java.util.Scanner;
public class Main{
    public static void main(String aargs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=sc.nextInt();
        int sum=2*(n+m);
        int r=sum*x;
        System.out.println(r);
    }
}