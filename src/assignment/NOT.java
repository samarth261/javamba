package assignment;

public class NOT extends Gate {

	int result;

	/*
	 * @Override public Port getInputPort() { // TODO Auto-generated method stub
	 * return null; }
	 */

	NOT() {
		Port p = new Port() {
			@Override
			void sendData(int i) {
				System.out.println("NOT got "+i);
				switch (i) {
				case 1:
					result = 0;
					break;
				case 0:
					result = 1;
					break;
				}
				onInputGiven();
			}
		};
		this.addInputPort(p);
	}

	@Override
	public void onInputGiven() {
		// TODO Auto-generated method stub
		//System.out.println("NOT got " + result);
		outputPort.sendData(result);
	}
}
