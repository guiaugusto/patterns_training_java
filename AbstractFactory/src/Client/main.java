package Client;

import AbstractFactory.FurnitureFactory;
import ConcreteFactory.FactoryA;
import ConcreteFactory.FactoryB;
import Client.Client;

public class main {

	public static void main(String[] args) {
		
		FurnitureFactory factoryA = new FactoryA();
		Client client1 = new Client(factoryA);

		FurnitureFactory factoryB = new FactoryB();
		Client client2 = new Client(factoryB);
		
	}

}
