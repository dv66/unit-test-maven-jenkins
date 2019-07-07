import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaUtilsTest {

    AreaUtils areaUtils;


    @BeforeEach
    void init(){
        areaUtils = new AreaUtils();
    }

    @Test
    void squareArea() {
        assertEquals(36, areaUtils.squareArea(6), "Square Area Tested");
    }

    @Test
    void circleArea() {
        assertEquals(3.141592653589793, areaUtils.circleArea(1));
    }

    @Test
    void rectangleArea() {
        assertEquals(45, areaUtils.rectangleArea(5,9));
    }

    @Test
    void triangleArea() {
        assertEquals(40, areaUtils.triangleArea(4, 20));
    }
}