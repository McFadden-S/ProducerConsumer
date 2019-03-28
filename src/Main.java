// **********************************************************************
// Programmer:      Shae McFadden
// Class:           CS40S
//
// Assignment:      Assignment Five
//
// Description:     Producer/Consumer problem with one producer and three
//                  consumers
//
// Input:           None
//
// Output:          Output to the console window with updates on the
//                  the program and shared resouce 
// ***********************************************************************

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.concurrent.Semaphore;

public class Main
{  // begin class
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
            Semaphore semaphore = new Semaphore(1);
            
	// ***** create objects *****
		
            Consumer1 con1 = new Consumer1(semaphore, "Consumer One");
            Producer pro = new Producer(semaphore, "Producer");
            
	// ***** Print Banner *****
	
            System.out.println("**********************************");
            System.out.println("NAME:        Shae McFadden");
            System.out.println("Class:       CS40S");
            System.out.println("Assignment:  5");
            System.out.println("**********************************");
	
	// ***** main *****
	
            con1.start();
            pro.start();

	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
}  // end class