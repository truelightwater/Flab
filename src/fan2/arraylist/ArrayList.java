package fan2.arraylist;

public class ArrayList<S> {

    private int size = 0;
    private Object[] elementData = new Object[100];

    public boolean addFirst(Object obj) {
        return add(0, obj);
    }

    public boolean addLast(Object obj) {
        elementData[size] = obj;
        size++;

        return true;
    }

    public boolean add(int index, Object obj) {
        for (int loop = size - 1; loop >= index; loop--) {
            elementData[loop + 1] = elementData[loop];
        }
        elementData[index] = obj;
        size++;

        return true;
    }

    public Object removeFirst() {
        return remove(0);
    }

    public Object removeLast() {
        return remove(size - 1);
    }

    public Object remove(int index) {
        Object removed = elementData[index];
        for (int loop = index + 1; loop <= size - 1; loop++) {
            elementData[loop - 1] = elementData[loop];
        }
        size--;
        elementData[size] = null;

        return removed;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public int size() {
        return size;
    }

    public String toString() {
        String str = "[";

        for (int loop = 0; loop < size; loop++) {
            str += elementData[loop];
            if (loop < size - 1) {
                str += ",";
            }
        }

        return str + "]";
    }

}
