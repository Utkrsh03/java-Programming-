class Count{
	public static void main(String [] args){
		int N=942111423;
		int count=0;
		while(N!=0){
			N=N/10;
			count++;
		}
		System.out.println(count);

	}
}
