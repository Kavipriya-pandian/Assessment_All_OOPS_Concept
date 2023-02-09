package DXC;
public class Tester
{

	
	
	public static void main(String[] args) 
	{
		
		EPayWallet e=new EPayWallet(201,"Jill","jill@dxc.com",3000);
		User u=new User(101,"Jack","jack@dxc.com",1000);
	
		KYCUser k=new KYCUser(201,"Jill","jill@dxc.com",3000);
		//u.makePayment(700);
		//k.makePayment(1500);
		//k.makePayment(800);
		//k.makePayment(1200);
		e.processPaymentByUser(u, 700);
		e.processPaymentByUser(k, 1500);
		
		
		
		

	}

}
