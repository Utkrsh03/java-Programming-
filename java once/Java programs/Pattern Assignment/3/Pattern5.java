class Pattern5{
	public static void main(String [] args){
		int N=4;
		int num=10;
		for(int i=1;i<=N;i++){
			for(int j=N;j>=i;j--){
				System.out.print(num + " ");
			}
			System.out.println();
			num++;
		}
	}
}
