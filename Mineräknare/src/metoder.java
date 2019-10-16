import java.util.ArrayList;

public class metoder {
    public static ArrayList<Character> toCharArryList(String talFörljd) {
        ArrayList<Character> chars = new ArrayList<Character>();
        for (int i = 0; talFörljd.length() < i; i++) {
            char temp = talFörljd.charAt(i);
            chars.add(temp);
        }
        return chars;
    }

    public static int termer(String talFörljd) {
        int tal = 0;
        for (int i = 0; talFörljd.length() > i; i++) {
            char temp = talFörljd.charAt(i);
            if ((temp == '+') || (temp == '-') || (temp == '*') | (temp == '/')) {
                tal++;
            }

        }
        return tal;
    }
}


