class ReverseNo{
	public static void main(String [] args){
		int N=942111423;
		int New=0;

		while(N!=0){
			int x=N%10;
			New=New*10 + x;
			N=N/10;
		}
		System.out.println(New);
	}
}
