import java.util.List;

public class PaymentByPagSeguro implements Payment {
	
	String email;
	String token;
	
	public PaymentByPagSeguro (String email, String token) {
		this.email = email;
		this.token = token;
	}
	
	public void pay(double amount, List<String> shoppingList) {
		System.out.println("Email do comprador : " + email);
		
		System.out.println("O total foi de " + amount + "reais.");
	}
	
}
