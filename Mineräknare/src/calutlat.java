public interface calutlat {
    int tal(int summa, int sum);
}


class addeton implements calutlat {

    @Override
    public int tal(int summa, int sum) {
        additon hej = new additon();
            summa = hej.calkulat(summa,sum);
            return summa;

    }
}

class subtraktion implements calutlat{
    public int tal(int summa, int sum){
        summa = 0 ;
        return summa ;
    }
}


