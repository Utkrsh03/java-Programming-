import java.io.IOException;
import java.io.InterruptedIOException;

class Mythread extends Thread{
      public void run()throws InterruptedIOException{
            for(int i=0 ;i<0 ; i++){
                  System.out.println("inside run");
            }
            try{
                  Thread.sleep(4000);

            }
      }
}

class multi1{

public static void main(String args[]){
              Mythread obj= new Mythread();
              obj.start();
              obj.run();

            //   for(int i=0 ; i<10 ;i++){
            //       System.out.println("in main");
            //   }
      }
}