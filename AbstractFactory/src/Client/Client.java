package Client;

import AbstractFactory.FurnitureFactory;
import AbstractProduct.Chair;
import AbstractProduct.Table;

public class Client {

	private Table table;
	private Chair chair;
	
	public Client(FurnitureFactory furniture) {
		table = furniture.createTable();
		chair = furniture.createChair();
	}
	
}
