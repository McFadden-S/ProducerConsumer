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
		
            myThread timer = new myThread(semaphore, "Timer");
            Consumer1 con1 = new Consumer1(semaphore, "Consumer One");
            Consumer2 con2  = new Consumer2(semaphore, "Consumer Two");
            Consumer3 con3 = new Consumer3(semaphore, "Consumer Three");
            Producer pro = new Producer(semaphore, "Producer");
            
	// ***** Print Banner *****
	
            System.out.println("**********************************");
            System.out.println("NAME:        Shae McFadden");
            System.out.println("Class:       CS40S");
            System.out.println("Assignment:  5");
            System.out.println("**********************************");
	
	// ***** main *****
	
            timer.start();
            con1.start();
            con2.start();
            con3.start();
            pro.start();
	
	}  // end main	
}  // end class