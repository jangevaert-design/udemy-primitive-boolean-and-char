package edu.cnm.deepdive;

public class PrimitiveBooleanAndChar {

  public static void main(String[] args) {
    char ch = 'a';
    //char ch1 = 'ab'; does not compile.
    char ch2 = '1';//don't forget that this represents a char and not an int.
    char uniChar = '\u03A9';//represents upper case greek Omega character.
    char roman = '\u216c';// represents the Roman 50 number.

    System.out.println("ch2 = " + ch2);
    System.out.println("uniChar = " + uniChar);
    System.out.println("roman = " + roman);

    //boolean true = false; will not compile because 'true' is a keyword.
    boolean true1 = false; //compiles but true1 is not a good name.

  }

}
