abstract class demo{
  demo(){
    print("constructor");
  }
  void fun1(){
    print("in fun");
  }
  void fun2();

}
class demochild extends demo{
  demochild(){
    print("const demochild");
  }
  void fun2(){
    print("in fun2");
  }
}
void main(){
  demochild obj = new demochild();
    obj.fun1();
    obj.fun2();

}