package week2;


public class Clock {
		private Display hour = new Display(24);
		private Display minute = new Display(60);
		private Display second = new Display(60);
		
		public Clock(int hour,int minute,int second)
		{
			this.hour.initial(hour);
			this.minute.initial(minute);
			this.second.initial(second);			
		}
		
		public void start() {
			while (true) {
				second.increase();
				if (second.getValue() == 0) {
					minute.increase();
					if (minute.getValue() == 0) {
						hour.increase();
					} 
				}
				
				System.out.printf("%02d:%02d:%02d\n", hour.getValue(), minute.getValue(),second.getValue());
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Clock clock = new Clock(21,02,30);
			clock.start();
		}
}
