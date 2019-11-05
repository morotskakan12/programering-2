import java.util.ArrayList;

public class mineräknare  {


    public double matte(String talFörljd){
        boolean next = false;
        calutlat add = new addeton();
        calutlat sub = new subtraktion();
        calutlat div = new division();
        calutlat mult = new multiplikation();
        double a;
        double b;
        double tal  = 0.0;
        ArrayList<Character> chars = new ArrayList<Character>();
        ArrayList<Double> index = new ArrayList<Double>();
        chars = metoder.toCharArryList(talFörljd);
        index = metoder.toIntArryList(talFörljd);

        if(chars.size() == 1){
            a = index.get(0);
            b = index.get(1);
            if(index.get(0) == 0) {
                return 0;
            }
            if (chars.get(0)== '/'){
                tal = div.calculate(a,b);

            }
            else if (chars.get(0)== '*'){
                tal = mult.calculate(a,b);
            }
            else if (chars.get(0)== '+'){
               tal = add.calculate(a,b);
            }
            else if (chars.get(0)== '-'){
                tal = sub.calculate(a,b);
            }
        }
    for (int i= 0; chars.size() > i; i++){

        if (chars.get(i) == ('/')){
        }
        if(talFörljd.length() == i){
            next = true;
        }
    }
    if(next == true){
        for (int i= 0;talFörljd.length() > i; i++){
            char temp = talFörljd.charAt(i);
            if (chars.get(i) == ('*')){
                next = false;
            }
            if(talFörljd.length() == i){
                next = true;
            }
        }

    }
        if(next == true){
        for (int i= 0;talFörljd.length() > i; i++){
            char temp = talFörljd.charAt(i);
            if (chars.get(i) == ('+')){
                next = false;
            }
            if(talFörljd.length() == i){
                next = true;
            }
        }

    }
        if(next == true){
        for (int i= 0;talFörljd.length() > i; i++){
            char temp = talFörljd.charAt(i);
            if (chars.get(i) == ('-')){
                next = false;
            }
            if(talFörljd.length() == i){
                next = true;
            }
        }

    }


    //läser in hur många termer.
    //loppa termer
    return tal;
    }
}