import java.util.*;

import java.util.*;

public class test {

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int []array  = new int[size];
        //inputt
        System.out.println("input");
        for(int i=0 ;i<size ;i++){

        array [i]= sc.nextInt();
        }
        System.out.println("output");
    //output
    for(int j=0; j<size;j++){
        System.out.println(array[j]);
    }
    
    

    }
}
