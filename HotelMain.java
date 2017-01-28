package kalekem;

public class HotelMain {

	public static void main(String[] args) {
		Thread nyama = new Thread(new NyamaChoma());
		Thread h2 = new Thread(new NyamaChoma());
		
		nyama.start();
		h2.start();

	}

}
