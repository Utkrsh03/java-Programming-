class Factorial{
	public static void main(String[] args){
		int x=6;
		int fact=1;
		while(x!=0){
			fact=fact*x;
			x--;
		}
		System.out.println("Factorial:" + fact);
	}
}
