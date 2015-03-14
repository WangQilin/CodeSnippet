package JavaMultithreading;

class RunnableIns implements Runnable {
	private Thread t;
	private String name;
	
	public RunnableIns(String name) {
		this.name = name;
		System.out.println("[info] Creating: " + this.name);
	}
	
	@Override
	public void run() {
		System.out.println("[info] Running: " + this.name);
		
		for (int i=0; i<10; i++) {
			System.out.println("[info] Thread " + this.name + " has waited for " + i + " times");
			try {
				// timed wait
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("[info] Thread " + name + " is terminating");
	}
	
	public void start() {
		System.out.println("[info] Starting: " + this.name);
		
		if (t == null) {
			// Thread(Runnable target, String name)
			t = new Thread(this, name);
			t.start();
		}
	}
}


public class JavaMultithreading {

	public static void main(String[] args) {
		RunnableIns r1 = new RunnableIns("thread-1");
		r1.start();
		
		RunnableIns r2 = new RunnableIns("thread-2");
		r2.start();
	}

}
