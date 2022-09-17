public class Main {
    public static void main(String[] args) {
        ObjectDynamicArray arr = new ObjectDynamicArray();
        for (int i = 0; i < 35; i++) {
            arr.add(i);
        }

        for (int i = 0; i < arr.length(); i++) {
            System.out.printf("data[%d] = %d\n", i, (int) arr.get(i));
        }

        System.out.println("for-each 사용");
        int i = 0;
        for (Object o : arr) {
            System.out.printf("data[%d] = %d\n", i, (int) o);
            i++;
        }
    }
}
