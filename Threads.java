package kalekem;

class HelloWorld extends Thread{
	public void run(){
		//int count =0;
		for(int i=0; i<100; i++){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(i+ " ");
		}
	}
}
public class Threads {
	public static void main(String[] args) {
		
		Thread count = new Thread(new HelloWorld());
		count.start();
	
	}

}
