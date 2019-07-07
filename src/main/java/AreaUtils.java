public class AreaUtils {

    public double squareArea(double side){
        return side * side;
    }


    public double circleArea(double radius){
        return Math.PI * radius * radius;
    }


    public double rectangleArea(double x, double y){
        return x * y;
    }

    public double triangleArea(double height, double base){
        return 0.5 * height * base;
    }


}
