import java.util.Scanner;
class c
{
    public static void main(String arg[])
    {
        int a,b;
        System.out.println("Enter the value");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("Before swaping"+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swaping"+a+" "+b);
    }
}