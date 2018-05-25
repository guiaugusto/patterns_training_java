package Creator;

import Product.DocumentFile;

public abstract class DocumentGenerator {

	protected DocumentFile document;
	
	abstract DocumentFile createDocument();
	
	public void newDocument(DocumentFile document) {
		this.document = document;
	}
	
	public void openDocument() {
		this.document.open();
	}
	
	public void closeDocument() {
		this.document.close();
	}
}
