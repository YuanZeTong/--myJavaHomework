package homework06_01;

public class TestForAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account accountOfGeorge = new Account("George", 1122, 1000);
		accountOfGeorge.setAnnualInterestRate(1.5);
		accountOfGeorge.deposit(30);
		accountOfGeorge.deposit(40);
		accountOfGeorge.deposit(50);
		accountOfGeorge.withDraw(5);
		accountOfGeorge.withDraw(4);
		accountOfGeorge.withDraw(2);
		System.out.println("此账户持有者姓名：" + accountOfGeorge.getName() + "\n" + "年利率：" + accountOfGeorge.getAnnualInterestRate() * 100 + "%\n"
				+ "收支额：" + accountOfGeorge.getBalance() + "\n");
		for(Transaction t:accountOfGeorge.getTransactions()) {
			System.out.println(t.getDescription());
		}
	}

}
