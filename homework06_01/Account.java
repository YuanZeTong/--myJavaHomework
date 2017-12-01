package homework06_01;
import java.util.Date;
import java.util.ArrayList;
public class Account {
	private String name;//账户名字
	private int id = 0;//账户id
	private double balance = 0;//账户余额
	private double annualInterestRate = 0;//年利率
	private Date dateCreated;//账户创建日期
	private ArrayList<Transaction> transactions = new ArrayList<>();//交易列表
	
	
	//创建默认账户的默认构造方法
	public Account() {
		Date dateCreated = new Date();
	}
	//创建带特定id和初始余额的账户的构造方法
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		Date dateCreated  = new Date();
	}
	//创建带指定名字的，特定id和初始余额的账户的构造方法
	public Account(String name, int id, double balance) {
		this.name = new String(name);
		this.id = id;
		this.balance = balance;
		Date dateCreated  = new Date();
	}
	//访和器和修改器
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate / 100.0;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	public ArrayList<Transaction> getTransactions(){
		return transactions;
	}
	//从账户提取指定数额
	public void withDraw(double number) {
		Date nowDate = new Date();
		balance -= number;
		Transaction tran = new Transaction(nowDate, 'W', number, balance, "交易时间：" + nowDate.toString() +"\n" + "交易类型: 取款\n" + 
			"交易量：" + number + "\n" + "交易后金额：" + balance + "\n");
		this.transactions.add(tran);
	}
	//向账户存储特定数额
	public void deposit(double number) {
		Date nowDate = new Date();
		balance += number;
		Transaction tran = new Transaction(nowDate, 'D', number, balance, "交易时间：" + nowDate.toString() +"\n" + "交易类型: 存款\n" + 
			"交易量：" + number + "\n" + "交易后金额：" + balance + "\n");
		this.transactions.add(tran);
	}
	
}
