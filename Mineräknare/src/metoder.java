import java.util.ArrayList;

public class metoder {
    public static ArrayList<Character> toCharArryList(String talFörljd) {


        ArrayList<Character> chars = new ArrayList<Character>();
        for (int i = 0; talFörljd.length() > i; i++) {


            if (eqolräkna(talFörljd.charAt(i))) {
               char temp = talFörljd.charAt(i);

               chars.add(temp);
           }
           }
        return chars;
    }
    // gorde denna först den är cp dålig!!!!
    public static ArrayList<Double> toIntArryList2(String talFörljd) {
        ArrayList<Double> index = new ArrayList<Double>();
        for (int i = 0; talFörljd.length() > i; i++) {
            if (eqolräkna(talFörljd.charAt(i))) {

                double temp = talFörljd.charAt(1-i) - '0';
                index.add(temp);
                if (eqolräkna(talFörljd.charAt(i+1))){
                    index.clear();
                    index.add(0.0);
                    return index;
                }
                else {
                    temp = talFörljd.charAt(i+1) -'0';

                    index.add(temp);

                }
            }
            }
        return index;
    }
    public static boolean eqolNumber (char index){
        char [] nummer = {'1','2','3','4','5','6','7','8','9','0','.'};
        for (int i = 0; i < 11; i++){
            if (index == nummer[i]){
            return true;}
        }
        return false;
        }

    public static boolean eqolräkna (char index){
        if ((index == '*')||(index == '/')||(index == '+')||(index == '-')||(index == '^')||(index == '%')){

            return true;
        }
        return false;
    }
    public static ArrayList<Double> toIntArryList(String talFörljd) {
        ArrayList<Double> index = new ArrayList<Double>();
        double dub;
        String temp = "0";
        // string +8

        for (int i = 0; i < talFörljd.length(); i++){
            if (eqolräkna(talFörljd.charAt(i))){
                for(int e = 0;e<i;e++) {
                    temp = temp + talFörljd.charAt(e);
                }
                dub = Double.valueOf(temp);
                index.add(dub);
                temp = "0";
                for (int e = i+1;e<talFörljd.length();e++){
                    temp = temp + talFörljd.charAt(e);
                }
                dub = Double.valueOf(temp);
                index.add(dub);
                temp = "";
                break;
            }
        }
        return index;
    }
}

