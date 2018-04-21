import java.util.List;

public class PaymentByCreditCard implements Payment {
		
	String nameOnCreditCard;
	String numberOfCreditCard;
	short codeCVV;
	String telephone;
	
	// Put the informations for the payment
	public PaymentByCreditCard(String nameOnCreditCard, 
							   String numberOfCreditCard,
							   short codeCVV,
							   String telephone) {
		this.nameOnCreditCard = nameOnCreditCard;
		this.numberOfCreditCard = numberOfCreditCard;
		this.codeCVV = codeCVV;
		this.telephone = telephone;
	}
	
	// Override abstract method to define another way to pay 
	@Override
	public void pay(double amount, List<String> shoppingList) {
		
		System.out.println("Titular do cartão: " + nameOnCreditCard);
		System.out.println("Numero do cartão: " + numberOfCreditCard);
		System.out.println("Telefone de contato: " + telephone);
		
		for(String item : shoppingList) {
			System.out.println(item);
		}
		
		System.out.println("O total foi de " + amount + "reais.");
	}
}
