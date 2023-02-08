package fan2.arraylist;

public class ArrayList {
    private int size = 0;
    private Object[] elementData = new Object[100];

    public boolean addLast(Object element) {
        elementData[size] = element;
        size++;

        return true;
    }

    public void add(int index, Object obj) {
        for (int i = 0; i < size; i++) {

        }
    }






    public Object get(int index) {
        return elementData[index];
    }

    public int size() {
        return size;
    }


}
