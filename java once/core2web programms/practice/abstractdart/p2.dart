mixin demo parent(){
  void m1(){
    print("In m1 construct");
  }
}
  class demo{
    void void m2(){
      print("in m2 demo");
    }
  }
  class demochild extends demo with demo parent{
    
  }

