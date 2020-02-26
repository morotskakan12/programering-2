package sample;

import java.util.ArrayList;

public class metoder {
    public static ArrayList<Character> toCharArryList(String progression) {

        ArrayList<Character> chars = new ArrayList<Character>();
        for (int i = 0; progression.length() > i; i++) {

            if (eqolArithmetic(progression.charAt(i))) {

                char temp = progression.charAt(i);

                chars.add(temp);
            }

        }

        return chars;
    }public static ArrayList<Character> toVaribolArryList(String progression) {

        ArrayList<Character> chars = new ArrayList<Character>();
        for (int i = 0; progression.length() > i; i++) {

            if (eqolLetter(progression.charAt(i))) {

                char temp = progression.charAt(i);

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
                temp = temp + progression.charAt(i);
            }
            else {
                dub = Double.valueOf(temp);
                index.add(dub);
                temp = "0";
            }
        }
        dub = Double.valueOf(temp);
        index.add(dub);
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
    public static boolean eqolLetter (char index){
        char [] arithmetic = {'x','y', 'z','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w','='};
        for (int i =0;i< arithmetic.length-1;i++) {
            if (index ==arithmetic[i]){
                return true;
            }
        }
        return false;
    }

    static String varibol(int number) {
        String [] varibolArry = { "x", "y", "z","a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w"};
        String ret = varibolArry[number];
        if (number>26){
            int temp = (number+1) - 26;
            ret = varibolArry[number] + (temp);
        }

        return ret;
    }

}

