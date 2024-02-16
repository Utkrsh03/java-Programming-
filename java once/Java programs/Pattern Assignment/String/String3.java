import java.io.*;
class String3{
	static int strlen(String str){
		char[] arr=str.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++){
			count++;
		}
		return count;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String:");
		String str1=br.readLine();
		String str2=br.readLine();
		if(strlen(str1)==strlen(str2)){
			System.out.println("The Strings are equal in length.");
		}else{
			System.out.println("The string are not equal.");
		}
	}
}
