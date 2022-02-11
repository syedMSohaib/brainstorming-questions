/*
Task: Count the number of divisors of a positive integer n.
Random tests go up to n = 500000.

4 --> 3 (1, 2, 4)
5 --> 2 (1, 5)
12 --> 6 (1, 2, 3, 4, 6, 12)
30 --> 8 (1, 2, 3, 5, 6, 10, 15, 30)

*/


import java.lang.Math;

public class FindDivisor {
  
  
  /*
    Time Complexity : O(n) 
    Auxiliary Space : O(1)  
  */
  public long numberOfDivisors(int n) {
      int count = 0;
      for(int i=1; i <= n; i++) {
          if(n%i == 0)
              count++;
      }

      return count;
 }

  
  /*
    Time Complexity : O(sqrt(n)) 
    Auxiliary Space : O(1)  
  */
  public long numberOfDivisorsOptimal(int n) {
      int count = 0;
      for(int i=1; i <= Math.sqrt(n); i++) {
          if( n%i == 0) {
              if(n/i == i) {
                count++;              
              }else{
                count+=2;              
              }
          }
      }

      return count;
    }
}
