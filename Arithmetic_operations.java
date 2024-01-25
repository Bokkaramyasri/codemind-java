import java.util.Scanner;
public class Main{
    public static void main(String ars[]){
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y= sc.nextInt();
        int s=x+y;
        int d=x-y;
        int p=x*y;
        int q=x%y;
        int r=x/y;
        System.out.println("Sum:"+s);
        System.out.println("Difference:"+d);
        System.out.println("Product:"+p);
        System.out.println("Quotient:"+r);
        System.out.println("Remainder:"+q);
    }
}