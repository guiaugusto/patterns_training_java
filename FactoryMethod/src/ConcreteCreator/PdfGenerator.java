package ConcreteCreator;

import ConcreteProduct.PdfFile;
import Product.DocumentFile;

public class PdfGenerator {

	public DocumentFile createDocument() {
		return new PdfFile();
	}
	
}
