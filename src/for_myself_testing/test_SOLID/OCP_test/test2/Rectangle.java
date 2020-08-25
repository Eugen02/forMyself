package for_myself_testing.test_SOLID.OCP_test.test2;


public class Rectangle extends shape {
    private int wight;
    private int height;

    public Rectangle(int wight, int height) {
        this.wight = wight;
        this.height = height;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        return this.height * this.wight;
    }
}
