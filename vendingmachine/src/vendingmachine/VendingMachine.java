package vendingmachine;

public class VendingMachine {
//Java提供了多种手段来保障对象创建时的初始化，包括给每个成员变量默认的“0”值、定义初始化和构造函数。
	int price = 80;
	int balance ;//在java中如果没有给成员变量赋值java会自动赋0
	int total;
	
	VendingMachine() //构造函数
	{
		// TODO Auto-generated constructor stub
		total = 0;
	}
	VendingMachine(int price) //重载
	{
		// TODO Auto-generated constructor stub
		this();//调用没有参数的构造函数
		this.price = price;
	}
	
	void setPrice(int price)
	{
		this.price = price;
//		this.getFood();
	}
	
	void showPrompt()
	{
		System.out.println("Welcome");
	}
	void insertMoeny(int amount)
	{
		balance = balance + amount;
	}
	void showBalance()
	{
		System.out.println(balance);
	}
	void getFood()
	{
		if(balance>=price)
		{
			System.out.println("Here you are");
			balance = balance - price;
			total = total + price;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine vm = new VendingMachine();
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoeny(100);
		vm.getFood();
		vm.showBalance();
//		VendingMachine vm1 = new VendingMachine();
//		vm1.insertMoeny(200);
//		vm.showBalance();
//		vm1.showBalance();
//				
	}

}
