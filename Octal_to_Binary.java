import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int Q=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<Q; i++)
        {
            String octalNumber = sc.nextLine();
            int decimal=Integer.parseInt(octalNumber,8);
             System.out.println(Integer.toBinaryString(decimal));
        }
    }
}