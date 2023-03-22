import java.util.Scanner;
class angle
{
   public static void main(String arg[])
{
   int a,b,area;
   System.out.println("Enter the value length and base");
   Scanner rec=new Scanner(System.in);
   a=rec.nextInt();
   b=rec.nextInt();
   area=(a*b)/2; 
   
   System.out.println(area);

}


}