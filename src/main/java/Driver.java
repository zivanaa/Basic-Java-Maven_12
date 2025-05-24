import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.incrementBy();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrementBy();
		
		System.out.println("Current count:" + counter.getCount());

		counter.multiplyBy();
		
		System.out.println("Current count:" + counter.getCount());
		
	}

}
