import java.util.Random;

public class MyRandom {
    // ��� ����� ��ġ��Ű�� ���� �õ� ���ڸ� 0���� ������Ŵ
    // �̷��� �ؼ� ���� ���� ������� ������ ������ ���ڵ��� ������
    private static final Random random = new Random(0);

    public static int randInt(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }
}
