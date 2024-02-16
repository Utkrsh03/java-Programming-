class BreakStatement{
	public static void main(String [] args){
		
		int N=15;
		int count=0;
		int i=1;

		for(;i<=N;i++){
			if(N%i==0){
				count++;
			}
			if(count>2){
				break;
			}
		}
		System.out.println(i);
		if(count==2){
			System.out.println("The number is a prime no.");
		}else{
			System.out.println("The number is not a prime no.");
		}
	}
}
