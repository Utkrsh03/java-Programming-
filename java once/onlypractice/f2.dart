import "dart:io";

int sumofDigit (int num1){
     
     int sum= 0 ;

     while(num1!=0){
       int rem=num1 % 10 ;

       sum=sum+rem ;

       num1= num1~/10 ;



     }
     return sum;
}
