package Day14.interthreadcommunication;

public class Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q obj; 

		public Consumer(Q obj) {
			this.obj = obj;
			start();
		}

		public void run() {
				while (true) {
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					System.out.println(e);
				}
				obj.get();
			}

	}

}
