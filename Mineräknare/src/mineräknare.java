import java.util.ArrayList;

public class mineräknare {


    public double matte(String progression) {

        double a;
        double b;
        double tal = 0.0;
        oporaton oporaton = new oporaton(new Add() );
        ArrayList<Character> chars = new ArrayList<Character>();
        ArrayList<Double> index = new ArrayList<Double>();

        chars = metoder.toCharArryList(progression);

        if ((chars.size() == 1) ) {

            index = metoder.toIntArryList(progression);
            a = index.get(0);
            b = index.get(1);

            if (chars.get(0) == '/') {
                    oporaton = new oporaton(new division());
                tal = oporaton.executeOporaton(a, b);

            } else if (chars.get(0) == '*') {

                oporaton = new oporaton(new multiplikation());

                tal = oporaton.executeOporaton(a, b);

            } else if (chars.get(0) == '+') {
                oporaton = new oporaton(new Add());
                tal = oporaton.executeOporaton(a, b);

            } else if (chars.get(0) == '-') {

                oporaton = new oporaton(new subtraktion());

                tal = oporaton.executeOporaton(a, b);

            } else if (chars.get(0) == '^') {
                oporaton = new oporaton(new power());

                tal = oporaton.executeOporaton(a, b);

            } else if (chars.get(0) == '%') {

                oporaton = new oporaton(new prosent());

                tal = oporaton.executeOporaton(a, b);

            }

            return tal;

        }if ((chars.size() < 1) || (index.size() < 2)) {

            return 0;

        }

        return 0;

    }
}