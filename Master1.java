package reviews;

class Worker1 extends Thread{
	public void run(){
		System.out.println("Worker");
		System.out.println("At the library");
		System.out.println("And IBS");
		System.out.println("Also a student");
		System.out.println();
		
		for(int i=0; i<10; i++){
			System.out.print(i+ " ");
		}
	}
	
}
public class Master1 {
	public static void main(String[] args) {
	
		//Worker1 runner = new Worker1();
		Runnable runner = new Worker1();
		runner.run();
		System.out.println("Main");
	}

}
