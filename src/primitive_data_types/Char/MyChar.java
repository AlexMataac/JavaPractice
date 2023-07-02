package primitive_data_types.Char;

public class MyChar {

    private char ch;
    public MyChar(char ch) {
        this.ch = ch;
    }

    public static void printLowerCaseAlphabets() {
        //'a' to 'z'
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }
    }

    public static void printUpperCaseAlphabets() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }

    }
    public boolean isVowel() {
            ////'a', 'e', 'i', 'o', 'u' or A E I O U
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
//                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )

            if (Character.toUpperCase(ch) == 'A')
                return true;

            if (Character.toUpperCase(ch) == 'E')
                return true;

            if (Character.toUpperCase(ch) == 'I')
                return true;

            if (Character.toUpperCase(ch) == 'O')
                return true;

            if (Character.toUpperCase(ch) == 'U')
                return true;
            return false;
        }

    public boolean isDigit() {
        if (ch >= 48 && ch <= 57)
            return true;
        return false;
    }

    public boolean isAlphabet() {
        if (ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90)
            return true;
        return false;
    }

    public boolean isConsonant() {
        //        if (ch == 'b' || ch == 'c' || ch == 'd' || ch == 'f' || ch == 'g'
//                || ch == 'j' || ch == 'h' || ch == 'k' || ch == 'l' || ch == 'm'
//                || ch == 'n' || ch == 'p' || ch == 'q' || ch == 's' || ch == 'r'
//                || ch == 't' || ch == 'v' || ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z')

        // Alphabet and it is not VOWEL
        //! [a, e, i, o, u]

        if (isAlphabet() && !isVowel())
            return true;
        return false;
    }
}

