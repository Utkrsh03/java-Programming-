class pallindrome{
	public static void main(String [] args){
		int N=2332;
		int x=N;

		int New=0;

		while(x!=0){
			int y=x%10;
			New=New*10 + y;
			x=x/10;
		}
		if(New==N){
			System.out.println("It is a pallindrome");
		}

	}
}
