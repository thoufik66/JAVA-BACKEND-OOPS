package DAY1;
class Customer{
	private int custId;
	private String custName;
	private double balance;
	public Customer(int custId, String custName , double balance){
		this.custId=custId;
		this.custName=custName;
		this.balance=balance;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void showCustomer(){
		System.out.println("customer id :"+ custId);
		System.out.println("customer name :"+ custName);
		System.out.println("customer balance :"+ balance);
	}
	
}
public class CustomerDemo {

	public static void main(String[] args) {
		Customer cust1=new Customer(1001,"raj",1234.7);
		Customer cust2=new Customer(1002,"raju",18234.7);
		Customer cust3=new Customer(1003,"raja",19234.7);
		cust1.showCustomer();
		cust2.showCustomer();
		cust3.showCustomer();
	}

}
