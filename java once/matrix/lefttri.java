public class lefttri {
   
  
public static void main(String args[])   
{    

int row = 6;       

for (int i=0; i<row; i++){  
      
for (int j=3*(row-i); j>=0; j--){    
System.out.print(" ");   
}

for (int j=0; j<=i; j++ ){      
System.out.print("* ");   
}   

//throws the cursor in a new line after printing each line  
System.out.println();   
}   
}   
}  
