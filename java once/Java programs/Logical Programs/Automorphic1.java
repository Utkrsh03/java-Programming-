class Automorphic1{
	public static void main(String [] args){
		int N=76;
		int temp=N;
		int square=N*N;
		int count=0;
		while(N!=0){
			if(N%10!=square%10){
				count++;
			}
			N=N/10;
			square=square/10;
		}
		if(count==0){
			System.out.println("It is Automorphic");
		}else{
			System.out.println("It is not a Automorphic.");
		}
	}
}
