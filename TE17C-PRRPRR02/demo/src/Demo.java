public class Demo {

    public int _year = 1987;
    private int _storage;

    public Demo(int i){
        _storage = i;
        System.out.println("Spawned a Demo(n) from the year " + _year);
    }

    public void set_storage(int _storage) {
        this._storage = _storage;
    }

    public int get_storage() {
        return _storage;
    }

    public static void doStuff(){
        System.out.println("I did shit!");
    }

    public void doExplicitStuff(){
        System.out.println("I did " + _storage + " shits!");
    }
}
