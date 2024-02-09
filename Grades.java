import java.util.Scanner;
public class Main{
 public static void main(String []args){
     Scanner sc =new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     int d=sc.nextInt();
     int e=sc.nextInt();
     int total=a+b+c+d+e;
     double r=total/500.0*100.0;
     if(r>=90)
     {
         System.out.print("Grade A");
     }
     else if(r>=80 && r<90)
     {
         System.out.print("Grade B");
     }
     else if(r>=70 && r<80)
     {
         System.out.print("Grade C");
     }
     else if(r>=60 && r<70)
     {
         System.out.print("Grade D");
     }
     else if(r>=40 && r<60)
     {
         System.out.print("Grade E");
     }
     else
     {
         System.out.println("Grade F");
     }
 }
}