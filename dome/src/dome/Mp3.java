package dome;

public class Mp3 extends Item{
	private int time ;
	
	
	public Mp3(String title, int playingTime, boolean gotIt, String comment,int time) {
		super(title, playingTime, gotIt, comment);
		this.time = time;
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("Mp3:");
		super.print();
		System.out.print(this.time);
	}









	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
