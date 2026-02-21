package AbstractMethod.entities;

public class Rectangle extends Shape{

    private Double length;
    private Double height;

    public Rectangle(){

    }

    public Rectangle(Color color, Double length, Double height) {
        super(color);
        this.length = length;
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double area() {
        return length * height;
    }
}
