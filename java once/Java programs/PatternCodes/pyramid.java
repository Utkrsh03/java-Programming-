class Pyramid{
	public static void main(String [] args){
		int N=6;
		int space=N-1;
		for(int i=1;i<=N;i++){
			int current=space;
			for(;current!=0;current--){
				System.out.print(" ");
			}
			space--;
			for(int j=1;j<=i;j++){
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}
}
