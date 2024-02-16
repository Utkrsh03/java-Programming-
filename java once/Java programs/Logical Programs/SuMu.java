class SuMu{
	public static void main(String [] args){
		int x=1;
		int sum=0;
		int mul=1;
		while(x<=10){
			if(x%2==0){
				sum=sum+x;
			}else{
				mul=mul*x;
			}
			x++;
		}

		System.out.println("Sum:" + sum);
		System.out.println("Mul:" + mul);
	}
}
