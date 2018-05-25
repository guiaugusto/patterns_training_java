package Client;

import ConcreteCreator.DocxGenerator;
import Product.DocumentFile;

public class main {

	public static void main(String[] args) {
		
		DocxGenerator docxfile = new DocxGenerator();
		
		DocumentFile document = docxfile.createDocument();
		document.open();
		document.close();
		
	}

}
