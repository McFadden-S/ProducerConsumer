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
 
import java.util.Random;
import java.util.concurrent.Semaphore;
 
 public class Producer extends myThread{// begin class
    // ********** Instance variable ***********

        private Random rand = new Random();

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

        /**
         * Overwrites thread run method
         * acquires lock to shared resource then filles the shared resource
         * back up to five items.
         */
        public void run(){
            while(REPEAT){
                try {
                    if(sem.availablePermits()==0){
                        System.out.println(tN + ": Blocked");
                    }//if no permits

                    sem.acquire();

                    if(PRODUCT.sizeQ<5){
                        while(PRODUCT.sizeQ<5){
                            n = rand.nextInt(RANGE)+1;
                            PRODUCT.Enque(n);
                        }//end of while
                        
                        sleep(100);
                        
                        System.out.println(tN + ": Filled back to five items");
                    }//end of if less then five products
                    else{
                        System.out.println(tN + ": Full, Skipped");
                    }//end of else full product

                    sem.release();
                    sleep(250);
                } //end of try
                catch (InterruptedException ex) {
                    System.out.println(tN + ": Interrupted");
                }//end of catch
            }//end of for repeat loop
        }//end of overwrite run

 }  // end class