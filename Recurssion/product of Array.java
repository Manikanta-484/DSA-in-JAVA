/* product of Array
Write a function called productOfArray which takes in an array of numbers and returns the product of them all.

Examples

int arr[] = { 1, 2, 3, 4, 5 }; 
productofArray(arr, arr.length); #120 */

public class Exercise {
    public int productofArray(int A[], int N) 
    { 
        if(N==0){
            return 1;
    } else{
        return A[N-1]*productofArray(A,N-1);
    }

}
}
