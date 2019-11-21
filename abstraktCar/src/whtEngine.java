public interface whtEngine {
    String engine();
}
class v8 implements whtEngine{
    public String engine(){
        return "V8";
    }
}
class v6 implements whtEngine{
    public String engine(){
        return "V6";
    }
}

