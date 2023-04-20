
class A
{
    int hindi = 89;
}
class B extends A
{
    int english = 79;
}
class C extends B
{
   int  math =76;
}
class D extends 
    int science = 96;
}
class E extends D
{
    int drowing = 90;
}
class inheritance
{
    public static void main(String[] args)
   {
     E r=new E();
     double avg=(r.hindi+r.english+r.math+r.science+r.drowing)/5;
     System.out.println("average"+avg);
}
}