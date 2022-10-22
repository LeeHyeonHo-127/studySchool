public class Ractangle extends Shape{

    public int luX;
    public int luY;
    public int rdX;
    public int rdY;

    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public String rectangleName;
    Ractangle(String type, int min, int max){
        rectangleName = type;
        luX = MyRandom.randInt(getMinBoundsX(),getMaxBoundsX());
        luY = MyRandom.randInt(getMinBoundsY(),getMaxBoundsY());
        rdX = luX + 30;
        rdY = luY + 20;

        x1 = luX;
        y1 = luY;
        x2 = rdX;
        y2 = rdY;
    }

    @Override
    public void calcBounds() {
        setMaxBoundsX(rdX);
        setMinBoundsX(luX);
        setMaxBoundsY(luY);
        setMinBoundsY(rdY);
    }

    @Override
    public String getShapeName() {
        return rectangleName;
    }
}
