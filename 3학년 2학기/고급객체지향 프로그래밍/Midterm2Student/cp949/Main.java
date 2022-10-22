public class Main {
/*    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 40);
        // �簢���� �ٿ�� �ڽ� ���
        r1.calcBounds();
        System.out.print(r1);
        Rectangle r2 = new Rectangle(20, 50);
        // �簢���� �ٿ�� �ڽ� ���
        r2.calcBounds();
        System.out.print(r2);
    }*/
    public static void main(String[] args) {
        // ���丮 ����
        // ���⼭ ��������� ShapeFactory�� �츮�� ��� �߻� ���丮�ʹ� �޸�
        // �� ���� ������ ��ü�� ������(Rectangle �Ǵ� Triangle ��ü)
        ShapeFactory shapeFactory = new ShapeFactory();
        final int MAX_SHAPES = 4;

        // ShapeFactory���� �簢���� �ﰢ�� ���� �� �׷����� ����. �׷� �̸�: Group1
        Shape s1 = shapeFactory.createShape("Rectangle", "Rectangle1", 10, 40);
        Shape s2 = shapeFactory.createShape("Triangle", "Triangle1", 10, 40);
        Group g = new Group("Group1", s1, s2);

        // ���� �׷�� ���ο� ������ ���� �ٽ� �׷����� ������
        // ���� �߰��Ǵ� ������ ����� ���� ������ �����ؼ� ����
        // 1: �簢��
        // 2: �ﰢ��
        for (int i = 0; i < MAX_SHAPES - 1; i++) {
            String shapeType = (MyRandom.randInt(1, 2) == 1) ? "Rectangle" : "Triangle";
            int min = MyRandom.randInt(10, 20);
            int max = MyRandom.randInt(50, 70);
            g = new Group("Group" + (i + 2), g,
                          shapeFactory.createShape(shapeType, shapeType + (i + 2), min, max));
        }
        // �׷��� �ٿ�� �ڽ� ���
        g.calcBounds();
        System.out.println(g);
    }
}
