package Invoker;

import java.util.ArrayList;
import java.util.List;

import Command.VolumnCommand;

public class VolumnButton {
	
	private List<VolumnCommand> history = new ArrayList<VolumnCommand>();

	public void storeAndExecute(VolumnCommand volumnCommand) {
		this.history.add(volumnCommand);
		volumnCommand.execute();
	}

}
