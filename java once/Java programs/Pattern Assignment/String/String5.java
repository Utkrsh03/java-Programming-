import java.io.*;
class String5{
	static int myCompareTo(String str1,String str2){
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		if(arr1.length==arr2.length){
			int len=arr1.length;
			int i=0;
			while(i<len){
				if(arr1[i]==arr2[i]){
					i++;
					continue;
				}else{
					int diff=arr1[i]-arr2[i];
					return diff;
				}
				
			}
		}else{
			int diff=arr1.length-arr2.length;
			return diff;
		}
		return 0;
	}
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first String:");
		String str1=br.readLine();
		System.out.println("Enter the Second string:");
		String str2=br.readLine();

		System.out.println("My Functions Output:" + myCompareTo(str1,str2));

		System.out.println("compareTO() output:" + str1.compareTo(str2));

	}
}
