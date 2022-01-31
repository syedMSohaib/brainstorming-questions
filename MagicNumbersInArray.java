/*
TASK: Array Index & Element Equality

Description: Given a sorted arr of distinct integers, write a functional indexEqualsValueSearch
that returns the lowest index i for which arr[i] === i. Return -1 if there is no such index. Analyze the time and space complexities of your solution and explain its correctness

Example:

arr = [-8, 0, 2, 5]

output = 2

arr = [-1, 0, 3, 6]

output = -1


*/

class Main {

  static int indexEqualsValueSearch(int[] arr){

    return binarySearch(arr, 0, arr.length - 1);

  }

  static int binarySearch(int[] arr, int start, int end) {

    int output_value = -1;

    while(start <= end) {

      int mid = ((start + end) / 2);
      // System.out.println("start:" + start + " & end: "+end);
      // System.out.println("mid value is " + mid);

      if(arr[mid] == mid){
          output_value = mid;
          end = mid - 1;
      }
      else if(mid > arr[mid] ){
        start = mid + 1;                  
      } 
      else{
        end = mid - 1;                  
      }
    }

    return output_value;
  }

  public static void main(String[] args) {

    System.out.println("========== Running Test Cases ==========");
    System.out.println("TEST CASE 1: {-8, 1, 3, 5}");
    int[] arr = {-8, 1, 3, 5};
    int output = indexEqualsValueSearch(arr);
    System.out.println("the output is " + output);

    System.out.println("TEST CASE 2: {-8, -4, 1, 3}");
    int[] arr1 = {-8, -4, 1, 3};
    int output1 = indexEqualsValueSearch(arr1);
    System.out.println("the output is " + output1);

    System.out.println("TEST CASE 3: {0, 1, 2, 3, 4, 5}");
    int[] arr2 = {0, 1, 2, 3, 4, 5};
    int output2 = indexEqualsValueSearch(arr2);
    System.out.println("the output is " + output2);


    /*
      [-8, 0, 2, 5]
      length = 4
      start = 2
      end = 3
      mid = (2+3/2) = 

      1 == 0 false
      1 > 0  true
        start = mid + 1 / => 2
        end = end
      1 < 0  false

      2 == 2 [
        min = 2
        recall([-8, 1, 3])
          unless arr.length = 1
      ] 

    */
  }
}
