
public class Demo1 {
	public static void main(String[] args) {
//		Thread t1 = new worker();
//		t1.start();
//		
//		Thread t2 = new worker();
//		t2.start();
		
		Thread t3 = new Thread(new worker1());
		t3.start();
		
		
		
//		for(;;) {
//			System.out.println(Thread.currentThread());
//		}
	}
}
//Runnable interface
	class worker1 implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(Thread.currentThread().toString() + i);
			}
			
		}

}
//Thread class
class worker extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(Thread.currentThread().toString() + i);
		}
		
	}
}
					
