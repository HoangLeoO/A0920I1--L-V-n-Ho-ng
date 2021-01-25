package dsa_danh_sach.bai_tap.methodArrayList;


import java.util.Arrays;

public class MyList<E> {
    private int size = 0 ;
    private static final  int DEFAULT_CAPACITY = 10 ;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void capacity(){
        int capacity = elements.length * 2 ;
        elements = Arrays.copyOf(elements, capacity);
    }
    public  void addList(int index , E e){
        if (size == elements.length) {
            capacity();
        }
        elements[size++] = e;
    }
    private void sizeList(int size){
        elements = Arrays.copyOf(elements, size);
    }
    
}
