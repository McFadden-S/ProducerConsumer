/** **********************************************************
 * Programmer:      Shae McFadden
 * Class:           CS40S
 * 
 * Assignment:      Assignment Five
 *
 * Description:     Takes one item from the queue then prints it
 *                  then the thread will sleep for one second.
 * *************************************************************/
 
 import java.util.concurrent.Semaphore;
 
 public class Consumer3 extends myThread
 {  // begin class
     
 	// ********** constructors ***********
            
            /**
             * Constructor for Consumer1 inherits myThread object
             * Required:
             * @param semaphore
             * @param threadName 
             */
            public Consumer3(Semaphore semaphore, String threadName){
                super(semaphore, threadName);
            }//end of constructor
     
 	// ********** methods **********
 	
            /**
             * Overwrites thread run method
             * acquires lock to shared resource then take one number out and 
             * then releases the lock.
             */
            public void run(){
                while(REPEAT){
                    try {
                        if(sem.availablePermits()==0){
                            System.out.println(tN + ": Blocked");
                        }//if no permits

                        sem.acquire();

                        if(PRODUCT.sizeQ>0){
                            n = PRODUCT.Deque();
                            
                            System.out.println(tN + ": Items Left " + PRODUCT.sizeQ 
                                    + ", Took " + n);
                            
                            sleep(100);
                            
                            
                        }//end of if product 
                        else{
                            System.out.println(tN + ": Not Enough Items, Skipped");
                        }//end of else no product
                        
                        sem.release();
                        sleep(1000);
                        
                    } //end of try
                    catch (InterruptedException ex) {
                        System.out.println(tN + ": Interrupted");
                    }//end of catch
                }//end of for repeat loop
            }//end of overwrite run
 }  // end class