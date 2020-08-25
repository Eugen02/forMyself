package for_myself_testing.test_SOLID.OCP_test.test2;

public class Circle extends shape{
    private int length;

    public Circle(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double area() {
        return Math.pow(2,this.length) * Math.PI;
    }
}
