/* isPalindrome
Write a recursive function called isPalindrome which returns true if the string passed to it is a palindrome (reads the same forward and backward). Otherwise it returns false.

Examples

isPalindrome('awesome') # false
isPalindrome('foobar') # false
isPalindrome('tacocat') # true
isPalindrome('amanaplanacanalpanama') # true
isPalindrome('amanaplanacanalpandemonium') # false  */

public class Exercise {
    public  boolean isPalindrome(String s)
    {   
        if(s.length()<=1){
            return true;
        }else if(s.charAt(0)!=s.charAt(s.length()-1)){
            return false;
        }else{
            return isPalindrome(s.substring(1,s.length()-1));
        }
    }

}