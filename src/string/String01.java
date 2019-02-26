package string;

public class String01 {

    private static String helloName(String name) {
        //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
        //helloName("Bob") → "Hello Bob!"
        return  "Hello " + name + "!";
    }

    private static String makeAbba(String a, String b) {
        //Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
        //makeAbba("Hi", "Bye") → "HiByeByeHi"
        return a+b+b+a;
    }

    private static String makeTags(String tag, String word) {
        //The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
        //In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
        //Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
        //makeTags("i", "Yay") → "<i>Yay</i>"
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    private static String makeOutWord(String out, String word) {
        //Given an "out" string length 4, such as "<<>>", and a word,
        //return a new string where the word is in the middle of the out string, e.g. "<<word>>".
        //Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
        //makeOutWord("<<>>", "Yay") → "<<Yay>>"
        return out.substring(0, 2) + word + out.substring(2);
    }

    private static String extraEnd(String str) {
        //Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
        //The string length will be at least 2.
        //extraEnd("Hello") → "lololo"
        if (str.length() <= 2) { return str + str + str; }
        else {
            String LastTwoChars = str.substring(str.length() - 2);
            return LastTwoChars + LastTwoChars + LastTwoChars;
        }
    }

    private static String firstTwo(String str) {
        //Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
        //If the string is shorter than length 2, return whatever there is, so "X" yields "X",
        //and the empty string "" yields the empty string "".
        //Note that str.length() returns the length of a string.
        //firstTwo("Hello") → "He"
        if (str.length() < 2) { return str; }
        else { return str.substring(0, 2); }
    }

    private static String firstHalf(String str) {
        //Given a string of even length, return the first half.
        //So the string "WooHoo" yields "Woo".
        //firstHalf("WooHoo") → "Woo"
        return str.substring(0, str.length()/2);
    }

    private static String withoutEnd(String str) {
        //Given a string, return a version without the first and last char, so "Hello" yields "ell".
        //The string length will be at least 2.
        //withoutEnd("Hello") → "ell"
        return str.substring(1, str.length()-1);
    }

    private static String comboString(String a, String b) {
        //Given 2 strings, a and b, return a string of the form short+long+short,
        //with the shorter string on the outside and the longer string on the inside.
        //The strings will not be the same length, but they may be empty (length 0).
        //comboString("Hello", "hi") → "hiHellohi"
        //comboString("hi", "Hello") → "hiHellohi"
        if (a.length() > b.length()) { return b + a + b; }
        else { return a + b + a; }
    }

    private static String nonStart(String a, String b) {
        //Given 2 strings, return their concatenation, except omit the first char of each.
        //The strings will be at least length 1.
        //nonStart("Hello", "There") → "ellohere"
        //nonStart("java", "code") → "avaode"
        return a.substring(1) + b.substring(1);
    }

    private static String left2(String str) {
        //Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
        //The string length will be at least 2.
        //left2("Hello") → "lloHe"
        return str.substring(2) + str.substring(0, 2);
    }

    private static String right2(String str) {
        //Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
        //The string length will be at least 2.
        //right2("Hello") → "loHel"
        return str.substring(str.length()-2) + str.substring(0, str.length()-2);
    }

    private static String theEnd(String str, boolean front) {
        //Given a string, return a string length 1 from its front, unless front is false,
        //in which case return a string length 1 from its back. The string will be non-empty.
        //theEnd("Hello", true) → "H"
        //theEnd("Hello", false) → "o"
        if (front) { return str.substring(0, 1); }
        else { return str.substring(str.length()-1); }
    }

    private static String withouEnd2(String str) {
        //Given a string, return a version without both the first and last char of the string.
        //The string may be any length, including 0.
        //withouEnd2("Hello") → "ell"
        //withouEnd2("abc") → "b"
        //withouEnd2("ab") → ""
        //withouEnd2("a") → ""
        //withouEnd2("") → ""
        if (str.length() < 2) { return ""; }
        else { return str.substring(1, str.length()-1); }
    }

    private static String middleTwo(String str) {
        //Given a string of even length, return a string made of the middle two chars,
        //so the string "string" yields "ri". The string length will be at least 2.
        //middleTwo("string") → "ri"
        //middleTwo("tests") → "s"
        if (str.length()%2 == 0) { return str.substring(str.length()/2-1, str.length()/2+1); }
        else { return str.substring(str.length()/2, str.length()/2+1); }
    }

    private static boolean endsLy(String str) {
        //Given a string, return true if it ends in "ly".
        //endsLy("oddly") → true
        //endsLy("y") → false
        return str.length() >= 2 && str.substring(str.length() - 2).equals("ly");
    }

    private static String nTwice(String str, int n) {
        //Given a string and an int n, return a string made of the first and last n chars from the string.
        //The string length will be at least n.
        //nTwice("Chocolate", 3) → "Choate"
        //nTwice("Chocolate", 1) → "Ce"
        return str.substring(0, n) + str.substring(str.length()-n);
    }

    private static String twoChar(String str, int index) {
        //Given a string and an index, return a string length 2 starting at the given index.
        //If the index is too big or too small to define a string length 2, use the first 2 chars.
        //The string length will be at least 2.
        //twoChar("java", 0) → "ja"
        //twoChar("java", 2) → "va"
        //twoChar("java", 5) → "ja"
        if ((index + 2) > str.length() || index < 0) { return str.substring(0, 2); }
        else { return str.substring(index, index + 2); }
    }

    private static String middleThree(String str) {
        //Given a string of odd length, return the string length 3 from its middle,
        //so "Candy" yields "and". The string length will be at least 3.
        //middleThree("Candy") → "and"
        //middleThree("and") → "and"
        if (str.length()%2 != 0) { return str.substring(str.length()/2-1, str.length()/2+2); }
        else { return str.substring(str.length()/2-1, str.length()/2+1); }
    }

    private static boolean hasBad(String str) {
        //Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
        //such as with "badxxx" or "xbadxx" but not "xxbadxx".
        //The string may be any length, including 0. Note: use .equals() to compare 2 strings.
        //hasBad("badxx") → true
        //hasBad("xbadxx") → true
        //hasBad("xxbadxx") → false
        if (str.length() >= 3 && str.substring(0, 3).equals("bad")) { return true; }
        else { return str.length() >= 4 && str.substring(1, 4).equals("bad"); }
    }

    private static String atFirst(String str) {
        //Given a string, return a string length 2 made of its first 2 chars.
        //If the string length is less than 2, use '@' for the missing chars.
        //atFirst("hello") → "he"
        //atFirst("hi") → "hi"
        //atFirst("h") → "h@"
        if (str.length() >= 2) { return str.substring(0, 2); }
        else if (str.length() == 1) { return str.substring(0, 1) + "@"; }
        else { return "@@"; }
    }

    private static String lastChars(String a, String b) {
        //Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
        //so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
        //lastChars("last", "chars") → "ls"
        //lastChars("yo", "java") → "ya"
        //lastChars("hi", "") → "h@"
        if (a.length() >= 1 && b.length() >= 1) { return a.substring(0, 1) + b.substring(b.length()-1); }
        else if (a.length() == 0 && b.length() != 0) { return "@" + b.substring(b.length()-1); }
        else if (a.length() != 0 /*&& b.length() == 0*/) { return a.substring(0, 1) + "@"; }
        else { return "@@"; }
    }

    private static String conCat(String a, String b) {
        //Given two strings, append them together (known as "concatenation") and return the result.
        //However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
        //conCat("abc", "cat") → "abcat"
        //conCat("dog", "cat") → "dogcat"
        //conCat("abc", "") → "abc"
        if (a.length() > 0 && b.length() > 0 && a.substring(a.length()-1).equals(b.substring(0, 1))) { return a + b.substring(1); }
        else { return a + b; }
    }

    private static String lastTwo(String str) {
        //Given a string of any length, return a new string where the last 2 chars,
        //if present, are swapped, so "coding" yields "codign".
        //lastTwo("coding") → "codign"
        //lastTwo("cat") → "cta"
        //lastTwo("ab") → "ba"
        if (str.length() < 2) { return str;}
        else { return str.substring(0, str.length()-2) + str.substring(str.length()-1) + str.substring(str.length()-2, str.length()-1); }
    }

    private static String seeColor(String str) {
        //Given a string, if the string begins with "red" or "blue" return that color string,
        //otherwise return the empty string.
        //seeColor("redxx") → "red"
        //seeColor("blueTimes") → "blue"
        if (str.length() >= 3 && str.substring(0, 3).equals("red")) { return str.substring(0, 3); }
        else if (str.length() >= 4 && str.substring(0, 4).equals("blue")) { return str.substring(0, 4); }
        else { return ""; }
    }

    private static boolean frontAgain(String str) {
        //Given a string, return true if the first 2 chars in the string
        //also appear at the end of the string, such as with "edited".
        //frontAgain("edited") → true
        //frontAgain("edit") → false
        //frontAgain("ed") → true
        return str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length()-2));
    }

    private static String minCat(String a, String b) {
        //Given two strings, append them together (known as "concatenation") and return the result.
        //However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string.
        //So "Hello" and "Hi" yield "loHi".The strings may be any length.
        //minCat("Hello", "Hi") → "loHi"
        //minCat("Hello", "java") → "ellojava"
        //minCat("java", "Hello") → "javaello"
        if (a.length() > b.length()) { return a.substring(a.length()-b.length()) + b; }
        else if (a.length() < b.length()) { return a + b.substring(b.length()-a.length()); }
        else { return a + b; }
    }

    private static String extraFront(String str) {
        //Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
        //The string may be any length. If there are fewer than 2 chars, use whatever is there.
        //extraFront("Hello") → "HeHeHe"
        //extraFront("ab") → "ababab"
        //extraFront("H") → "HHH"
        if (str.length() >= 2) { return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2); }
        else { return str + str + str; }
    }

    private static String without2(String str) {
        //Given a string, if a length 2 substring appears at both its beginning and end,
        //return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
        //The substring may overlap with itself, so "Hi" yields "".
        //Otherwise, return the original string unchanged.
        //without2("HelloHe") → "lloHe"
        //without2("HelloHi") → "HelloHi"
        //without2("Hi") → ""
        if (str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length()-2))) { return str.substring(2); }
        else { return str; }
    }

    private static String deFront(String str) {
        //Given a string, return a version without the first 2 chars.
        //Except keep the first char if it is 'a' and keep the second char if it is 'b'.
        //The string may be any length. Harder than it looks.
        //deFront("java") → "va"
        //deFront("away") → "aay"
        if (str.substring(0, 2).equals("ab")) { return str; }
        else if (str.substring(0, 1).equals("a")) { return "a" + str.substring(2); }
        else if (str.substring(1, 2).equals("b")) { return "b" + str.substring(2); }
        else { return str.substring(2); }
    }

    private static String startWord(String str, String word) {
        //Given a string and a second "word" string, we'll say that the word matches the string
        //if it appears at the front of the string, except its first char does not need to match exactly.
        //On a match, return the front of the string, or otherwise return the empty string.
        //So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
        //The word will be at least length 1.
        //startWord("hippo", "hi") → "hi"
        //startWord("hippo", "xip") → "hip"
        //startWord("hippo", "i") → "h"
        if (word.length() > str.length()) { return ""; }
        else if (word.equals(str.substring(0, word.length()))) { return str.substring(0, word.length()); }
        else if (word.length() >= 2 && word.substring(1).equals(str.substring(1, word.length()))) { return str.substring(0, word.length()); }
        else if (word.length() == 1) { return str.substring(0, 1); }
        else { return ""; }
    }

    private static String withoutX(String str) {
        //Given a string, if the first or last chars are 'x',
        //return the string without those 'x' chars,
        //and otherwise return the string unchanged.
        //withoutX("xHix") → "Hi"
        //withoutX("xHi") → "Hi"
        //withoutX("Hxix") → "Hxi"
        if (str.length() < 2) { return ""; }
        else if (str.substring(0, 1).equals("x") && str.substring(str.length()-1).equals("x")) { return str.substring(1, str.length()-1); }
        else if (str.substring(0, 1).equals("x")) { return str.substring(1); }
        else if (str.substring(str.length()-1).equals("x")) { return str.substring(0, str.length()-1); }
        else { return str; }
    }

    private static String withoutX1(String str) {
        // Solution  notes: check for the 'x' in both spots. If found, use substring()
        // to grab the part without the 'x'. Check that the length is greater than 0
        // each time -- the need for the second length check is tricky to see.
        // One could .substring() instead of .charAt() to look into the string.
        if (str.length() > 0 && str.charAt(0) == 'x') { str = str.substring(1); }
        if (str.length() > 0 && str.charAt(str.length()-1) == 'x') { str = str.substring(0, str.length()-1); }
        return str;
    }

    private static String withoutX2(String str) {
        //Given a string, if one or both of the first 2 chars is 'x',
        //return the string without those 'x' chars, and otherwise return the string unchanged.
        //This is a little harder than it looks.
        //withoutX2("xHi") → "Hi"
        //withoutX2("Hxi") → "Hi"
        //withoutX2("Hi") → "Hi"
        if (str.length() < 2) {return "";}
        else if (str.charAt(0) == 'x' && str.charAt(1) == 'x') { return str.substring(2); }
        else if (str.charAt(0) == 'x') { return str.substring(1); }
        else if (str.charAt(1) == 'x') { return str.charAt(0) + str.substring(2); }
        else { return str; }
    }

    public static void callString01() {

        System.out.println(helloName("Bob"));

        System.out.println(makeAbba("Hi", "Bye"));

        System.out.println(makeTags("i", "Yay"));

        System.out.println(makeOutWord("<<>>", "Yay"));

        System.out.println(extraEnd("Hello"));

        System.out.println(firstTwo("Hello"));

        System.out.println(firstHalf("WooHoo"));

        System.out.println(withoutEnd("Hello"));

        System.out.println(comboString("Hello", "hi"));

        System.out.println(nonStart("Hello", "There"));

        System.out.println(left2("Hello"));

        System.out.println(right2("Hello"));

        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));

        System.out.println(withouEnd2("Hello"));

        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("tests"));

        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));

        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));

        System.out.println(twoChar("java", 2));
        System.out.println(twoChar("java", 5));

        System.out.println(middleThree("Candy"));

        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));

        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));

        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("", ""));

        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));

        System.out.println(lastTwo("coding"));
        System.out.println(lastTwo("ab"));
        System.out.println(lastTwo("a"));

        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("blueTimes"));
        System.out.println(seeColor(""));

        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));

        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));

        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
        System.out.println(extraFront("H"));

        System.out.println(without2("HelloHe"));
        System.out.println(without2("HelloHi"));
        System.out.println(without2("Hi"));

        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
        System.out.println(deFront("xby"));
        System.out.println(deFront("abc"));

        System.out.println(startWord("hippo", "hi"));
        System.out.println(startWord("hippo", "xip"));
        System.out.println(startWord("hippo", "i"));

        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX1("Hxix"));

        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));
    }
}