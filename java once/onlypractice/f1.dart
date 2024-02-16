import 'dart:io';
import "f2.dart" ;

void main(){
  print("enter the number");

   int  num1 = int.parse(stdin.readLineSync()!);
  
   int ret = sumofDigit(num1);
   print(ret);
}