import java.util.ArrayList;

public class mineräknare extends Matte {

    @Override
    public int matte(String talFörljd){
    boolean next = false;
    int tal  = 0;
        ArrayList<Character> chars = new ArrayList<Character>();
        chars = metoder.toCharArryList(talFörljd);
    if(chars.size() == 1){
        if (){}
        else if (){}
        else if (){}
        else if (){}
    }
    for (int i= 0;talFörljd.length() > i; i++){
        char temp = talFörljd.charAt(i);
        if (temp == ('/')){
        }
        if(talFörljd.length() == i){
            next = true;
        }
    }
        if(next == true){
        for (int i= 0;talFörljd.length() > i; i++){
            char temp = talFörljd.charAt(i);
            if (temp == ('*')){
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
            if (temp == ('+')){
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
            if (temp == ('-')){
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