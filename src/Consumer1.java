/** **********************************************************
 * Programmer:      Shae McFadden
 * Class:           CS40S
 * 
 * Assignment:      Assignment Five
 *
 * Description:     This class extends my thread and will take
 *                  one value from the queue and make it the 
 *                  exponent for the base of two Then the
 *                  thread will sleep for 500m.s.
 * *************************************************************/
 
 import java.util.concurrent.Semaphore;
 
 public class Consumer1 extends myThread
 {  // begin class
     
 	// ********** constructors ***********
            
            /**
             * Constructor for Consumer1 inherits myThread object
             * Required:
             * @param semaphore
             * @param threadName 
             */
            public Consumer1(Semaphore semaphore, String threadName){
                super(semaphore, threadName);
            }//end of constructor
     
 	// ********** methods **********
 	
 
 }  // end class