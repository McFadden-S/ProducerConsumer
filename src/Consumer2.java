/** **********************************************************
 * Programmer:      Shae McFadden
 * Class:           CS40S
 * 
 * Assignment:      Assignment Five
 *
 * Description:     This class extends my thread and will take
 *                  two value from the queue and each will be converted
 *                  to a percent used to find that percent between one and
 *                  two billion then find the greatest common factor of the
 *                  two Then the thread will sleep for 250m.s.
 * *************************************************************/
 
 import java.util.concurrent.Semaphore;
 
 public class Consumer2 extends myThread
 {  // begin class
     
 	// ********** constructors ***********
            
            /**
             * Constructor for Consumer1 inherits myThread object
             * Required:
             * @param semaphore
             * @param threadName 
             */
            public Consumer2(Semaphore semaphore, String threadName){
                super(semaphore, threadName);
            }//end of constructor
     
 	// ********** methods **********
 	
 
 }  // end class