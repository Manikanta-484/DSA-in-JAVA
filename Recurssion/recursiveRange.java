/* recursiveRange
Write a function called recursiveRange which accepts a number and adds up all the numbers from 0 to the number passed to the function.

Examples

recursiveRange(6)  // 21
recursiveRange(10) // 55  */

public class Exercise {
    
   public int recursiveRange(int num) {
       if(num==1){
           return 1;
       }else{
           return num+recursiveRange(num-1);
       }
   } 


}