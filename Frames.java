import java.util.Scanner;
public class main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=sc.nextInt();
        System.out.print((2*(n+m))*x);
    }
}