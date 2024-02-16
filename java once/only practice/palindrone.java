public class palindrone{

    public static void main(String args []){

           String string ="rohit" ;
           boolean flag=true ;

           //convert the string into the lower case 
           string=string.toLowerCase();

           for(int i=0 ; i<string.length()/2 ;i++){
            if(string.charAt(i) != string.charAt(string.length()-i-1)){

                flag=false ;
                break ;
            }
            if(flag){
                System.out.println("palindrome");
            }
            else{
                System.out.println("not palindrone");
            }
           }
    }
    
}