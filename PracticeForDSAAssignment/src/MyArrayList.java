public class MyArrayList<E> {
    private Object[] elements;
    private int numElements;
    private int capacity;

    public MyArrayList() {
        capacity = 10;
        elements = new Object[capacity];
        numElements = 0;
    }

    public void add(E element) {
        if (numElements == capacity)
            resize();
        
        elements[numElements] = element;
        numElements++;
    }

    private void resize() {
        capacity = capacity * 2;
        Object[] newElements = new Object[capacity];
        for(int i = 0; i < numElements; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public E get(int index){
        if (index < 0 || index >= numElements)
            throw new IndexOutOfBoundsException("There is nothing at index" + index);
        return (E) elements[index];
    }

    public E remove(int index) {
        if (index < 0 || index >= numElements)
            throw new IndexOutOfBoundsException("There is nothing at index" + index);
        E removed = (E) elements[index]; 
        
        for(int i = index; i < numElements - 1; i++){
            elements[i] = elements[i+1];
        }

        numElements--;
        elements[numElements] = null;
        return removed;
    }

    public void set(int index, E element){
        if (index < 0 || index >= numElements)
            throw new IndexOutOfBoundsException("There is nothing at index" + index);
        elements[index] = element;
    }

    public int size() {
        return numElements;
    }

    public boolean isEmpty() {
        return numElements == 0; 
    }

    public void display() {
        for (int i = 0; i < numElements; i++) {
            System.out.println(elements[i]);
            if (i < numElements - 1)
                System.out.println(",");
        }
    }


}
