import java.util.ArrayList;

public class metoder {
    public static ArrayList<Character> toCharArryList(String talFörljd) {

        ArrayList<Character> chars = new ArrayList<Character>();
        for (int i = 0; talFörljd.length() > i; i++) {

            if (eqolArithmetic(talFörljd.charAt(i))) {

               char temp = talFörljd.charAt(i);

               chars.add(temp);
           }

        }

        return chars;
    }
    public static ArrayList<Double> toIntArryList(String progression) {
        ArrayList<Double> index = new ArrayList<Double>();
        double dub;
        String temp = "0";
        // string +8

        for (int i = 0; i < progression.length(); i++){
            if (eqolNumber(progression.charAt(i))){
                System.out.println(progression.charAt(i));
                temp = temp + progression.charAt(i);
                System.out.println(temp);
            }
            else {
                dub = Double.valueOf(temp);
                System.out.println(dub);
                index.add(dub);
                temp = "0";
            }
        }
        dub = Double.valueOf(temp);
        index.add(dub);
        System.out.println(index);
        return index;
    }


    public static boolean eqolNumber (char index){
        char [] nummer = {'1','2','3','4','5','6','7','8','9','0','.'};
        for (int i = 0; i < nummer.length-1; i++){
            if (index == nummer[i]){
            return true;}
        }
        return false;
        }

    public static boolean eqolArithmetic (char index){
        char [] arithmetic = {'*','/','+','-','^','%'};
        for (int i =0;i< arithmetic.length-1;i++) {
            if (index ==arithmetic[i]){
                return true;
            }
        }
        return false;
    }

}

