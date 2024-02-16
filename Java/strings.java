import java.util.*;

public class strings {
    public static void main(String args[]){

        String a = "hellA";
        String b = "horld";
        String c = "hella";
        String d = "shift";

        //character function---Character function which specifies the position of the character i.e.the index position.
        System.out.println("Character function  : " + "\n" +a.charAt(1));
        //code point--uncode of the character at the specified index.
        System.out.println("Unicode function : " + "\n" +a.codePointAt(2));
       // code pont before function--Return the unicode of the character.
        System.out.println("code point before function : " + "/n"+a.codePointBefore(2)); 
        //code point count function---
        System.out.println("code point count :" + "/n" +a.codePointCount(1,2));
        //Compare to function---It compares the two atrings.
        System.out.println("Compare function :" + "/n" + a.compareTo(c));
        //Concat funcation---means the addition of the two functions 
        System.out.println("Concat function :" + "/n" + a.concat(b));
        //Contains Function--It checks weather the string contains the character or not 
        System.out.println("Contains function :" + "/n" + a.contains(b));
        //length function
       // System.out.println("length function :" + "/n" + a.length(b));
 
        
    }    
    
}
