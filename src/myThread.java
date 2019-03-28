/** **********************************************************
 * Programmer:      Shae McFadden
 * Class:           CS40S
 * 
 * Assignment:      Assignment Five
 *
 * Description:     This is a general thread class which all the
 *                  other classes will extend, used to share the 
 *                  queue object
 * *************************************************************/
 
 import java.util.concurrent.Semaphore;
 
 public class myThread extends Thread
 {  // begin class
 	
 	// *********** class constants **********
            
            final static Queue PRODUCT = new Queue();
            final static int REPEAT = 100;
     
 	// ********** instance variable **********
 	
            Semaphore sem;
            String tN;
            int n;
            
 	// ********** constructors ***********
 	
            /**
             * Constructor for myThread object inherits Thread
             * Required:
             * @param semaphore
             * @param threadName 
             */
            public myThread(Semaphore semaphore, String threadName){
                super(threadName);
                
                sem = semaphore;
                tN = threadName;
            }//end of constructor
            
 }  // end class