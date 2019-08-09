import java.util.Date;

class ThreadA extends Thread{
	//Setting thread name
	public void ThreadName(String name) {
		super.setName(name);		
	}
	
	public void run() {
		//Default when thread is called it will go to run function
		while(true) {
			Date currentDate = new Date();
			System.out.println(currentDate);
			currentDate=null;
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ThreadB implements Runnable{
	//Not a Thread instead it is a runnable object, still needs another thread to run
	//Common practice but not always the best
	@Override
	public void run() {
		while(true) {
			Date currentDate = new Date();
			System.out.println(currentDate);
			currentDate=null;
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class MyThread {
	public static void main(String[] args) {
		//Thread threadA = new ThreadA();
		//threadA.start();
		
		ThreadB threadB = new ThreadB();
		Thread actualThread = new Thread(threadB);
		actualThread.setPriority(10); //To set thread priority int from 1-10 (10 being the max)
		actualThread.setPriority(Thread.MAX_PRIORITY);//setPriority just suggest/recommends priority
		actualThread.start();
	}
}
