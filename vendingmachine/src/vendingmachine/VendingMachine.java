package vendingmachine;

public class VendingMachine {
//Java�ṩ�˶����ֶ������϶��󴴽�ʱ�ĳ�ʼ����������ÿ����Ա����Ĭ�ϵġ�0��ֵ�������ʼ���͹��캯����
	int price = 80;
	int balance ;//��java�����û�и���Ա������ֵjava���Զ���0
	int total;
	
	VendingMachine() //���캯��
	{
		// TODO Auto-generated constructor stub
		total = 0;
	}
	VendingMachine(int price) //����
	{
		// TODO Auto-generated constructor stub
		this();//����û�в����Ĺ��캯��
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
