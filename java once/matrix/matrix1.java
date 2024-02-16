class matrix1{


    public static void main(String args []){
     
         // creating the two matrics
         int a[][]={{1,2,3}, {3,4,5} ,{6,7,8}};
         int b[] []={{3,4,5},{6,5,4},{9,8,7}};

        //creating thr other matrix to store the sum of matrixs

        int c[][]=new int[3][3];

        //adding and the printing the matrix 

        for(int i=0 ; i<3 ; i++){
            for(int j=0;j<3 ; j++){
                c[i][j]=a[i][j]+b[i][j] ;
                System.out.println(c[i][j]);
            }
            // for new line
            System.out.println();
        }

    }
}