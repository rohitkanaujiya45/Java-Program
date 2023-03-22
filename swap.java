import java.util.Scanner;
class swap
{
public static void main(String arg[])
{
int a,b,temp;
System.out.println("swaping for number");
Scanner r=new Scanner(System.in);
a=r.nextInt();
b=r.nextInt();
System.out.println("before swapping"+a+" "+b);
temp=a;
a=b;
b=temp;
System.out.println("after swaping"+a+" "+b);
}
}