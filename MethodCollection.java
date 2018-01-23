package a2;

import java.util.Scanner;

/**
 * A collection of methods for the second assignment of CS 1410.
 * 
 * @author Hoang Nguyen u1134317
 */

/*
 * Instructions for students: Use the main method only to make calls to the
 * other methods to test them. The correct operation of your methods should not
 * depend in any way on the code in main.
 * 
 * Do not do any printing within the method bodies, except the main method.
 * 
 * Leave your testing code in main -- you will be graded on this. You can remove
 * this comment from your submission.
 */
public class MethodCollection {
	/**
	 * In main, write code that exercises all the methods you write. This code
	 * should call the methods with different arguments and print out results. You
	 * should think about different arguments to try that tests different cases. For
	 * example, if the method returns a true or false, write code that creates a
	 * true result and other code that produces a false result. Use print statements
	 * to explain what each test is checking and the result that was obtained.
	 * Running this program should output a small report on examples of using the
	 * different methods.
	 * 
	 * Replace this comment with your own Javadoc comment
	 */
	public static void main(String[] args) 
	{
		int tokenCounted = countTokens("It's not what happens to you, but how you react to it that matters.");
		System.out.println("The number of token is " + tokenCounted);
		int typeNotInt = countTokensThatAreNotInt("2 steps with 3 turns and 100 degree boil water");
		System.out.println("The number of letters is " +typeNotInt);
		String nandnn = describeSign(-4);
		System.out.println("The type of number is " + nandnn);
		nandnn = describeSign(50);
		System.out.println("The type of number is " + nandnn);
		boolean IsIt = isEvenlyDivisibleBySeven(16);
		System.out.println(IsIt);
		IsIt = isEvenlyDivisibleBySeven(21);
		System.out.println(IsIt);
		String something = makeLine('+', '-', 10);
		System.out.println(something);
		something = makeLine('+', '-', 35);
		System.out.println(something);
		int width = 5;
		String row = makeLine('+', '-', width);
		System.out.println(row);
		int i = 0;
		while (i != width -2) 
		{
			String boring = makeSquare(width);
			System.out.println(boring);
			i++;
		}
		System.out.println(row);
		String s1 = capitalizeLastCharacter("Skywalker");
		System.out.println(s1);
		String s2 = capitalizeLastCharacter("EVERY/THING/IS/UPPER/CASE");
		System.out.println(s2);
		String s3 = capitalizeLastCharactersInSentence("My name is Shelock Holmes");
		System.out.print(s3);
	}
	

	/**
	 * Returns the number of tokens (as identified by the s.next() method on a
	 * Scanner s) that appears in the parameter sentence.
	 * 
	 * For example, countTokens("this is a test") should return 4, and
	 * countTokens("") should return 0.
	 * 
	 * IMPLEMENTATION NOTE: This will require a while loop. Use a Scanner to split
	 * the string into individual words.
	 * 
	 * You may not use more advanced Java functions that do the token counting for
	 * you.
	 * 
	 * Replace this comment with your own Javadoc comment
	 */
	
	public static int countTokens(String sentence) {
		// Change or modify the return. This is here for now to prevent compiler errors.
		Scanner s = new Scanner(sentence);
		int i = 0;
		while(s.hasNext()) {
			s.next();
			i++;
		}
		return i;
	}

	/**
	 * Returns the number of tokens (as identified by the s.next() method on
	 * Scanners s) in the parameter sentence that are not an int, as identified by
	 * s.hasNextInt(). For example, countTokensThatAreNotInt("this is 12 a test")
	 * should return 4, and countTokensThatAreNotInt("12") should return 0.
	 * 
	 * IMPLEMENTATION NOTE: This will require a while loop. Use a Scanner to split
	 * the string into individual words. Use an if statement to figure out whether
	 * to count the token or not.
	 * 
	 * Replace this comment with your own Javadoc comment
	 */
	public static int countTokensThatAreNotInt(String sentence) {
		// Change or modify the return. This is here for now to prevent compiler errors.
		Scanner s = new Scanner(sentence);
		int i = 0;
		while(s.hasNext()) {
			if (s.hasNextInt()) {
				s.next();
			}
			else{
				i++;
				s.next();
			}
		}
		return i;
	}

	/**
	 * Returns a string literal "negative" if the parameter is less than zero and
	 * returns the string literal "non-negative" if the value is greater than or
	 * equal to zero.
	 * 
	 * For example, the method call describeSign(7) should return "non-negative".
	 * 
	 * You should use an if statement.
	 * 
	 * You must return these strings exactly (all lower case letters, spelled
	 * correctly, no extra spaces). Also note that the double quotes are used to
	 * denote a string literal, they do not appear in the actual string.
	 * 
	 * Do not print the string return value.
	 * 
	 * Replace this comment with your own Javadoc comment
	 * 
	 */
	public static String describeSign(int value) {
		// Change or modify the return. This is here for now to prevent compiler errors.
		String s = new String("");
		if(value < 0){
			s = "negative";
		}
		else if (value >= 0) {
			s = "non-negative";
		}
		return s;
	}

