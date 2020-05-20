package castle;

public class HandlerBye extends Handler{

	public HandlerBye(Game game) {
		super(game);
	}
	@Override
	public boolean isBye() {
		// TODO Auto-generated method stub
        System.out.println("感谢您的光临。再见！");

		return true;
	}
	

}
