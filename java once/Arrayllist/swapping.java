import java.util.ArrayList;

public class swapping {


        public static void swap(ArrayList<Integer> list, int index1 , int index2 ){
                 int temp= list.get(index1);
                 list.set(index1 , list.get(index2));
                 list.set(index2,temp);
        }
         public static void main(String args[], ArrayList<Integer> list){

        ArrayList<Integer> obj1= new ArrayList<>() ;

           obj1.add(1);
           obj1.add(2);
           obj1.add(3);
           obj1.add(4) ;
           obj1.add(5);
           obj1.add(6) ;


           int index1= 1; 
           int index2= 3 ;
           //ArrayList<Integer> list;
        swap(list , index1 , index2 );
        System.out.println(list);

         }
}
