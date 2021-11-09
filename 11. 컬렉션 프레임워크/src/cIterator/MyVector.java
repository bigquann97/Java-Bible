package cIterator;

import java.util.*;

public class MyVector {
    Object[] data = null;
    int capacity = 0;
    int size = 0;

    public boolean equals(Object o) {
        MyVector tmp = (MyVector)o;
        return this.data == tmp.data;
    }

    public MyVector(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("유효하지 않은 값 입니다. : " + capacity);
        }
        this.capacity = capacity;
        data = new Object[capacity];
    }

    public MyVector() {
        this(10);
    }

    public void ensureCapacity(int minCapacity) {
        if(minCapacity - data.length > 0) {
            setCapacity(minCapacity);
        }
    }

    public boolean add(Object obj) {
        ensureCapacity(size + 1);
        data[size++] = obj;
        return true;
    }

    public Object get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        return data[index];
    }

    public Object remove(int index) {
        Object oldObj = null;

        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        oldObj = data[index];

        if(index != size - 1) { // 삭제 대상이 마지막 객체가 아니라면
            System.arraycopy(data, index + 1, data, index, size - index - 1);
        }

        data[size - 1] = null;
        size--;
        return oldObj;
    }

    public boolean remove(Object obj) {
        for(int i = 0; i < size; i++) {
            if(obj.equals(data[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void trimToSize() {
        setCapacity(size);
    }

    private void setCapacity(int capacity) {
        if(this.capacity == capacity) return;

        Object[] tmp = new Object[capacity];
        System.arraycopy(data, 0, tmp, 0, size);
        data = tmp;
        this.capacity = capacity;
    }

    public void clear() {
        for(int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        System.arraycopy(data, 0 , result, 0, size);
        return result;
    }

    public boolean isEmpty() { return size == 0; }
    public int capacity() { return capacity; }
    public int size() { return size; }

    // list 인터페이스에서 상속받은 메서드들

//    public int size();
//    public boolean isEmpty();
    public boolean contains(Object o) {
        for(int i = 0; i < size; i++) {
            if(data[i] == o) {
                return true;
            }
        }
        return false;
    }
    public Iterator iterator() { return null; }
//    public Object[] toArray();
    public Object[] toArray(Object a[]) { return null; }
//    public boolean add(Object o);
//    public boolean remove(Object o);
    public boolean containsAll(Collection c) { return false; }
    public boolean addAll(Collection c) { return false; }
    public boolean addAll(int index, Collection c) { return false; }
    public boolean removeAll(Collection c) { return false; }
    public boolean retainAll(Collection c) { return false; }
//    public void clear();



//    public int hashCode();
//    public Object get(int index);
    public Object set(int index, Object element) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("용량 에러");
        }
        data[index] = element;
        return data;
    }
    public void add(int index, Object element){
        if(index == size) {
            add(element);
            return;
        }

        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("인덱스 에러");
        }
        ensureCapacity(size + 1);
        size++;
        System.arraycopy(data, index, data, index + 1, size - index - 1);
        data[index] = element;
    }
//    public Object remove(int index);
    public int indexOf(Object o) {
        for(int i = 0; i < size; i++) {
            if(data[i] == o) {
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(Object o) {
        for(int i = size - 1; i >= 0; i--) {
            if(data[i] == o) {
                return size - i - 1;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "MyVector{" +
                "data=" + Arrays.toString(data) +
                ", capacity=" + capacity +
                ", size=" + size +
                '}';
    }

    public ListIterator listIterator() { return null; }
    public ListIterator listIterator(int index) { return null; }
    public List subList(int fromIndex, int toIndex) { return null; }

//    default void sort(Comparator c) { /* 생략 */ }
//    default Spliterator spliterator() { /* 생략 */ }
//    default void replaceAll(UnaryOperator operator) { /* 생략 */ }

}
