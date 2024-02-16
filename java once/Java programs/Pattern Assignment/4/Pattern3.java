class Pattern3{
	public static void main(String [] args){
		int N=4;
		int num=10;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num + " ");
				num--;
			}
			num++;
			System.out.println();
		}
	}
}
