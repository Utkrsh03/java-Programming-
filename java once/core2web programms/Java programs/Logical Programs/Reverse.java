class Reverse{
	public static void main(String [] args){
		int x=7;
		if(x%2==0){
			int y=x;
			while(y!=0){
				System.out.println(y);
				y--;
			}
		}else{
			int y=x;
			while(y>=0){
				System.out.println(y);
				y=y-2;
					
			}
		}
	}
}
