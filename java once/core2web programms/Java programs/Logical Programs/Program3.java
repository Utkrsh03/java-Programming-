import java.util.*;
class Demo2{
	public static void main(String [] args){
		int n=10;
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			int number=sc.nextInt();
			sum=sum+number;
		}
		System.out.println(sum);
	}
}
