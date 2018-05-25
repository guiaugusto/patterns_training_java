package AbstractFactory;

import AbstractProduct.Chair;
import AbstractProduct.Table;

public interface FurnitureFactory {

	public Table createTable();
	public Chair createChair();
	
}
