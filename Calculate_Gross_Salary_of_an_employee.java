import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float bs=sc.nextFloat();
        float hra=sc.nextFloat();
        float da=sc.nextFloat();
        float pf=(12*bs)/100;
        float gs=bs+pf+hra+da;
        System.out.printf("%.2f
",pf);
        System.out.printf("%.2f",gs);
    }
}