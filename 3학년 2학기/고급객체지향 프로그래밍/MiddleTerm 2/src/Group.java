public class Group implements ShapeDecorator {

    public Shape s1;
    public Shape s2;
    public String groupName;
    Group(String groupName, Shape s1, Shape s2){
        this.groupName = groupName;
        this.s1 = s1;
        this.s2 = s2;
    }

    public void calcBounds(){
        s1.calcBounds();
        s2.calcBounds();
        if(s1.getMaxBoundsX() > s2.getMaxBoundsX()){
            this.setMaxBoundsX(s1.getMinBoundsX());
            this.setMinBoundsX(s2.getMinBoundsX());
        }else{
            this.setMaxBoundsX(s2.getMaxBoundsX());
        }
        if(s1.getMaxBoundsY() > s2.getMaxBoundsY()){
            this.setMaxBoundsY(s1.getMinBoundsY());
        }else{
            this.setMaxBoundsY(s2.getMaxBoundsY());
        }
    };

    public String getShapeName(){
        return groupName;
    };

    public String toString() {
        return getShapeName() + ":\n" + "minBoundsX: " + getMinBoundsX() + ", minBoundsY: " + getMinBoundsY() + "\n"
                + "maxBoundsX: " + getMaxBoundsX() + ", maxBoundsY: " + getMaxBoundsY() + "\n";
    }

}
