package pattern.creational.factory;

/**
 * Created by thangnguyen-pmac on 3/17/16.
 */
public class FactoryDemo {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        IShape shape1 = shapeFactory.getShape("CIRCLE");

        shape1.draw();
    }
}
