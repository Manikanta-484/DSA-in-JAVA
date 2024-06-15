/* First Uppercase
Given a string find its first uppercase letter

Example

Input : appmillerS
Output : S  */

public class Exercise {
    static char first(String str) {
    //   if(str.isEmpty()){
    //       return null;
    //   }else 
    if(Character.isUpperCase(str.charAt(0))){
           return str.charAt(0);
       }else{
           return first(str.substring(1));
       }
    }

}