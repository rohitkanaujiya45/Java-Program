class ternary
{
    public static void main(String arg[])
    {
        int a=40,b=28,c=16,Max;
        Max=(a>b)?(a<c?a:c):(b>c?b:c);
        System.out.println(Max);
    }
}