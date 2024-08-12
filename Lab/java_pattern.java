
public class java_pattern{
	public static void main(String args[]){
		String str= "JAVA";
		int n= str.length();
		int i=1;
		while(i<=n){
			String subStr = str.substring(0, i);  // subStr = "Hello"
			System.out.println(subStr);
			i++;
		}
	}
}