import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String text=scan.nextLine();
		System.out.print(UserMainCode.regularExpression(text));
	}
}

class UserMainCode{
	public static boolean regularExpression(String text){
		return text.matches("[a-zA-Z0-9][R][0-9][a-zA-Z0-9]");
	}
}