	/**
	 * Returns true if the value parameter is evenly divisible by 7 and false
	 * otherwise.
	 * 
	 * For example, the method call isEvenlyDivisibleBySeven(14) should return true.
	 * The method call isEvenlyDivisibleBySeven(16) should return false.
	 * 
	 * You will want to use the modulus operator %, which evaluates to the remainder
	 * of x/y. When the remainder is 0, x is evenly divisible by y.
	 * 
	 * A starting point for learning about modulus is
	 * https://www.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/what-is-modular-arithmetic
	 * 
	 * Replace this comment with your own Javadoc comment
	 */
	public static boolean isEvenlyDivisibleBySeven(int value) {
		// Change or modify the return. This is here for now to prevent compiler errors.
		int remainder = value % 7;
		if (remainder == 0) {
			return true;
		}
		else
			return false;
	}

	/**
	 * Returns a String of length width that begins and ends with the character edge
	 * and contains width-2 copies of the character inner in between. For example,
	 * if edge is '+', inner is '-', and width is 8, the method should return
	 * "+------+".
	 * 
	 * The method does not print anything. The parameter width must be greater than
	 * or equal to 2.
	 * 
	 * IMPLEMENTATION NOTE: This method is already completely implemented. There is
	 * no need for you to change anything.
	 * 
	 * Replace this comment with your own Javadoc comment
	 */
	public static String makeLine(char edge, char inner, int width) {
		String line = "";
		int i = 0;
		while (i < width - 2) {
			line = line + inner;
			i = i + 1;
		}
		return edge + line + edge;
	}

	/**
	 * Returns a string which, when printed out, will be a square shaped like this,
	 * but of varying size:
	 * 
	 * <pre>
	 * +-----+
	 * |     |
	 * |     |
	 * |     |
	 * |     |
	 * |     |
	 * +-----+
	 * </pre>
	 * 
	 * The returned string should consist of width lines, each ending with a
	 * newline. In addition to the newline, the first and last lines should begin
	 * and end with '+' and should contain width-2 '-' symbols. In addition to the
	 * newline, the other lines should begin and end with '|' and should contain
	 * width-2 spaces.
	 * 
	 * A newline is a special character use to force one string to be on multiple
	 * lines. System.out.println("Hi\nThere"); will produce output like Hi There The
	 * '\n' character is a newline.
	 * 
	 * The method does not print anything. The width parameter must be greater than
	 * or equal to 2.
	 * 
	 * IMPLEMENTATION NOTE: For full credit (and for easier implementation), make
	 * use of the makeLine method in your implementation of makeRectangle. You'll
	 * need to use a loop to call makeLine the correct number of times.
	 * 
	 * Replace this comment with your own Javadoc comment
	 */
	public static String makeSquare(int width) {
		String line = "";
		int i = 0; //y = 0;
		//while (y != width - 2) {
			while (i < width - 2) {
				line = line + " " ;
				i++;
			//}
			//y++;
		}
		return "|" + line + "|";
	}

	/**
	 * Returns the string that results from capitalizing the last character of word,
	 * which is required to have at least one character. For example,
	 * capitalizeLastCharacter("hello") is "hellO" and
	 * capitalizeLastCharacter("JACK") is "JACK".
	 * 
	 * IMPLEMENTATION NOTE: The static method Character.toUpperCase() will be
	 * helpful. The methods s.charAt() and s.substring() [where s is a String] will
	 * also be helpful.
	 * 
	 * Since Strings are immutable, you cannot just change the last character. Think
	 * about breaking the given string into pieces, modifying the last part and then
	 * building up a new String in the correct form.
	 * 
	 * 
	 * Replace this comment with your own Javadoc comment
	 */
	public static String capitalizeLastCharacter(String word) {
		// Change or remove this statement as needed
		int new1 = word.length() - 1;
		char c = word.charAt(new1);
		return word.substring(0, word.length() - 1) + Character.toUpperCase(c);
	}

	/**
	 * Returns the string that results from capitalizing the last character of every
	 * word in the input parameter sentence, which is required to have at least one
	 * character. For example, capitalizeLastCharactersInSentence("Hello there")
	 * would return "HellO therE".
	 * 
	 * Replace this comment with your own Javadoc comment
	 */
	public static String capitalizeLastCharactersInSentence(String sentence) {
		// Change or remove this statement as needed
		Scanner s = new Scanner(sentence);
		String s1 = "";
		while (s.hasNext()) {
			String token = s.next();
			int new1 = token.length() - 1;
			char c = token.charAt(new1);	
			 s1 = s1 + token.substring(0, token.length() - 1) + Character.toUpperCase(c) + " ";
			}
		return s1;
	}

}
