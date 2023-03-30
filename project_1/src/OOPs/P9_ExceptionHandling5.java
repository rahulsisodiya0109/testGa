package OOPs;

public class P9_ExceptionHandling5 {

	public static void main(String[] args) throws InterruptedException {
		doStuff();
	}

	public static void doStuff() throws InterruptedException {
		doMoreStuff();
	}

	public static void doMoreStuff() throws InterruptedException {
		Thread.sleep(1000);
	}

	// there are two ways to handle either by try and catch block or by throws
	// interruptedException will delegated Exception to it's calling function to handle the exception and atlast compile will handle it
}
