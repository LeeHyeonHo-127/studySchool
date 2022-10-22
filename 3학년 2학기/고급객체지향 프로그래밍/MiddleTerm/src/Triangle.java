public class Triangle extends Shape {
    public int luX;
    public int luY;
    public int rdX;
    public int rdY;

    public int x1;
    public int y1;
    public int x2;
    public int y2;
    public int x3;
    public int y3;

    public String TriangleName;
    Triangle(String type, int min, int max){
        TriangleName = type;
        x1 = MyRandom.randInt(getMinBoundsX(),getMaxBoundsX());
        y1 = MyRandom.randInt(getMinBoundsY(),getMaxBoundsY());
        x2 = MyRandom.randInt(getMinBoundsX(),getMaxBoundsX());
        y2 = MyRandom.randInt(getMinBoundsY(),getMaxBoundsY());
        x3 = MyRandom.randInt(getMinBoundsX(),getMaxBoundsX());
        y3 = MyRandom.randInt(getMinBoundsY(),getMaxBoundsY());

    }

    @Override
    public void calcBounds() {
        if(x1 >= x2 && x1>= x3){
            setMinBoundsX(x1);
        }
        else if(x2 >= x1 && x2>= x3){
            setMinBoundsX(x2);
        }
        else if(x3 >= x2 && x3>= x1){
            setMinBoundsX(x3);
        }
        if(y1 >= y2 && y1>= y3){
            setMinBoundsY(y1);
        }
        else if(y2 >= y1 && y2>= y3){
            setMinBoundsY(y2);
        }
        else if(y3 >= y2 && y3>= y1){
            setMinBoundsY(y3);
        }
    }

    @Override
    public String getShapeName() {
        return TriangleName;
    }
}
