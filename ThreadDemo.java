public class ThreadDemo{
public static void main(String[]args) throws InterruptedException
{
AscThread t1=new AscThread();
t1.setName("ASC");
t1.start();

//System.out.println(Thread.currentThread().getState());
Thread.sleep(3000);

DscThread r1=new DscThread();
Thread t2 = new Thread(r1);
t2.setName("DSC");
t2.start();
System.out.println(Thread.currentThread().getState());
}
}
class AscThread extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getName());//
System.out.println(Thread.currentThread().getState());//
for(int i=1; i<=10; i++)
{
System.out.println(Thread.currentThread().getName()+i);
}
}
}

class DscThread implements Runnable
{
public void run()
{
System.out.println(Thread.currentThread().getName());//
System.out.println(Thread.currentThread().getState());//
for(int i=10; i>=1; i--)
{
System.out.println(Thread.currentThread().getName()+i);
}
}
}
