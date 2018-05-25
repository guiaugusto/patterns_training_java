package ConcreteCreator;

import ConcreteProduct.DocxFile;
import Product.DocumentFile;

public class DocxGenerator {

	public DocumentFile createDocument() {
		return new DocxFile();
	}
	
}
