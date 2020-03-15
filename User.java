import java.util.*;

//Creating User class to store user information
public class User {
	
	private String id;
	private String name;
	private String phone;
	private double fund;
	private boolean premium = false;
	private ArrayList<Content> bought;

	//Declaring constructor of the user class
	public User(String uID, String uName, String phone, double fund) {
	
		this.id = uID;
		this.name = uName;
		this.phone = phone;
		this.fund = fund;
		bought = new ArrayList<Content>();
	}
	
	//Declaring another constructor to set the initial fund of the user to 500
	public User(String uID, String uName,String phone) {
		
		this(uID,uName,phone,500.0);
	}

	//Getter and setter method to access private variables
	public String getID() {
		
		return this.id ;	
	}
	
	
	public void setID(String id) {
		
		this.id = id;	
	}
	
	
    public String getName() {
		
		return this.name ;		
	}
	
    
	public void setName(String name) {
		
		this.name = name;
	}
	
	
	public double getFunds() {
		
		return this.fund;
	}
	
	
	public void setFunds(double funds) {
		
		this.fund = funds;
	}
	
	
	public String getPhone() {
		
		return this.phone;
	}
	
	
	//Method to upgrade an user to premium
	public void becomePremium() throws Exception {
		
		//Checking if the user is already a premium member
		if(this.premium) {
			
			throw new Exception("Oops ! you are already a premium member");
		}
		//if not, then 
		if(this.fund >=100) {
			
			this.premium = true;
			this.fund -= 100;
			System.out.println(this.id + " is now a premium user \n");
		}
		else {
			
			System.out.println("Sorry! you have insufficient funds to become a premium ");
		}
	}
	
	//Method to enable user to buy a content
	public void buyContent(Content C) {

			try {
				//checking if the user is premium
				if(this.premium) {
			
					//Checking whether there is sufficient balance to purchase the item with 20% discount
					if(0.8 * C.getPrice() <= this.fund) {
				
						this.fund -= 0.8* C.getPrice();
						String funds = String.format("%.2f",this.getFunds());
						System.out.println("Purchase Done ! \nBalance Update for " + this.id +" : " + funds + "\n");
						//Increasing the number of download by 1
						C.setDownloads(C.getDownloads() + 1);
						//Adding the bought content in the bought ArrayList
						bought.add(C);
						
					} else {
						//Throw an exception if balance is insufficient	
						throw new BalanceException("Sorry! Insufficient Balance");
					}
				}
			}
			//Catch the exception
			catch(BalanceException b) {
				
				System.out.println(b.getReason());
			}
			
			try { 
				
				if(!this.premium) {
			
						if(C.getPrice() <= this.fund) {
				
							   //Checking whether there is sufficient balance to purchase the item 
								this.fund -= C.getPrice();
								String funds = String.format("%.2f",this.getFunds());
								System.out.println("Purchase Done ! \nBalance Update for " + this.id +" : " + funds + "\n");
								//Increasing the number of download by 1
							    C.setDownloads(C.getDownloads() + 1);
							    //Adding the bought content in the bought ArrayList
								bought.add(C);
								
						} else {
							//Throw an exception if balance is insufficient
							throw new BalanceException("Sorry! Insufficient Balance",this.getFunds());
						}
				}
			}
			
			catch(BalanceException b) {
						
					System.out.println(b.getReason());
			}
	}
	
	//Method to display the content bought by the user
	public void showContentBought() {
		
		if(this.bought.isEmpty()) {
			
			System.out.println("You havn't made any purschase yet");
		}
		else {
	
		System.out.println("\nPurchases items : ");
		System.out.println("-------------------------- ");
		for( int i = 0; i < bought.size(); i++) {
	
			System.out.println(bought.get(i).getID()+ "\t| " + bought.get(i).getName());
			System.out.println("-------------------------- ");
		}
		
		
		}
	}
	
}

