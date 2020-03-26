package sample;

import com.sun.org.apache.xpath.internal.functions.FuncSubstring;

public class MiniNum {
    private MiniLay miniLay;
    public MiniNum(MiniLay miniLay){ this.miniLay = miniLay; }

    public void lika(){
        double summa = 0;
        String expression = miniLay.field.textProperty().get();
        if (expression.contains("+")){
            String[] talen = expression.split("\\+");
            summa = Double.parseDouble(talen[0]) + Double.parseDouble(talen[1]);
        }
        else if (expression.contains("-")){
            String[] talen = expression.split("\\-");
            summa = Double.parseDouble(talen[0]) - Double.parseDouble(talen[1]);
        }
        else if (expression.contains("*")){
            String[] talen = expression.split("\\*");
            summa = Double.parseDouble(talen[0]) * Double.parseDouble(talen[1]);
        }
        else if (expression.contains("÷")){
            String[] talen = expression.split("\\÷");
            summa = Double.parseDouble(talen[0]) / Double.parseDouble(talen[1]);
        }
        miniLay.field.textProperty().set(miniLay.field.textProperty().get() + " = " + summa);

        }
    public void plus(){ miniLay.field.textProperty().set(miniLay.field.textProperty().get() + " + "); }
    public void minus(){ miniLay.field.textProperty().set(miniLay.field.textProperty().get() + " - "); }
    public void multi(){ miniLay.field.textProperty().set(miniLay.field.textProperty().get() + " * "); }
    public void dela(){ miniLay.field.textProperty().set(miniLay.field.textProperty().get() + " ÷ "); }

}
