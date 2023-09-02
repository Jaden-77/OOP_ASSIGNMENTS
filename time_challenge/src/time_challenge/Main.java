package time_challenge;

public class Main {

	public static void main(String[] args) {
		
		
		myTime time = new myTime(9, 30, 0, false);

        System.out.print("Initial 12-hour format:");
        time.displayTime12();
        System.out.println();
        
        System.out.print("Initial 24-hour format:");
        time.displayTime24();
        System.out.println();
        
        time.tickBySecond();
        System.out.print("Time after ticking by one second:");
        time.displayTime12();
        time.tickBySecond();
        System.out.println();
        
        time.tickByMinutes();
        System.out.print("Time after ticking by one minute:");
        time.displayTime24();

        time.tickByHour();
        System.out.print("Time after ticking by one hour:");
        time.displayTime12();
	}

}
