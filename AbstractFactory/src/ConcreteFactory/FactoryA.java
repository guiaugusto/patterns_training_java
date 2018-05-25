package ConcreteFactory;

import AbstractFactory.FurnitureFactory;
import AbstractProduct.Chair;
import AbstractProduct.Table;
import Product.FoldingTable;
import Product.IronChair;

public class FactoryA implements FurnitureFactory {
	
	public Table createTable() {
		return new FoldingTable();
	}
	
	public Chair createChair() {
		return new IronChair();
	}
	
}
