
//to print first 20 fibonacci number
class Fibonacci{
	public static void main(String [] args){
		int fd=0;
		int sd=0;
		int nd=0;
		int i=0;
		int count=0;
		while(i<=1){
			System.out.println(i);
			if(i==0){
				fd=0;
			}
			if(i==1){
				sd=1;
			}
			i++;
			count++;
		}
		
		while(count<=20){
			nd=fd+sd;
			System.out.println(nd);

			fd=sd;
			sd=nd;
			count++;
		}
	}
}
