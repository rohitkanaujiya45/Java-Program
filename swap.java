import java.util.Scanner;
class swap
{
    public static void main(String arg[])
    {
        int a,b,temp;
        System.out.println("Enter the value");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("Before swaping"+a+" "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swaping"+a+" "+b);
    }
}