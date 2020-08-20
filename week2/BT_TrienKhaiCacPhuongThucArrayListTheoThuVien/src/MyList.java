import java.util.Arrays;

public class MyList<E> {
    public int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    };
    public MyList(int capacity){
        elements = new Object[capacity];
    }
    void add(int index, E element){
        if (size < index){
            ensureCapacity(index-size+1);
        }

        if (elements[index] == null){
            elements[index] = element;
            if(elements.length==size){
                size++;
            }

        }
        else {
            for (int i = size + 1; i >= index; i-- ){
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
        }
        if (size < ++index){
            size = index;
        }

    }

    public int size(){
        return this.size;
    }

    public boolean add(E e){
        if (size == elements.length){
            ensureCapacity(1);
        }
            elements[size] = e;
            size++;
            return true;
    }

    public void ensureCapacity(int minCapacity){
        if (minCapacity > 0){
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        }
        else {
            throw new IndexOutOfBoundsException("minCapacity: " + minCapacity);
        }
    }
    public E get (int i){
        if (i > size || i < 0){
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i);
        }
        return (E) elements[i];
    }
}
