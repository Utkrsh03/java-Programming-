class PerfectNo{
	public static void main(String [] args){
		int N=4;
		int sum=0;
		for(int i=1;i<N;i++){
			if(N%i==0){
				sum=sum+i;
			}
		}
		if(sum==N){
			System.out.println("The no is a perfect no.");
		}else{
			System.out.println("The no is not a perfect no");
		}
	}
}
