import java.util.Scanner;
public class Main{
    public static void main(String rgs[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        byte b=sc.nextByte();
        int r=512*2*t*s*b;
        System.out.println(r);
    }
}