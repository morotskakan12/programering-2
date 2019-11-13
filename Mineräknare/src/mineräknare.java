import java.util.ArrayList;

public class mineräknare {


    public double matte(String talFörljd) {
        calutlat add = new addeton();
        calutlat sub = new subtraktion();
        calutlat div = new division();
        calutlat mult = new multiplikation();
        calutlat pow = new power();
        calutlat pro = new prosent();

        double a;
        double b;
        double tal = 0.0;
        ArrayList<Character> chars = new ArrayList<Character>();
        ArrayList<Double> index = new ArrayList<Double>();
        chars = metoder.toCharArryList(talFörljd);
        System.out.println(chars);

        if ((chars.size() == 1) ) {

            index = metoder.toIntArryList(talFörljd);
            System.out.println(index);
            a = index.get(0);
            b = index.get(1);

            if (chars.get(0) == '/') {
                tal = div.calculate(a, b);

            } else if (chars.get(0) == '*') {
                tal = mult.calculate(a, b);
            } else if (chars.get(0) == '+') {
                tal = add.calculate(a, b);
            } else if (chars.get(0) == '-') {
                tal = sub.calculate(a, b);
            }
            else if (chars.get(0) == '^') {

                tal = pow.calculate(a, b);
                System.out.println(tal);
            }
            else if (chars.get(0) == '%') {
                tal = pro.calculate(a, b);
                System.out.println(tal);
            }
            return tal;
        }
        if ((chars.size() < 1) || (index.size() < 2)) {
            return 0;
        }
        return 0;
    }
}