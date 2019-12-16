package ThreadTest;

public class RunnableTest extends Object implements Runnable{
	

	@Override
	public void run() {
		System.out.println("================");
		RunnableTest rt = new RunnableTest();
	
		
		Thread thread = new Thread(rt);
		
		thread.start();
	}
	
	public static void main(String[] args) {
		RunnableTest skr = new RunnableTest();
		skr.run();

	}

}
