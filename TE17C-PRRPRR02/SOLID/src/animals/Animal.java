package animals;

public abstract class Animal {

    private String _color;
    private String _description;

    public Animal(String color, String description)
    {
        _color = color;
        _description = description;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        _color = color;
    }

    public String get_description() {
        return _description;
    }

}
