package for_myself_testing.test_SOLID.OCP_test.test2;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(20,20);
        Rectangle rectangle2 = new Rectangle(30,30);
        Rectangle rectangle3 = new Rectangle(40,50);
        Rectangle rectangle4 = new Rectangle(60,60);

        AreaShape.multiArea(rectangle1,rectangle2,rectangle3,rectangle4);


    }

}
