class Automorphic{
	public static void main(String [] args){
		int N=76;
		int temp=N;
		int square=N*N;
		int count=0;
		while(temp!=0){
			temp=temp/10;
			count++;
		}
		int reverse=0;
		for(int i=1;i<=count;i++){
			int digit=square%10;
			reverse=reverse*10+digit;
			square=square/10;
		}

		int final1=0;
		for(int i=1;i<=count;i++){
			int digit=reverse%10;
		        final1=final1*10+digit;
			reverse=reverse/10;
		}

		if(N==final1){
			System.out.println(N +" is a Automorphic Number.");
		}else{
			System.out.println(N + " is not a Automorphic Number.");
		}

	}
}
