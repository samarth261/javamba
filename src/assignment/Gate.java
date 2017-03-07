package assignment;

import java.util.ArrayList;

abstract public class Gate {
	// all the other gats need to be extended from this
	Port outputPort;
	ArrayList<Port> port;
	// Array list is being used as it is a variable length array 
	//Refer/lookup collection class in java

	public void addInputPort(Port p) {
		port.add(p);
	}

	public Port getInputPort(int n) {
		if (n > port.size())
			return null;
		return port.get(n);
	}

	public void setOutputPort(Port p) {
		outputPort = p;
	}

	abstract public void onInputGiven();
	
	Gate(){
		port = new ArrayList<Port>();
	}
}