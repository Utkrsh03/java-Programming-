import java.io.*;
class Pattern3{
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the no of rows:");
		int rows=Integer.parseInt(br.readLine());

		int num=rows;

		for(int i=1;i<=rows;i++){
			int num1=num;
			for(int j=rows;j>=i;j--){
				System.out.print(i*num1 + " ");
				num1--;
			}
			num--;
			System.out.println();
		}
	}
}
