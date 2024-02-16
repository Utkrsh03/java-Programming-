import java.io.*;
class ConcatMethod{
	static String myconcat(String str1,String str2){
		char []arr1=str1.toCharArray();
		char []arr2=str2.toCharArray();

		char[] arr3=new char[arr1.length+arr2.length];
		int j=0;
		for(int i=0;i<arr3.length;i++){
			if(i<arr1.length){
				arr3[i]=arr1[i];	
			}else{
				arr3[i]=arr2[j];
				j++;
			}
		}
		String str=new String(arr3);
		return str;

	}
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first String:");
		String str1=br.readLine();
		System.out.println("Enter the second String:");
		String str2=br.readLine();
		String str3=myconcat(str1,str2);
		System.out.println(str3);
		
	}
	
}
