public class Thread2 implements Runnable
{
public void run(){
System.out.println("Now the thread is running...");  }
public static void main(String argvs[]) {
	Thread2 t1 = new Thread2();
	Thread th1 = new Thread(t1, "My new thread");
	th1.start();
     String str = th1.getName();
	 System.out.println(str);
	}}

