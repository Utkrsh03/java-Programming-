import java.io.*;

// java program for left triangle
public class w1 {
	// Function to demonstrate printing pattern
    public static void main (String args[]){
	 {
          int k = 5 ;
		int i,  j ;

		// 1st loop
		for (i = 0; i <=k; i++) {

			// nested 2nd loop
			for ( k = 2 * (k - i); k >= 0; k--) {
				// printing spaces
				System.out.print(" ");
			}

			// nested 3rd loop
			for ( j = 0; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}

			// end-line
			System.out.println();
		}
	

	// Driver Function

}
}
}
