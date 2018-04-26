package ConcreteCommand;

import Receiver.Volumn;

public class DecreaseVolumn implements Command.VolumnCommand{
	
	private Volumn volumn;
	
	public DecreaseVolumn(Volumn volumn) {
		this.volumn = volumn;
	}
	
	public void execute() {
		volumn.volumnDown();
	}
}
