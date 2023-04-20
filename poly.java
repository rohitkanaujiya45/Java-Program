class poly
{
    void add()
    {
        int a=17,b=15,c;
        c=a+b;
        System.out.println(c);
    }
    void add(int x,int y)
    {
        int c;
        c=x+y;
        System.out.println(c);
    }
    void add(int x, double y)
    {
        double c;
        c=x+y;
        System.out.println(c);
    }
       public static void main(String [] args)
       {
       poly r=new poly();
       r.add();
       r.add(8,9);
       r.add(25,26.45);
       
       }
 }