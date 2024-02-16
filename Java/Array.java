import java.util.*;
public class Array {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String a[] = new String[size];

        //input
        for(int i=0 ;i<size;i++){
            a[i] = sc.next();
        }

System.out.println("Output:" );

        //output
        for( int j=0 ;j<size;j++){
            System.out.println(a[j]);
        }
        
    }


}
