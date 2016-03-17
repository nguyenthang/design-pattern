package pattern.creational.factory;

/**
 * Created by thangnguyen-pmac on 3/17/16.
 */
public class ShapeFactory {

    public IShape getShape(String shapeName){
        if(shapeName == null){
            return null;
        }

        if(shapeName.equals("CIRCLE")){
            return new Circle();
        }else if(shapeName.equals("RECTANGLE")){
            return new Rectangle();
        }else if(shapeName.equals("SQUARE")){
            return new Square();
        }

        return null;
    }
}
