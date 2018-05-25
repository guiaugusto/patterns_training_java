package ConcreteFactory;

import AbstractFactory.FurnitureFactory;
import AbstractProduct.Chair;
import AbstractProduct.Table;
import Product.GlassTable;
import Product.WoodChair;

public class FactoryB implements FurnitureFactory {

	public Table createTable() {
		return new GlassTable();
	}
	
	public Chair createChair() {
		return new WoodChair();
	}
	
}
