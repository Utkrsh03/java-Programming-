//package alphaArraylist;

import java.util.ArrayList;

public class operation {
    public static void main(String args[]){
     ArrayList<Integer> obj1 = new ArrayList<>();
     
     //set 
    //  list.set(2,10);

        obj1.add(1);
        obj1.add(2);
        obj1.add(3);
        obj1.add(4);

        //Reverse the arraylist
        for(int i=obj1.size()-1 ; i>=0 ;i--){

             System.out.println(obj1.get(i) + " ");

        }


       System.out.println();
     }
    }
