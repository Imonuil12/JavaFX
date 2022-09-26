public class Rectangle {
    private Float length = 1.0f;
    private Float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(Float length, Float width) {
        this.length = length;
        this.width = width;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length + width);
    }
    public String toString(){
        return "Rectangle[length=" + length + ",width=" + width+ "]";
    }
}
