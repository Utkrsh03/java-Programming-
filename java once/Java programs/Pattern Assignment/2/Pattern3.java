class Pattern3{
	public static void main(String [] args){
		int N=4;
		int num=14;
		for(int i=1;i<=N;i++){
			int curr=num;
			for(int j=1;j<=N;j++){
				
				System.out.print(curr + " ");
				curr++;
			}
			num++;
			System.out.println();
		}
	}
}
