import java.io.*;
class MyLength{
	static int myLength(String str){
		char[] arr=str.toCharArray();
		
	}
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String:");
		String str=br.readLine();
		//System.out.println(myLength(str));
		System.out.println(str.length());
			
	}
}
