package basic1;



class Mythread extends Thread{
      public void run(){   // run()--> run() this is ne of the methd of the Thread class. 
            for(int i=0 ;i<10;i++){
                  System.out.println("inside run method");
            }
      }
}
public class multi1 {
      
      public static void main(String args[]){
            Mythread obj = new Mythread();
            obj.start();

            for(int i=0 ; i<10 ; i++){
                  System.out.println("in main thread");
            }
      }
      
}