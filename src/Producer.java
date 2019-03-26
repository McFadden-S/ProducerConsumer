/** **********************************************************
 * Programmer:      Shae McFadden
 * Class:           CS40S
 * 
 * Assignment:      Assignment Five
 *
 * Description:     This class extends myThread and has access to the
 *                  shared resource it will fill the queue back to
 *                  five values.
 * *************************************************************/
 
 import java.util.concurrent.Semaphore;
 
 public class Producer extends myThread
 {  // begin class
     
 	// ********** constructors ***********
            
            /**
             * Constructor for Consumer1 inherits myThread object
             * Required:
             * @param semaphore
             * @param threadName 
             */
            public Producer(Semaphore semaphore, String threadName){
                super(semaphore, threadName);
            }//end of constructor
     
 	// ********** methods **********
 	
 
 }  // end class