class Prime{
	public static void main(String [] args){
	
		int N=7;
		int count=0;
		
		for(int i=1;i<=N;i++){
			if(N%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println("The number is a prime number");
		}else{
			System.out.println("The number is not a prime number");
		}
	}
}
