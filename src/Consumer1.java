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
import java.util.logging.Level;
import java.util.logging.Logger;
 
 public class Consumer1 extends myThread
 {  // begin class
        // ********** variables ***********
     
            private int n, ans;
            
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
            
            /**
             * Overwrites thread run method
             * acquires lock to shared resource then take one number out and 
             * sets it to the power of two the releases the lock.
             */
            public void run(){
                for(int i = 0; i < REPEAT; i++){
                    try {
                        if(sem.availablePermits()==0){
                            System.out.println(tN + ": Blocked");
                        }//if no permits

                        sem.acquire();

                        if(PRODUCT.sizeQ>0){
                            n = PRODUCT.Deque();
                            ans = recur2Pow(n);

                            sleep(500); 
                            System.out.println(tN + ": Items Left " + PRODUCT.sizeQ 
                                    + ", Calculated 2^" + n + " is: " + ans);
                        }//end of if product 
                        else{
                            System.out.println(tN + ": Not Enough Items, Skipped");
                        }//end of else no product
                        
                        sem.release();
                        
                    } //end of try
                    catch (InterruptedException ex) {
                        System.out.println(tN + ": Interrupted");
                    }//end of catch
                }//end of for repeat loop
            }//end of overwrite run
            
            /**
             * recursive function to find 2 to the power of the parameter
             * @param num
             * @return 2 to the power of input
             */
            private int recur2Pow(int num){
                if(num == 1){
                    return 2;
                }//termination condition
                else{
                    return (2 * recur2Pow(num-1));
                }//else other condition
            }//end of recursive 2^num
            
 }  // end class