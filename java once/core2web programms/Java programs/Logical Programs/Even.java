class Even{
	public static void main(String [] args){
		int N=942111423;
		
		while(N!=0){
			int x=N%10;
			if(x%2==0){
				System.out.println(x*x);
			}
			N=N/10;
		}
	}
}
