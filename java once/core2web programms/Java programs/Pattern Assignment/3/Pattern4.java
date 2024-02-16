class Pattern4{
	public static void main(String [] args){
		int N=4;
		for(int i=1;i<=N;i++){
			for(int j=N;j>=i;j--){
				System.out.print("3C ");
			}
			System.out.println();
		}
	}
}
