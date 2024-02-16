class NoofPrimes{
	public static void main(String [] args){
		
		int count=0;
		for(int i=100;i<=900;i++){
			int ch=0;
			for(int j=2;j<11;j++){
				if(i%j==0){
					ch=0;
					break;
				}else{
					ch=1;
				}
			}
			if(ch==1){
				count++;
			}
		}
		System.out.println("The no of prime nos in the range 100 to 900 is "+ count);
	}
}
