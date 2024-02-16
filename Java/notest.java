import java.util.*;

public class notest {

 public static void main(String args[]){
     Scanner sc = new Scanner (System.in);
     int row = sc.nextInt();
     int column = sc.nextInt();
     int array [][]= new int [row] [column];
  System.out.println("We are giving inputs ");
           //inputs 
     for ( int i=0 ;i<row ; i++ ){
         for( int j=0;j< column ; j++){
         array [i][j] = sc.nextInt();
         }
     }
      System.out.println("Here we got our output");
         //outputs
         for ( int i = 0 ; i<row ; i++){
             for( int j = 0 ; j<column ; j++){
                 System.out.print(array[i][j] + " " );
             }
             System.out.println();
         }

     

 }
    
}
