/**
* <h1>StringDemo1</h1>
* This program demonstrates how we can convert an integer value to
* String value using String class methods
* @author  Vikas
* @version 1.0
* @since   2017-05-27 
*/
package assignment7.session1;

public class StringDemo1 {

	public static void main(String[] args) {
		int a = 32;  
		//we can convert integer value to string using format
		//and valueOf methods
		String stringFormat1=String.format("%d",a); 
		String stringFormat2=String.valueOf(a);
		System.out.println(stringFormat1);
		System.out.println(stringFormat2);
	}

}
