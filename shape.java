class shape
{
    void draw()
    {
        System.out.println("can't say about shape");
    }
}
    class square extends shape
{

    void draw()//overrinding
    {
        super.draw();
        System.out.println("square");
    }
}
    class demo
    {
        public static void main(String [] args)
        {
           shape r=new square();
           r.draw();
        }
    }

