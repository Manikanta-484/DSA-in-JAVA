/* reverse
Write a recursive function called reverse which accepts a string and returns a new string in reverse.

Examples

reverse('java') # 'avaj'
reverse('appmillers') # 'srellimppa'  */

public class Exercise {
    public String reverse(String str)
    {
        if(str.isEmpty()){
            return str;
        }else{
            return str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));
        }
    }

}