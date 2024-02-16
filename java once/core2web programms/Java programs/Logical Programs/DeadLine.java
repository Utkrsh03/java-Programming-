class DeadLine{
	public static void main(String [] args){
		int N=7;

		while(N>=0){
			if(N>0){
				System.out.println(N + "days remaining");
			}else{
				System.out.println(N + "days remaining.Assignment Overdue");
			}
			N--;
		}
	}
}
