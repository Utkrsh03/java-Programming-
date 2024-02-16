import java.io.*;
class Pattern4{
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the start number:");
		int sno=Integer.parseInt(br.readLine());

		System.out.println("Enter the end number:");
		int eno=Integer.parseInt(br.readLine());

		if(sno%2==0){
			int num=sno;
			for(int i=num;num<=eno;i++){
				System.out.print(num+" ");
				num=num+2;
			}
			System.out.println();
			int num1=sno+1;
			for(int i=num1;num1<=eno;i++){
				System.out.print(num1+" ");
				num1=num1+2;
			}
		}

	}
}
