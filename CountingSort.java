public class CountingSort {
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){  // frequency count(iterate on original arr)
          count[arr[i]]++;  
        }

        //sorting
        int j = 0; //original arr ko 0 se start karna hai
        for(int i=0; i<count.length; i++){  //count sort( iterate on frequency arr)
           while(count[i] > 0){  //update element
            arr[j] = i;
            j++;
            count[i]--;  //freq decrese 
           }
        }
    } 
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1,4,1,3,2,4,3,7};
        countingSort(arr);
        printArr(arr);
    }     
}


//int count[] = new int[largest+1];
//for(int i=0; i<arr.length; i++){  // frequency count(iterate on original arr)
//    count[arr[i]]++;  explain this code step by step and dry run

//Let's break down the given code step by step and perform a dry run:

//Initialize Count Array:

//Create a new integer array count with a size of largest + 1.
//largest is the largest element in the input array arr.
//Frequency Count:

//Iterate through the original array arr.
//For each element arr[i], increment the value at index arr[i] in the count array.
//This step counts the frequency of each element in the original array.
//Dry Run Example:

//Input Array: 1 4 1 3 2 4 3 7
//Largest Element (largest): 7
//Initialize Count Array:

//count array before counting: [0, 0, 0, 0, 0, 0, 0, 0]
//Frequency Count:

//Iteration 1: arr[0] = 1, increment count[1]: [0, 1, 0, 0, 0, 0, 0, 0]
//Iteration 2: arr[1] = 4, increment count[4]: [0, 1, 0, 0, 1, 0, 0, 0]
//Iteration 3: arr[2] = 1, increment count[1]: [0, 2, 0, 0, 1, 0, 0, 0]
//Iteration 4: arr[3] = 3, increment count[3]: [0, 2, 0, 1, 1, 0, 0, 0]
//Iteration 5: arr[4] = 2, increment count[2]: [0, 2, 1, 1, 1, 0, 0, 0]
//Iteration 6: arr[5] = 4, increment count[4]: [0, 2, 1, 1, 2, 0, 0, 0]
//Iteration 7: arr[6] = 3, increment count[3]: [0, 2, 1, 2, 2, 0, 0, 0]
//Iteration 8: arr[7] = 7, increment count[7]: [0, 2, 1, 2, 2, 0, 0, 1]
//After the frequency count, the count array represents the frequency of each element in the original array:
//[0, 2, 1, 2, 2, 0, 0, 1]

//int j = 0; //original arr ko 0 se start karna hai
//for(int i=0; i<count.length; i++){  //count sort( iterate on frequency arr)
 //   while(count[i] > 0){  //update element
    // arr[j] = i;
  //   j++;
    // count[i]--;  //freq decrese 
  //  }
 //}
  
//Initialize Index j:

//j is initialized to 0, indicating the start of the original array.
//Count Sort:

//Iterate through the count array from index 0 to count.length - 1.
//For each element count[i]:
//While count[i] is greater than 0:
//Set arr[j] to the value i, which represents the element being sorted.
//Increment j to move to the next position in the original array.
//Decrement count[i] to reduce the count of the current element in the count array.
//Dry Run Example:

//Input Array: 1 4 1 3 2 4 3 7
//Count Array After Frequency Count: [0, 2, 1, 2, 2, 0, 0, 1]
//Initialize j to 0.
//Count Sort:
//Iteration 1 (i=0): count[0] is 0, so no action.
//Iteration 2 (i=1): count[1] is 2, so:
//Set arr[j] = 1, j = 1, decrement count[1] to 1.
//Set arr[j] = 1, j = 2, decrement count[1] to 0.
//Iteration 3 (i=2): count[2] is 1, so:
//Set arr[j] = 2, j = 3, decrement count[2] to 0.
//Iteration 4 (i=3): count[3] is 2, so:
//Set arr[j] = 3, j = 4, decrement count[3] to 1.
//Set arr[j] = 3, j = 5, decrement count[3] to 0.
//Iteration 5 (i=4): count[4] is 2, so:
//Set arr[j] = 4, j = 6, decrement count[4] to 1.
//Set arr[j] = 4, j = 7, decrement count[4] to 0.
//Iteration 6 (i=5): count[5] is 0, so no action.
//Iteration 7 (i=6): count[6] is 0, so no action.
//Iteration 8 (i=7): count[7] is 1, so:
//Set arr[j] = 7, j = 8, decrement count[7] to 0.
//After the count sort, the arr array is sorted as 1 1 2 3 3 4 4 7.
