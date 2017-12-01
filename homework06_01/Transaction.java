package homework06_01;
import java.util.Date;
public class Transaction {
	private Date date;//该交易的日期
	private char type;//交易类型
	private double amount;//交易量
	private double balance;//交易后新余额
	private String description;//交易描述
	
	//访问器和修改器
	public Date getDate() {
		return date;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount =amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Transaction(Date date, char type, double amount, double balance, String description) {
		this.date = date;
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		
	}
	
}
