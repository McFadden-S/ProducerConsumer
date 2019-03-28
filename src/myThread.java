/** **********************************************************
 * Programmer:      Shae McFadden
 * Class:           CS40S
 * 
 * Assignment:      Assignment Five
 *
 * Description:     This is a general thread class which all the
 *                  other classes will extend, used to share the 
 *                  queue object.
 * *************************************************************/
 
 import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
 
 public class myThread extends Thread
 {  // begin class
 	
 	// *********** class constants **********
            
            final static Queue PRODUCT = new Queue();
            final static int RANGE = 50;
            final private int RUNTIME = 10000;
            
 	// ********** instance variable **********
            
            static boolean REPEAT = true;
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
            
        // ********** method ***********  
            
            /**
             * Overwrites run method
             * this run will act as a timer and w after set time
             * will cause repeat boolean to turn false.
             */
            public void run(){
                try {
                    sleep(RUNTIME);
                }//end of try 
                catch (InterruptedException ex) {
                    Logger.getLogger(myThread.class.getName()).log(Level.SEVERE, null, ex);
                }//end of catch
                REPEAT = false;
            }//end of overwrite run
 }  // end class