import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		System.out.println(UserMainCode.repeatFront(str,n));
		
	}
	}
	
class UserMainCode{
	public static String repeatFront(String str,int n){
		int l=str.length();
		String ne="";
		if(l==0){
			return str;
		}
		else if(l<3){
			for(int i=0;i<n;i++){
				ne+=str;
			}
			}
			else{
				String FT=str.substring(0,3);
				for(int i=0;i<n;i++){
					ne+=FT;
				}
			}
		return ne;
	} 
}
	