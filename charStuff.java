import java.io.*;
import java.util.*;

public class CharStuff{
	public static void main(String args[]){
		int i,len;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		
		//Sending

		len = s.length();
		for(i=0;i<len;i++)
		{
			if(s.charAt(i)=='#'||s.charAt(i)=='*')
			{
				s = s.substring(0,i) + '*' + s.substring(i,s.length());
				i  += 1;
			}
			len = s.length();
		}

		s  = "#" + s + "#";
		System.out.println("Sender: " + s);

		//Receiving

		len = s.length();
		for(i=0;i<len;i++)
		{
			if(s.charAt(i)=='*')
			{
				s = s.substring(0,i) + s.substring(i+1,s.length());

			}
			len = s.length();
		}

		s  = s.substring(1,s.length()-1);
		System.out.println("Receiver: " + s);
	}
}

/* OUTPUT

Enter the string: abc*#d
Sender: #abc***#d#
Receiver: abc*#d

*/
