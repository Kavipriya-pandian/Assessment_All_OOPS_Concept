package DXC;


	


public class Tester
{

	public static void processPaymentByUser(User user,double billAmount)
	{
		if(user.makePayment(billAmount))
		{
			System.out.println("Congratulations "+user.getUsername()
			+" payment of Rs."+billAmount);
			System.out.println("Your wallet balance is"+user.getWalletBalance());
		}
		else 
		{
			System.out.println("Sorry! "+user.getUsername()
			+" not enough balance to make payment");
			System.out.println("Your wallet balance is"+user.getWalletBalance());
		}
		if(user instanceof KYCUser )
		{
			KYCUser k=(KYCUser)user;
			System.out.println("You have "+k.getRewardPoints()+"reward points");
		}
	}
	
	public static void main(String[] args) 
	{
		
		
		User u=new User(101,"Jack","jack@dxc.com",1000);
	
		KYCUser k=new KYCUser(201,"Jill","jill@dxc.com",3000);
		u.makePayment(700);
		k.makePayment(1500);
		k.makePayment(800);
		k.makePayment(1200);
		
		
		
		

	}

}
