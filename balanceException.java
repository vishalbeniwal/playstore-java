
@SuppressWarnings("serial")
//To invoke if balance is insufficient for purchase
//Extending Exception class
class BalanceException extends Exception {
	
	private String reason;
	private double availFund;
	
	//Getter method
	public String getReason() { 
		
		return reason + "\n" + "Available fund is " + availFund; 
	}
	
	
	public double availFund() { 
		
		return availFund;	
	}
	
	//Declaring constructor
	public BalanceException(String reason) {
		
		super(reason);
		this.reason = reason;	
	}
	
	
	public BalanceException(String reason, double availFund) {
			
		this.reason = reason;
		this.availFund = availFund;
	}
}