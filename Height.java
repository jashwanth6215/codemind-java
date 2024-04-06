import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scr=new Scanner(System.in);
        int x=scr.nextInt();
        int y=scr.nextInt();
        if (x > y) 
        {
            System.out.println(x);
        } 
        else 
        {
            System.out.println(y);
        }
    }
}
