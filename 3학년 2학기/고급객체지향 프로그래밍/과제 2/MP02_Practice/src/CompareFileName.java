public class CompareFileName implements Comparable{
    @Override
    public int compareTo(Object o1, Object o2) {
        String s1 = ((FileInfo) o1).getName();
        String s2 = ((FileInfo) o1).getName();
        return s1.compareTo(s2);
    }
}
