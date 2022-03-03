package dynamicarray;

import java.util.Arrays;

public class Dynamic {

    int[] data;
    int size;

    public Dynamic() {
        size = 0;
        data = new int[1];

    }

    public int get(int index) {
        return data[index];
    }

    public void put(int elements) {
        ensureCapacity(size + 1);
        data[size++] = elements;
    }

    public int getSize() {
        return data.length;
    }

    public void ensureCapacity(int minCapacity) {
        int oldCapacity = data.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            data = Arrays.copyOf(data, newCapacity);
        }
    }
}
