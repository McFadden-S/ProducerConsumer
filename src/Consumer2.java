/** **********************************************************
 * Programmer:      Shae McFadden
 * Class:           CS40S
 * 
 * Assignment:      Assignment Five
 *
 * Description:     This class extends my thread and will take
 *                  two value from the queue and then will find two
 *                  random numbers between one and two billion then 
 *                  find the greatest common factor of the
 *                  two Then the thread will sleep for 250m.s.
 * *************************************************************/
 
import java.util.Random;
 import java.util.concurrent.Semaphore;
 
 public class Consumer2 extends myThread
 {  // begin class
        // ********** Instance Variable and Constants ***********
     
            private final int BILLION = 1000000000;
            private Random rand = new Random();
            private long num1, num2, ans;
            private double scale;
            
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
            /**
             * Overwrites thread run method
             * acquires lock to shared resource, removes two objects from the 
             * shelf then finds two random numbers in the range of one to two 
             * billion and finds their greatest common factor then releases lock.
             */
            public void run(){
                while(REPEAT){
                    try {
                        if(sem.availablePermits()==0){
                            System.out.println(tN + ": Blocked");
                        }//if no permits

                        sem.acquire();

                        if(PRODUCT.sizeQ>1){
                            n = PRODUCT.Deque();
                            num1 = BILLION + rand.nextInt(BILLION);
                            
                            n = PRODUCT.Deque();
                            num2 = BILLION + rand.nextInt(BILLION);
                            
                            ans = gcf(num1, num2);
                            
                            sleep(100);
                            
                            System.out.println(tN + ": Items Left " + PRODUCT.sizeQ 
                                    + ", Greatest Common Factor of " + num1 + 
                                    " and " + num2 + " is: " + ans);
                        }//end of if product 
                        else{
                            System.out.println(tN + ": Not Enough Items, Skipped");
                        }//end of else no product
                        
                        sem.release();
                        sleep(250);
                        
                    } //end of try
                    catch (InterruptedException ex) {
                        System.out.println(tN + ": Interrupted");
                    }//end of catch
                }//end of for repeat loop
            }//end of overwrite run
            
            private long gcf(long num1, long num2){
                long temp1, temp2;
                
                if(num1 == 0 || num2 == 0){
                    return Math.max(num1, num2);
                }//end of if termination condition
                else{
                    temp1 = Math.max(num1, num2)-Math.min(num1, num2);
                    temp2 = Math.min(num1, num2);
                    return gcf(temp1, temp2);
                }//end of else recursion
            }//end of greatest common factor
            
 }  // end class