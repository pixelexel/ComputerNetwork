import java.io.*;
import java.util.*;

public class bitStuffing{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String code = "011111";
    String append = "01111110";
    String zero = "0";

    //Sending
    System.out.println("Enter the string: ");
    String s = sc.nextLine();

    int index = s.indexOf(code);

    while(index != -1){
      s = s.substring(0,index + 6) + zero + s.substring(index + 6,s.length());
      index = s.indexOf(code,index + 6);
    }

    s = append + s + append;

    System.out.println("Sender String: " + s);

    //Receiving

    String r = s;
    code = "0111110";

    index = r.indexOf(code);

    while(index != -1){
      r = r.substring(0,index + 6) + r.substring(index + 7,r.length());
      index = r.indexOf(code,index + 6);
    }
    int len = append.length();
    r = r.substring(len,r.length() - len); //Removing append from start and end

    System.out.println("Receiver String: " + r);

  }
}


/* OUTPUT

Enter the string: 0111110111110
Sender String: 0111111001111100111110001111110
Receiver String: 0111110111110
*/
