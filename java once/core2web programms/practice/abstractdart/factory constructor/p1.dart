//code2 
class demo{
  int ? x ;
  String? str ;
  demo(){
    print("Normal constructor");
  }
  demo.one(){
    print("Name constructor1");
  }
  demo.two(){
    print("Name constructor2");
  }
  
}
void main(){
  demo obj1= demo();

  demo obj2=demo.one();
  demo obj3= demo.two();
}