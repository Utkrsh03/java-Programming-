class StringBuffer1{
	public static void main(String [] args){
		StringBuffer sb=new StringBuffer("Shivani");
		System.out.println(sb.capacity());
		System.out.println(System.identityHashCode(sb));
		sb=sb.append("Kachare");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(System.identityHashCode(sb));
		sb.append("Nitin");
		System.out.println(sb.capacity());
		sb.append("DevyaniNitinKachare");
		System.out.println(sb.capacity());
	}
}
