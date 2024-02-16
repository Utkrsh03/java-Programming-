class LeftTriangle{
	public static void main(String [] args){
		int N=5;
		
		for(int i=0; i<=N; i++){
			
			  for(int k=2*(N-1); k>=0; k--){
			   	System.out.print(" ");
			   }

			for(int j=0; j<=i; j++){
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}
