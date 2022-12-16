package Exercise;

import java.util.NoSuchElementException;

public class Stack implements Set{
    private Object [] array;
    private int counter;
    private int maxSize;

    public Stack (int maxSize) {
        this.maxSize = maxSize;
        array = new Object[maxSize];
        this.counter = 0;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    } 

    public boolean isEmpty() {
        if (counter == 0){
            return true;
        } else {
            return false;
        }
    }

    // Delete
    public Object extract() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            counter--;
            return array[counter];    
        }
    }
    // Read
    public Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return array[counter-1];    
        }
    }
    // Create / Update
    public boolean add(Object o) {
        if (counter == maxSize) {
            return false;
        } else {
            array[counter] = o;
            counter++;
            return true;
        }
    }

    public String toString (String override) {
        
        String text = "";
        
        if (isEmpty()) {
            return text;
        } else {
            for (int i = counter-1; i >= 0; i--) {
                text += array[i].toString();
                if (i > 0) {
                    text += "\n";
                }                
            }
            return text;
        }

    }

}

