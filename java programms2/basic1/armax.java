package basic1;

import javax.swing.plaf.synth.SynthStyleFactory;

public class armax {
    public static void main(String args[]){
        

        int arr []= new int []{23,34,335,33};

        int max= arr[0];

        for(int i=0 ; i<arr.length ; i++){

            if(arr[i]>max);
            max=arr[i];
             
        }
       System.out.println("largest e;ement" + max);
    }
    
}
