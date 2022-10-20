class AscThread extends Thread{
public void run(){
for(int i=1;i<=10;i++)
System.out.println(Thread.currentThread().getName()+" "+i);
}
}
public class TD
{
public static void main(String[] args){
AscThread r1=new AscThread();
Thread t1 =new Thread(r1, "ASC");
System.out.println(Thread.currentThread().getName());
System.out.println(Thread.currentThread().getState());
t1.start();
}
}



