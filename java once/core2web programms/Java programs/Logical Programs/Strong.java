
class Strong{
	public static void main(String [] args){
		int N=145;


		int temp=N;
		int sum=0;
		
		while(N!=0){
			int digit=N%10;
			int fact=1;
			for(int i=digit;i>=1;i--){
				fact=fact*i;
			}
			sum=sum+fact;
			N=N/10;
		}
		if(temp==sum){
			System.out.println(temp + " is a Strong number");
		}else{
			System.out.println(temp + " is not a strong number");
		}
	}
}
