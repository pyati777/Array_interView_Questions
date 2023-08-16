package interview.com;

public class RemoveStringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="CloudTeCh";
		char ch='C';
		removeChar(s,ch);
	//	System.out.println(s.toUpperCase().replaceAll("C", ""));
//		System.out.println(s.replaceAll("C", ""));
	}
	
	public static void removeChar(String str,char c) {
		
		int n=str.length();
		String finalString="";
		for(int i=0;i<n;i++) {
			if(str.charAt(i)!=c) {
				
				finalString=finalString+str.charAt(i);
			}
		}
		System.out.println("finalstring is :" + finalString);
	}

}
