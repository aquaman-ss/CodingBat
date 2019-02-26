package warmup;

public class Warmup01 {

    private static boolean sleepIn(boolean weekday, boolean vacation) {
        //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
        //We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
        //sleepIn(false, false) → true
        //sleepIn(true, false) → false
        //sleepIn(false, true) → true
        return !weekday || vacation;
    }

    private static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
        //We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
        //monkeyTrouble(true, true) → true
        //monkeyTrouble(false, false) → true
        //monkeyTrouble(true, false) → false
        return (aSmile && bSmile) || !(aSmile || bSmile);
        //return (aSmile == bSmile); easy solution
    }

    private static int sumDouble(int a, int b) {
        //Given two int values, return their sum. Unless the two values are the same, then return double their sum.
        //sumDouble(3, 2) → 5
        //sumDouble(2, 2) → 8
        if (a == b) { return (a+b)*2; }
        else { return a+b; }
    }

    private static int diff21(int n) {
        //Given an int n, return the absolute difference between n and 21,
        //except return double the absolute difference if n is over 21.
        if (n > 21) { return (n - 21) * 2; }
        else { return Math.abs(n - 21); }
    }

    private static boolean parrotTrouble(boolean talking, int hour) {
        //We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
        //We are in trouble if the parrot is talking and the hour is before 7 or after 20.
        //Return true if we are in trouble.
        //parrotTrouble(true, 6) → true
        //parrotTrouble(true, 7) → false
        return (hour < 7 || hour > 20) && talking;
    }

    private static boolean makes10(int a, int b) {
        //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
        //makes10(9, 10) → true
        //makes10(9, 9) → false
        //makes10(1, 9) → true
        return a == 10 || b == 10 || (a + b) == 10;
    }

    private static boolean nearHundred(int n) {
        //Given an int n, return true if it is within 10 of 100 or 200.
        //Note: Math.abs(num) computes the absolute value of a number.
        //nearHundred(93) → true
        //nearHundred(89) → false
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
    }

    private static boolean posNegMy(int a, int b, boolean negative) {
        if ((a < 0 & b > 0 || a > 0 & b < 0) && !negative) { return true; }
        else { return a < 0 && b < 0 && negative; }
    }

    private static boolean posNeg(int a, int b, boolean negative) {
        //Given 2 int values, return true if one is negative and one is positive.
        //Except if the parameter "negative" is true, then return true only if both are negative.
        //posNeg(1, -1, false) → true
        //posNeg(-1, 1, false) → true
        //posNeg(-4, -5, true) → true
        if (negative) { return (a < 0 && b < 0); }
        else { return ((a < 0 && b > 0) || (a > 0 && b < 0)); }
    }

    private static String notString(String str) {
        //Given a string, return a new string where "not " has been added to the front.
        //However, if the string already begins with "not", return the string unchanged.
        //Note: use .equals() to compare 2 strings.
        //notString("candy") → "not candy"
        //notString("x") → "not x"
        //notString("not bad") → "not bad"
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) { return str; }
        else { return "not " + str; }
    }

    private static String missingChar(String str, int n) {
        //Given a non-empty string and an int n, return a new string where the char at index n has been removed.
        //The value of n will be a valid index of a char in the original string
        //(i.e. n will be in the range 0..str.length()-1 inclusive).
        //missingChar("kitten", 1) → "ktten"
        //missingChar("kitten", 0) → "itten"
        //missingChar("kitten", 4) → "kittn"
        return str.substring(0, n) + str.substring(n+1);
    }

    private static String frontBack(String str) {
        //Given a string, return a new string where the first and last chars have been exchanged.
        //frontBack("code") → "eodc"
        //frontBack("a") → "a"
        //frontBack("ab") → "ba"
        if (str.length() < 2) { return str; }
        else { return str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.substring(0, 1); }
    }

    private static String front3(String str) {
        //Given a string, we'll say that the front is the first 3 chars of the string.
        //If the string length is less than 3, the front is whatever is there.
        //Return a new string which is 3 copies of the front.
        //front3("Java") → "JavJavJav"
        //front3("Chocolate") → "ChoChoCho"
        //front3("abc") → "abcabcabc"
        if (str.length() < 4) { return str + str + str; }
        else { return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3); }
    }

    private static String backAround(String str) {
        //Given a string, take the last char and return a new string with the last char
        //added at the front and back, so "cat" yields "tcatt".
        //The original string will be length 1 or more.
        //backAround("cat") → "tcatt"
        //backAround("Hello") → "oHelloo"
        //backAround("a") → "aaa"
        return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
    }

    private static boolean or35(int n) {
        //Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
        return (n % 3 == 0 || n % 5 == 0);
    }

    private static String front22(String str) {
        //Given a string, take the first 2 chars and return the string with the 2 chars
        //added at both the front and back, so "kitten" yields"kikittenki".
        //If the string length is less than 2, use whatever chars are there.
        //front22("kitten") → "kikittenki"
        //front22("Ha") → "HaHaHa"
        //front22("abc") → "ababcab"
        if (str.length() < 2) { return str + str +str; }
        else { return str.substring(0, 2) + str + str.substring(0, 2); }
    }

    private static boolean startHi(String str) {
        //Given a string, return true if the string starts with "hi" and false otherwise.
        //startHi("hi") → true
        //startHi("hello hi") → false
        return str.length() > 1 && str.substring(0, 2).equals("hi");
    }

    private static boolean icyHot(int temp1, int temp2) {
        //Given two temperatures, return true if one is less than 0 and the other is greater than 100.
        //icyHot(120, -1) → true
        //icyHot(-1, 120) → true
        //icyHot(2, 120) → false
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }

    private static boolean in1020(int a, int b) {
        //Given 2 int values, return true if either of them is in the range 10..20 inclusive.
        //in1020(12, 99) → true
        //in1020(21, 12) → true
        //in1020(8, 99) → false
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    private static boolean hasTeen(int a, int b, int c) {
        //We'll say that a number is "teen" if it is in the range 13..19 inclusive.
        //Given 3 int values, return true if 1 or more of them are teen.
        //hasTeen(13, 20, 10) → true
        //hasTeen(20, 19, 10) → true
        //hasTeen(20, 10, 13) → true
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    private static boolean loneTeen(int a, int b) {
        // Store teen-ness in boolean local vars first. Boolean local
        // vars like this are a little rare, but here they work great.
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
        // Translation: one or the other, but not both.
        // Alternately could use the Java xor operator, but it's obscure.
    }

    private static boolean loneTeen2(int a, int b) {
        //We'll say that a number is "teen" if it is in the range 13..19 inclusive.
        //Given 2 int values, return true if one or the other is teen, but not both.
        //loneTeen(13, 99) → true
        //loneTeen(21, 19) → true
        //loneTeen(13, 13) → false
        return (a >= 13 && a <= 19) ^ (b >= 13 && b <= 19);
    }

    private static String delDel(String str) {
        //Given a string, if the string "del" appears starting at index 1,
        //return a string where that "del" has been deleted.
        //Otherwise, return the string unchanged.
        //delDel("adelbc") → "abc"
        //delDel("adelHello") → "aHello"
        //delDel("adedbc") → "adedbc"
        if (str.length() > 3 && str.substring(1, 4).equals("del")) { return str.charAt(0) + str.substring(4); }
        else { return str; }
    }

    private static boolean mixStart(String str) {
        //Return true if the given string begins with "mix", except the 'm' can be anything,
        //so "pix", "9ix" .. all count.
        //mixStart("mix snacks") → true
        //mixStart("pix snacks") → true
        //mixStart("piz snacks") → false
        return str.length() > 2 && str.substring(1, 3).equals("ix");
    }

    private static String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0)=='o') { result += str.charAt(0); }
        if (str.length() >= 2 && str.charAt(1)=='z') { result += str.charAt(1); }
        return result;
    }

    private static String startOz2(String str) {
        //Given a string, return a string made of the first 2 chars (if present),
        //however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
        //startOz("ozymandias") → "oz"
        //startOz("bzoo") → "z"
        //startOz("oxx") → "o"
        if (str.length() > 1 && str.substring(0, 2).equals("oz")) { return str.substring(0, 2); }
        else if (str.length() > 0 && str.substring(0, 1).equals("o")) { return str.substring(0, 1); }
        else if (str.length() > 0 && str.substring(1, 2).equals("z")) { return str.substring(1, 2); }
        else { return ""; }
    }

    private static int intMax(int a, int b, int c) {
        //Given three int values, a b c, return the largest.
        //intMax(1, 2, 3) → 3
        //intMax(1, 3, 2) → 3
        //intMax(3, 2, 1) → 3
        if (a > b && a > c) { return a; }
        else if (b > c) { return b; }
        else { return c; }
    }

    private static int close10(int a, int b) {
        //Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
        //Note that Math.abs(n) returns the absolute value of a number.
        //close10(8, 13) → 8
        //close10(13, 8) → 8
        //close10(13, 7) → 0
        if (Math.abs(a-10) == Math.abs(b-10)) { return 0; }
        else if (Math.abs(a-10) < Math.abs(b-10)) { return a; }
        else { return b; }
    }

    private static boolean in3050(int a, int b) {
        //Given 2 int values, return true if they are both in the range 30..40 inclusive,
        //or they are both in the range 40..50 inclusive.
        //in3050(30, 31) → true
        //in3050(30, 41) → false
        //in3050(40, 50) → true
        return (a >= 30 && a <= 40 && b >= 30 && b <= 40) ||
                (a >= 40 && a <= 50 && b >= 40 && b <= 50);
    }

    private static int max1020(int a, int b) {
        //Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
        //or return 0 if neither is in that range.
        //max1020(11, 19) → 19
        //max1020(19, 11) → 19
        //max1020(11, 9) → 11
        if (a >= 10 && a <= 20 && b >= 10 && b <= 20 && a > b) { return a; }
        else if (a >= 10 && a <= 20 && b >= 10 && b <= 20 && a < b) { return b; }
        else if (a >= 10 && a <= 20) { return a; }
        else if (b >= 10 && b <= 20) { return b; }
        else { return 0; }
    }

    private static boolean stringE(String str) {
        //Return true if the given string contains between 1 and 3 'e' chars.
        //stringE("Hello") → true
        //stringE("Heelle") → true
        //stringE("Heelele") → false
        int count = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') { count++; }
            // alternately: str.substring(i, i+1).equals("e")
        }
        return (count >= 1 && count <= 3);
    }

    private static boolean lastDigit(int a, int b) {
        //Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
        //Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
        //lastDigit(7, 17) → true
        //lastDigit(6, 17) → false
        //lastDigit(3, 113) → true
        return (a % 10 == b % 10);
    }

    private static String endUp(String str) {
        //Given a string, return a new string where the last 3 chars are now in upper case.
        //If the string has less than 3 chars, uppercase whatever is there.
        //Note that str.toUpperCase() returns the uppercase version of a string.
        //endUp("Hello") → "HeLLO"
        //endUp("hi there") → "hi thERE"
        //endUp("hi") → "HI"
        if (str.length() < 3) { return str.toUpperCase(); }
        else { return str.substring(0, str.length()-3) + str.substring(str.length()-3).toUpperCase(); }
    }

    private static String everyNth(String str, int n) {
        //Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string.
        //So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
        //everyNth("Miracle", 2) → "Mrce"
        //everyNth("abcdefg", 2) → "aceg"
        //everyNth("abcdefg", 3) → "adg"
        String str2 = "";
        for (int i=0; i<str.length(); i+=n) {
            str2 += str.charAt(i);
        }
        return str2;
    }

    public static void callWarmup01() {

        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));

        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));

        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));

        System.out.println(diff21(10));
        System.out.println(diff21(25));

        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));

        System.out.println(makes10(9, 10));
        System.out.println(makes10(9, 9));

        System.out.println(nearHundred(93));
        System.out.println(nearHundred(89));

        System.out.println(posNegMy(1, -1, false));
        System.out.println(posNegMy(-1, 1, false));

        System.out.println(posNeg(-4, -5, false));
        System.out.println(posNeg(-4, -5, true));

        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));

        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));

        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));

        System.out.println(front3("Java"));
        System.out.println(front3("ab"));
        System.out.println(front3("a"));

        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));

        System.out.println(or35(3));
        System.out.println(or35(10));
        System.out.println(or35(8));

        System.out.println(front22("abc"));
        System.out.println(front22("ab"));
        System.out.println(front22("a"));

        System.out.println(startHi("hi"));
        System.out.println(startHi("h"));
        System.out.println(startHi(""));

        System.out.println(icyHot(120, -1));
        System.out.println(icyHot(-1, 120));

        System.out.println(in1020(12, 99));
        System.out.println(in1020(21, 12));
        System.out.println(in1020(8, 99));

        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(11, 22, 33));

        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13));

        System.out.println(loneTeen2(13, 99));
        System.out.println(loneTeen2(21, 19));
        System.out.println(loneTeen2(13, 13));

        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));

        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("ni"));

        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));

        System.out.println(startOz2("oz"));
        System.out.println(startOz2("abc"));
        System.out.println(startOz2(""));

        System.out.println(intMax(1, 2, 3));
        System.out.println(intMax(1, 3, 2));
        System.out.println(intMax(3, 2, 1));

        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));

        System.out.println(in3050(30, 31));
        System.out.println(in3050(30, 41));
        System.out.println(in3050(40, 50));

        System.out.println(max1020(11, 19));
        System.out.println(max1020(19, 11));
        System.out.println(max1020(11, 9));

        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));

        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 113));

        System.out.println(endUp("Hello"));
        System.out.println(endUp("hi there"));
        System.out.println(endUp("hi"));

        System.out.println(everyNth("Miracle", 2));
        System.out.println(everyNth("abcdefg", 2));
        System.out.println(everyNth("abcdefg", 3));
    }
}
