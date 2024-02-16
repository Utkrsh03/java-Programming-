class ForFact{
	public static void main(String [] args){
		int N=6;
		int fact=1;
		for(int i=N;i>=1;i--){
			fact=fact*i;
		}
		System.out.println("Factorial:" + fact);
	}
}
