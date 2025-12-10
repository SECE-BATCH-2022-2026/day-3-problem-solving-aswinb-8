import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String value=scan.nextLine();
		System.out.print(UserMainCode.phoneValidation(value));
	}
}

class UserMainCode{
	public static boolean phoneValidation(String val){
		return val.matches("[1-9]{2}[0-9]{8}");
	}
}