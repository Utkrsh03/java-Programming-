import java.io.*;
class Pattern1{
	public static void main(String [] args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Enter The number of rows:");
		int x=Integer.parseInt(br.readLine());	

		System.out.println("Enter the no of columns:");
		int y=Integer.parseInt(br.readLine());

		
			
		for(int i=1;i<=x;i++){
			char ch='A';
			char ch1=(char)(ch+y-1);
			int num=1;
			int num1=y;
			for(int j=1;j<=y;j++){
				if(i%2==0){
					System.out.print(ch +""+num+" ");
					ch++;
					num++;
				}else{
					System.out.print(ch1+""+num1 + " ");
					ch1--;
					num1--;
				}
			}
			System.out.println();
		}

	}
}
