package assignment;

public class Simulator {
	public static void main(String args[]) {
		NOT gate1 = new NOT();
		NOT gate2 = new NOT();
		NOT gate3 = new NOT();
		Displayer disp = new Displayer();
		gate1.setOutputPort(gate2.getInputPort(0));//here we are telling that the output of gate1 should go to the input of gate2
		gate2.setOutputPort(gate3.getInputPort(0));
		gate3.setOutputPort(disp.getInputPort());
		Port trigger = gate1.getInputPort(0);
		trigger.sendData(1);
	}
}
