
import 'dart:io';

class leaders{

  String name="modi";
  String position ="prime minister" ;
  double salary = 43000 ;


// leaders la leader krycha ahea 
void leadersinfo(){
    print(name) ;
    print(position);
    print(salary) ;
  
}
}

void main(){
  leaders obj = new leaders() ;
  obj.leadersinfo() ;

  print("enter the leader name") ;
  obj.name=stdin.readlineSync() ;

  print("enter the position") ;
  obj.position=stdin.readlineSync() ;

    print ("enter the leaders salary");
     obj.salary= int .parse(stdin.readlineSync()!)

}

