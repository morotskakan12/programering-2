package sample;

public abstract class Animal {

    //stänger för modifuikaton utifrån.
    private String _color;

    public Animal(String color)
    {
        _color = color;
    }

    abstract void speak();

    abstract void sleep();

    abstract void eat();
    //öpnar för modifikaton i Animol.
    public void setColor(String color){
        _color = color;
    }

    public String getColor() {
        return _color;
    }
}
