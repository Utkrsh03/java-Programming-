// code 
class demo{
  int? x ;
  String? str ;
  demo(this.x, this.str){
      print ("normal constructor");
  }
}
void main(){

  demo obj1= const new demo(10,"kanha");
  demo obj2 = const demo(9,"tina");
  print(obj1.hashCode );
  print(obj2.hashCode);
}