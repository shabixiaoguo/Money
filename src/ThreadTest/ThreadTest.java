package ThreadTest;

public class ThreadTest extends Thread{
	Thread thread = new Thread();
	Integer count = 10;
		public void run(){
			while(true){
				System.out.println("第"+count+"次线程启动了      ");
				if(--count == 0){
					break;
				}
			}
			
			
		}
		
		
		public static void main(String[] args) {
			ThreadTest tt = new ThreadTest();
			tt.start();
		}

}
