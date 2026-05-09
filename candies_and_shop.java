
//There is a jar full of candies for sale at a mall counter. The jar has the capacity N that is JAR can contain 
//maximum N Candies when a JAR is full. At any point in time, JAR can have an M number of candies where 
//M<=N. Candies are served to the customers. JAR is never remaining empty as when the last K candidates are 
//left, JAR is refilled with new candidates in such a way that JAR gets full. Write the code to implement the 
//above scenario. Display JAR at the counter with the available number of candies.
//Input should be the number of candies one customer orders at a point in time. Update the JAR after every 
//purchase and display JAR at the counter. The output should give the number of candies sold and the updated 
//number of candies in the JAR. 

  class Main {
    public static void main(String[] args) {
        int N = 40; 
        int K = 8;  
        int candies = N;
        int c_order = 14; 
        if (c_order > (candies - K)) {
            System.out.println("please put a valid input");
        } else {
            candies = candies - c_order;
            System.out.println("Number of Candies Sold: " + c_order);
            System.out.println("Number of Candies available: " + candies);
            if (candies == K) {
                candies = N;
            }
        }
    }
}
