import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String value=scan.nextLine();
		System.out.print(UserMainCode.regularExpression(value));
	}
}

class UserMainCode{
	public static boolean regularExpression(String val){
		return val.matches("^(2[1-9]$)|^(3[0-9]$)|^(4[0-5]$)");
	}
}