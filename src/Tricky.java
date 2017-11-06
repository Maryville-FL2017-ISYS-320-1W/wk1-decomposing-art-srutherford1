/*
  	ISYS 320
  	Name(s): Samantha Rutherford
  	Date: November 5th, 2017
*/

// 1. My predicted output was gonna be that they came out in order
//    of how you had it written out. It would display the messages
//    for message one.


public class Tricky {
    public static void main(String[] args) {
        message1();
        message2();
        System.out.println("Done with main.");
    }

    public static void message1() {
        System.out.println("This is message1.");
    }

    public static void message2() {
        System.out.println("This is message2.");
        message1();
        System.out.println("Done with message 2.");
    }
}

// 3. Were you correct? Explain any differences
// Honestly my thought process was not the same for how it came out.
// Only because for some reason I thought "Done with main" would print
// out first but I understand now.

