class Table {
	// method not synchronized
	synchronized void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}
}


class MyThread1 extends Thread {
	Table t;
	MyThread1(Table t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(5);
	}
}

class MyThread2 extends Thread {
	Table t;
	public MyThread2(Table t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(100);
	}
}


public class Thready extends Thread {
	
	public static void main(String[] args) {
		final String resource1 = "ratan";
		final String resource2 = "vimal";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("T1: Locked resource 1");
//					try {Thread.sleep(100);} catch(Exception e) {}
					
					synchronized (resource2) {
						System.out.println("T1: Locked resource 2");
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("T2: Locked resource 2");
					
//					try {Thread.sleep(100);} catch(Exception e) {}
					
					synchronized (resource1) {
						System.out.println("T2: Locked resource 1");
					}
					
				}
			}
		};
		
		t1.start();
		t2.start();
		
		
		
	}

}
