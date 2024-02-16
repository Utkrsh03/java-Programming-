package core2web programms.inerclass;


// Types of inner class
//1. normal Inner class 
// 2. Method local inner class 
// 3 . Static inner class(static nested class)
 // 4 . Anynomous inner classes 

//  class outer {
//       class inner{

//       }
//  }
public class normalinner {
     class outer{
      class inner{
            void m1(){
                  System.out.println("in m1 inner");
            }
      }
     } 

     void m2(){
      System.out.println("inside m1 inner class");
     }

     class clint{
         public static void main(Strings args []){

               outer obj= new outer();
                obj.m2();
                outer.inner obj1 = obj.new inner();
         }
     }
}
