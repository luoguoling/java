public class TestThread3{
	public static void main(String[] args){
		MyThread1 m1 = new MyThread1();
		MyThread2 m2 = new MyThread2();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		t1.setPriority(Thread.NORM_PRIORITY + 3);
		t1.start();
		t2.start();
		System.out.println("t1线程的优先级是：" + t1.getPriority());
	
	}
}
class MyThread1 implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Mythread1: " +i);
		}
	}
	
}
class MyThread2 implements Runnable{
	public void run(){
		for (int j=0;j<10;j++){
			System.out.println("Mythread2: " +j);
		}
	}
}
