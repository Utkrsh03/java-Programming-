import java.util.LinkedList;

public class l1{
    public static class node{
          int data ;
          node next ;


          public node(int data){
              this.data= data ;
              this.next= null ;
          }

          public static node head ;
          public static node tail ;
          // add method 
          // remove 
        private static Object li;

          
          

          public void addFirst(int data ){
              //step1 = create new node 
            node newnode=new node(data);
            if(head==null){
                head=tail=newnode;
                return ;

            }
          

          // step2 -- newnode next=head
          newnode.next = head ;

          //step 3 == head= newnode 
          head= newnode ;


          }
           public static void main(String args[]){

            LinkedList ll = new LinkedList();
            //((l1.node) li).addFirst(3);
            ll.addFirst(2);
            ll.addFirst(3);

    }

}
}