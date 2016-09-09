public class TestThread4 implements Runnable{
	Timer t = new Timer();
	public static void main(String[] args){
		TestThread4 test = new TestThread4();
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		Thread t3 = new Thread(test);
		t1.start();
		t2.start();
		t3.start();
	}
	public void run(){
		t.add(Thread.currentThread().getName());
	}

	
}
class Timer{
	private static int num = 0;
	public /*synchronized*/ void add(String name){
		synchronized(this){
			num++;
			try{
				Thread.sleep(1);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(name + ":你是第" +num + "个使用timer线程");
		}
		
	}
}
