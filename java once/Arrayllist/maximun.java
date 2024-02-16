import java.util.ArrayList;

public class maximun {
      public static void main(String args[]){

        ArrayList<Integer> obj1= new ArrayList<>() ;

           obj1.add(1);
           obj1.add(2);
           obj1.add(3);
           obj1.add(4) ;
           obj1.add(5);
           obj1.add(6) ;
             

           //max= - (Infinity) [Integer.MIN_value] 

           int max = Integer.MIN_VALUE;
           for(int i = 0 ; i<obj1.size();i++){
            // if(max<obj1.get(i)){
            //     max=obj1.get(i);
            max=Math.max(max , obj1.get(i));
             }
            
             System.out.println("max element = " + max );
           }

      }

