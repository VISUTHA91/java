class Book extends demo implements Runnable
{
     public void run()
    {
        for(int i=0;i<5;i++)
        {
        System.out.println("UpdateData Called");
        try{
            Thread.sleep(3000);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void  hello(){
        System.out.println("Hello Method Called");
    }
}
class demo
{
    public void demoMethod()
    {
        System.out.println("Demo Method Called");
    }
}
interface demo1
{
    void hello();  
}



public class threadsample1 {
    public static void main(String[] args) {
        Book b = new Book();
        Thread t= new Thread(b);
        t.start();
        b.demoMethod();
        b.hello();

    }
    
}
