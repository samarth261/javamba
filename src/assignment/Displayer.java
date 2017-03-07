package assignment;

public class Displayer {
	Port input;
	int result = -1;

	Displayer() {
		input = new Port() {
			@Override
			void sendData(int i) {
				result = i;
				onResultChange();
			}
		};
	}

	public void onResultChange() {
		System.out.println("displayer got " + result);
	}

	public Port getInputPort() {
		return input;
	}
}
