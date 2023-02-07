package DXC;

public class KYCUser extends User
{
	
	private int rewardPoints;

	public KYCUser(int id, String username, String email, double walletBalance) 
	{
		super(id, email, email, walletBalance);
		
	}

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	@Override
	public boolean makePayment(double billAmount)
	{
		if(getWalletBalance()>=billAmount)
		{
			setWalletBalance(getWalletBalance()-billAmount);
			setRewardPoints((int) (rewardPoints+(billAmount*10/100)));
			
		} 
		return super.makePayment(billAmount);
		
	}
	

}
