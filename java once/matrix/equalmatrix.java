public class equalmatrix {
    

    public static void main(String args[]){
        int row1, row2 , col1, col2 ;
        boolean flag= true ;

         //Initialize matrix a    
         int a[][] = {       
            {1, 2, 3},    
            {8, 4, 6},    
            {4, 5, 7}    
        }; 

        //initialize matrix b 
        int b[][]={{5,6,7},{6,67,7},{2,4,5}};

        // calculate the rows and columns 

        row1=a.length;
        col1=a[0].length;

        
        row2=a.length;
        col2=a[0].length;

        if(row1 != row2 || col1 != col2){    
            System.out.println("Matrices are not equal");    
        }   
        else {    
            for(int i = 0; i < row1; i++){    
                for(int j = 0; j < col1; j++){    
                  if(a[i][j] != b[i][j]){    
                      flag = false;    
                      break;    
                  }    
                }    
            }    
            f(flag)    
                System.out.println("Matrices are equal");    
            else    
                System.out.println("Matrices are not equal");    
        }    
                


    }
}
