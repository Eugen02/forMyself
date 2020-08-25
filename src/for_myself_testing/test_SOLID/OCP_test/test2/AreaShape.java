package for_myself_testing.test_SOLID.OCP_test.test2;

import java.util.Arrays;

public class AreaShape {

    public static void multiArea(shape... shapes){
        double sumOfShape;
        sumOfShape = Arrays.stream(shapes)
                .mapToDouble(p -> p.area())
                .sum();
        System.out.println(sumOfShape);
    }

}
