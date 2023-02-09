package DXC;

public class EPayWallet extends KYCUser
{
	public EPayWallet(int id, String username, String email, double walletBalance) {
		super(id, username, email, walletBalance);
		// TODO Auto-generated constructor stub
	}

	public void processPaymentByUser(User user,double billAmount)
	{
		if(user.makePayment(billAmount))
		{
			System.out.println("Congratulations "+user.getUsername()
			+", payment of Rs."+billAmount+" was successful");
			System.out.println("Your wallet balance is "+user.getWalletBalance());
		}
		else 
		{
			System.out.println("Sorry! "+user.getUsername()
			+" not enough balance to make payment");
			System.out.println("Your wallet balance is "+user.getWalletBalance());
		}
		if(user instanceof KYCUser )
		{
			KYCUser k=(KYCUser)user;
			System.out.println("You have "+k.getRewardPoints()+" reward points");
		}
	}
}
