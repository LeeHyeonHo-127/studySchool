import java.util.Iterator;
import java.util.*;


public class MyStack<E>{
    private int top;
    private E field;

    int size;
    E[] stack;

     public MyStack(){ // 1. 외부 제네릭 사용하기

        this.size = size;
        this.stack = (E[]) new Object[10];
        top = -1;
    }

    public void push(E e) {
        stack[++top] = e;
        System.out.println(stack[top] + " Push!");
    }

    public E pop() {
        System.out.println(stack[top] + " Pop!");
        E pop = stack[top];
        top--;
        return pop;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }


    public class ObjectDynamicArray implements Iterable<Object> { //MARK: Iterator 사용하기
        private int length;
        private int capacity;
        private Object[] data;

        class ODAIterator implements Iterator {
            int index;

            public ODAIterator() {
                index = 0;
            }

            public boolean hasNext() { return index < length; }

            public Object next() {
                Object o = get(index);
                index++;
                return o;
            }
        }

        public ObjectDynamicArray() {
            length = 0;
            capacity = 10;
            data = new Object[10];
        }

        public boolean add(Object t) {
            if (length >= capacity) {
                boolean b = resizeArray();
                if (b == false)
                    return false;
            }
            data[length] = t;
            length++;
            return true;
        }

        public Object get(int index) {
            if (index >= 0 && index < length) {
                return data[index];
            }
            return null;
        }

        public int size() { return length; }

        private boolean resizeArray() {
            Object[] data2 = new Object[capacity + 10];
            if (data2 == null)
                return false;
            for (int i = 0; i < length; i++) {
                data2[i] = data[i];
            }
            capacity += 10;
            data = data2;
            return true;
        }

        public Iterator<Object> iterator() {
            return new ODAIterator();
        }
    }
}



