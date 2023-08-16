package interview.com;

public class FirstLowerAndSecondUpperStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="This Is Karthik This Is Karthik";
		
		int mid=s.length()/2;
		
		String lowercase="";
		String upperCase="";
		
		for(int i=0;i<s.length();i++) {
			
			if(i<mid)
				lowercase=lowercase+Character.toLowerCase(s.charAt(i));
			else
				upperCase=upperCase+Character.toUpperCase(s.charAt(i));
			
			
		}
		
		System.out.println(lowercase+upperCase);
	}

}
