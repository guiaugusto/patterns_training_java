package Client;

import java.util.Scanner;

import Command.VolumnCommand;
import ConcreteCommand.DecreaseVolumn;
import ConcreteCommand.IncreaseVolumn;
import Invoker.VolumnButton;
import Receiver.Volumn;

public class PressVolumnButton {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		
		Volumn volumn = new Volumn();
		VolumnCommand increaseVolumn = new IncreaseVolumn(volumn);
		VolumnCommand decreaseVolumn = new DecreaseVolumn(volumn);
		
		VolumnButton volumnButton = new VolumnButton();

		scanner = new Scanner(System.in);		
		String command = "";
		
		while(command != "END") {

			command = scanner.nextLine();

			switch(command) {
				case "+":
					volumnButton.storeAndExecute(increaseVolumn);
					break;
				case "-":
					volumnButton.storeAndExecute(decreaseVolumn);
					break;
				default:
					System.err.println("Comando inválido! Argumento ON ou OFF necessários.");
					System.exit(-1);
			}
		}
	}
	
}
