package Day_9_DSA_List.bai_tap.ArrayList;

import Day_9_DSA_List.thuc_hanh.bai2.MyLinkedList;

import java.util.Arrays;

public class MyArrayList<E> {
    private  int size = 0; // số lượng phần tử có trong arraylist
    private final int DEFAULT_CAPACITY =10; // sức chứa của arraylist
    Object elements []; // mảng chứa các phần tử

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY]; // sức chứa mặc định là 10.

    }

    public MyArrayList(int capacity){
        if (capacity >=0){
        elements = new Object[capacity];//phương thức contrutor với sức chứa truyền vào
    }else {
            throw new IllegalArgumentException("capacity: "+ capacity);
        }
    }
    //phương thức trả về số lượng phần tử
    public int size(){
        return this.size;
    }
    //phương thức clear 1 arraylist
    public void clear(){
        size = 0;
        for (int i = 0;i<elements.length;i++){
            elements[i]=null;
        }

    }
    public boolean add(E element){
        if (elements.length==size){
            this.ensureCapacity(5);

        }
        elements[size]=element;
        size++;
        return  true;
        
        
    }
    public void add(E element, int index){
        if (index > elements.length){
            throw new  IllegalArgumentException ("index: "+index);
        }else if (elements.length == size){
            this.ensureCapacity(5);
        }
        if (elements[index]==null){
            elements[index] = element;
            size++;
        } else {
            for (int i = size+1; i >= index ; i--) {
        elements[i]=elements[i-1];

            }
            elements[index] = element;
            size++;
        }
    }
    
    
    // phhương thức tăng kích thước của arratlist
    public void ensureCapacity(int minCapacity){
        if (minCapacity>=0){
            int  newSize = this.elements.length+minCapacity;
            elements = Arrays.copyOf(elements,newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: "+ minCapacity);
        }
    }
// lay 1 element tu vi tri index.
    public E get(int index){
        return (E) elements[index];
    }
// lay index cua 1 phan tu
    public int indexOf(E element){
        int index = -1;
        for (int i = 0; i < size ; i++) {
            if (this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }
//kiem tra phan tu co trong mang ko
public boolean contains (E element){
        return this.indexOf(element)>=0;
}
// tao ban sao cua playlist hien tai
    public MyArrayList<E> clone(){
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(this.elements,this.size);
        v.size = this.size;
        return v;
    }
    public E remove(int index){
        if (index<0 || index>elements.length){
            throw new IllegalArgumentException("Error index: "+ index);

        }
        E element = (E) elements[index];
        for (int i = index; i < size-1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return element;
    }
}
