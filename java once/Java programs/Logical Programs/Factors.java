class Factors{
	public static void main(String [] args){
		int N=6;
		int count=0;
		for(int i=1;i<=N;i++){
			if(N%i==0){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("The no of factors are: " + count);
	}
}
