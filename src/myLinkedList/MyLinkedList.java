package myLinkedList;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;

        }

        public Object getData() {
            return this.data;
        }
    }

    // phan tu dau tien cua danh sach lien ket
    private Node head;
    // so luong phan tu trong danh sach
    private int numNodes = 0;

    public MyLinkedList() {
    }

    public void addFirst(E element) {
        // khai bao 1 bien la temp tro den gia tri cua head
        Node temp = head;
        // bien head  se nhan gia tri  la 1 node  moi ;
        head = new Node(element);
        // head.next tro den temp
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        // khai bao bien  temp tro den head
        Node temp = head;
        // se cho con tro chay den phan tu cuoi cung cua danh sach
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element) {
        //khai bao bien temp tro den head
        Node temp = head;
        // khai bao 1 node la holder
        Node holder;
        // cho con tro chay den vi tri index -1
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        //cho holder tham chieu den vi tri index
        holder = temp.next;
        //Node tai vi tri index -1 se tro toi node moi
        temp.next = new Node(element);
        //Node moi se tro den holder
        temp.next.next = holder;
        // tang so luong phan tu trong danh sach len 1
        numNodes++;
    }

    public Object get(int index) {
        //khai bao  bien temp tro den head
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;

    }

    public int size() {
        return numNodes;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("Error index " + index);
        }
        // khai bao 1 bien temp tro den head
        Node temp = head;

        Object data;
        // neu index = 0 thi tra ve data hien tai
        if (index == 0) {
            data = temp.data;
            head = head.next;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    public boolean remove(E element) {
        //Remove doi tuong  neu element head
        if (head.data.equals(element)) {
            remove(0);
        } else {
            // khai bao 1 node temp tro den head
            Node temp = head;
            while (temp.next != null) {
                // neu nhu ton tai 1 phan tu data co data truyen vao thi node do se bi remove
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp =temp.next;
            }
        }
        return false;
    }

    public MyLinkedList<E> clone(){
        // kiem tra  Linkedlick co phan tu hay khong
        if(numNodes == 0){
            throw new  NullPointerException("Linkedlick nay null");
        }
        // khai bao linkedlick tra ve
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        //khai bao 1 temp tro den head
        Node temp = head ;
        // add temp vao danh sach tra ve de no lam head
        returnLinkedList.addFirst((E) temp.data);
        temp =temp.next;
        while (temp !=null){
            returnLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }

    public  boolean constrains(E element){
        Node temp = head ;
        while (temp.next != null){
            if(temp.data.equals(element)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public  int indexOf(E element){
        Node temp = head;
        for(int i = 0 ; i <numNodes ; i++){
            if(temp.getData().equals(element)){
                return i ;

            }
            temp = temp.next;
        }
        return -1 ;
    }
}
