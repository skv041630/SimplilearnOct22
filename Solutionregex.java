package NewPack;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solutionregex {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    	//^	[a-zA-Z0-9_]{8,30}$
	    	
		    	Scanner scan=new Scanner(System.in);
		    	int n = Integer.parseInt(scan.nextLine());
		        while (n-- != 0) {
		            String userName = scan.nextLine();
		    	Pattern p= Pattern.compile("^[a-zA-Z]\\w{7,29}$");
		    	Matcher m=p.matcher(userName);
		    	if (m.matches())
		    	{
		    		System.out.println("Valid");
		    	}
		    	else
		    		System.out.println("Invalid");
	}
}
}