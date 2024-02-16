class Armstrong{
	public static void main(String [] args){
		int N=23;
		int temp=N;
		int temp1=N;
		int count=0;
		int sum=0;

		while(temp!=0){
			temp=temp/10;
			count++;
		}

		while(temp1!=0){
			int remainder=temp1%10;
			int mult=1;
			for(int i=1;i<=count;i++){
				mult=mult*remainder;
			}

			sum=sum+mult;
			temp1=temp1/10;
		}

		if(sum==N){
			System.out.println("The given No is a Armstrong No");
		}else{
			System.out.println("The given no is not a armstrong no");
		}
	}
}
