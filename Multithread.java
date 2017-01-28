package kalekem;

public class Multithread {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new A());	
		Thread t2 = new Thread(new B());
		t1.start();
		t2.start();
		
	
		System.out.println("t1 is alive: "+t1.isAlive());
		System.out.println("ti status: "+t1.getState());
		System.out.println(" t2 is alive: "+t2.isAlive());
		System.out.println(" t2 status: "+t2.getState());
		
	}
}

class A implements Runnable {
	public void show(){
		for(int i=1; i<5; i++){
			System.out.println("Hi");
			try {
				Thread.sleep(100);;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
	}
	
	public void run(){
		show();
	}
}

class B implements Runnable{
	public void showMe(){
		for(int i=1; i<5; i++){
			System.out.println("Hello");
		}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	public void run(){
		showMe();
	}
}


