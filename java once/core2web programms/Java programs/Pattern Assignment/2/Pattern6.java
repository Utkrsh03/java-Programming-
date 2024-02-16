class Pattern6{
	public static void main(String [] args){
		int N=3;
		int num=1;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N;j++){
				System.out.print(num*num + " ");
				num++;
			}
			System.out.println();
		}
	}
}
