package clock;

import display.led.Display;

public class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	
	public void start() {
		while (true) {
			minute.increase();
			if (minute.getValue() == 0) {
				hour.increase();
			}
			System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock = new Clock();
		clock.start();
	}

}
//package clock;
// 
//public class Clock {
//    public Display minute = new Display(60);
//    public Display hour = new Display(24);
//     
//    public void start(){
//        while( true ){
//            minute.increase(hour);
//            System.out.printf("%02d:%02d\n",hour.getValue(),minute.getValue());
//        }
//             
//    }
// 
//    public static void main(String[] args) {
//        Clock clock = new Clock();
//        clock.start();
//         
//    }
// 
//}