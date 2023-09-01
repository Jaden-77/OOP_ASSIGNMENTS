package oop;

public class OOP {

    public static void main(String[] args) {
        
        myTime time = new myTime(10, 30, 0, true);

        
        System.out.println("Initial time:");
        time.displayTime12();
        time.displayTime24();
        System.out.println(time); 

      
        time.advanceTime(120);
        System.out.println("\nTime after advancing by 120 seconds:");
        time.displayTime12();
        time.displayTime24();
        System.out.println(time);

      
        for (int i = 0; i < 65; i++) {
            time.tickBySecond();
            System.out.print("\nTicking by second: ");
            time.displayTime12();
            time.displayTime24();
        }

       
        for (int i = 0; i < 65; i++) {
            time.tickByMinutes();
            System.out.print("\nTicking by minute: ");
            time.displayTime12();
            time.displayTime24();
        }

        
        for (int i = 0; i < 15; i++) {
            time.tickByHour();
            System.out.print("\nTicking by hour: ");
            time.displayTime12();
            time.displayTime24();
        }
    }
}
