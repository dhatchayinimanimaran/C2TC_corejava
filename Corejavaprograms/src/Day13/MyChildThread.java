package Day13;

public class MyChildThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@Override
		public void run() {
			System.out.println("In side run() Thread is alive or not? " + this.isAlive());
			int no = 0;
			while (no < 4) {
				no++;
				System.out.println("number = " + no);
				try {
					sleep(500);

				} catch (InterruptedException exp) {
					System.err.println("Thread Interrupted ...");
				}
			}

	}

}
