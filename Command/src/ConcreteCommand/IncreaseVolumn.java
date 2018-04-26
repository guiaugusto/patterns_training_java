package ConcreteCommand;

import Receiver.Volumn;

public class IncreaseVolumn implements Command.VolumnCommand{

	private Volumn volumn;
	
	public IncreaseVolumn(Volumn volumn) {
		this.volumn = volumn;
	}
	
	public void execute() {
		volumn.volumnUp();
	}
	
}
