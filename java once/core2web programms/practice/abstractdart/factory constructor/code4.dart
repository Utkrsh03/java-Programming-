// code 4
class demo {
  static int x = 10 ;

  demo(){
    print("constructor");
  }

  static void fun(){
    print(x);
  }
}

void main(){
  demo.fun();
}