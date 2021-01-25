package myArrayList;

import java.util.Arrays;

public class MyArrayList<E> {
    /**
     * Số lượng phần tử có trong MyArrayList
     */
    private int size = 0;

    private static final int DEFAULT_CAPATYCITY = 10;

    /**
     * Mảng chứa các phần tử
     */
    Object elements[];

    /**
     * Sức chứa mặc định khi khởi tạo bằng contructor không có tham số
     */
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPATYCITY];
    }

    /**
     * Phương thuc contructor voi suc chua dc truyen vao
     *
     * @param capacity
     */
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("caparity : " + capacity);
        }

    }

    /**
     * phuong thuc tra ve so luong phan tu
     * @return
     */
    public int size() {
        return this.size ;
    }

    /**
     * Phuong thu  clear  ArrayList
     */
    public void clear(){
        size = 0 ;
        for(int i = 0 ; i <elements.length ; i++){
            elements[i] = null ;
        }

    }

    /**
     * Phuong thuc add 1  phan tu vao  MyArrayList
     * @param element
     * @return
     */
    public boolean add(E element ){
        if(elements.length == size){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return  true ;
    }
    public void add (E element , int intdex){
        if(intdex > elements.length){
            throw new IllegalArgumentException("intdex : " + intdex);
        }else if(elements.length == size ){
            this.ensureCapacity(5);
        }

        if(elements[intdex] == null){
            elements[intdex] = element ;
            size++;
        }else {
            for(int i = size + 1 ; i >= intdex ; i--){
                elements[i] = elements[i-1];
            }
            elements[intdex] = element ;
            size ++ ;
        }
    }
    /**
     * Phuong thuc tang kich thuoc cua MyArrayList
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity){
        if(minCapacity >= 0 ) {
            int newsize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newsize);

        }else {
            throw new IllegalArgumentException("minCapacity : " + minCapacity);
        }

    }

    /**
     * phuong thuc lay element tai vi tri index
     * @param index
     * @return
     */
    public E get (int index){
        return (E) elements[index];
    }

    /**
     * phuong thuc lay index cua 1 phan tu
     * @param element
     * @return
     */
    public int indexOf(E element){
        int index   = -1 ;
        for(int i = 0 ; i < size ; i++ ){
            if(this.elements[i].equals(element)){
                return  i ;

            }
        }
        return index ;
    }

    /**
     * phuong thuc kiem tra phan tu co trong ArrayList hay khong
     * @param element
     * @return
     */
    public  boolean contains(E element){
        return this.indexOf(element) >= 0;

    }

    /**
     * phuong thuc tao 1 ban sao cua ArrayList hien tai
     * @return
     */
    public MyArrayList<E> clone(){
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(this.elements,this.size);
        v.size = this.size ;
        return v ;
    }

    public E remove(int index ){
        if(index < 0 || index > elements.length){
            throw new IllegalArgumentException("Error index : " + index);
        }
        E element = (E)elements[index];
        for(int i = index ; i <size -1 ;i++){
            elements[i] = elements[i+1];

        }
        elements[size - 1 ] = null ;
        size -- ;
        return element ;
    }
}