package Questao4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringInt {

	public static void main(String[] args) {  
		Scanner in = new Scanner(System.in);
		Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(in.nextLine());
    
        int total = 0;
        boolean b = false;
        
        while( b = matcher.find() ){
            if( b )
                total += Integer.parseInt(matcher.group());
        }
		System.out.println(total);
	}
}