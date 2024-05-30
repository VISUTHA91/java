class Book extends Thread
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
}
class User extends Thread
{
    public void run(){
        for(int i=0;i<5;i++){
        System.out.println("Display Called ");
        try{
            Thread.sleep(2000);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
public class threadsample {
    public static void main(String[] args) {
        Book b = new Book();
        User u = new User();
        // b.updateData();
        b.start();
        u.start();        
    }
    
}
