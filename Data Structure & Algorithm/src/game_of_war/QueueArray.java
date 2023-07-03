// Name: Burato, Vince Art  		Section Code: T207
package game_of_war;

import java.util.Iterator;

public class QueueArray <Item> implements Iterable <Item>, Queue <Item>{
    
    private Item[] items;
    private int    head;
    private int    tail;
    private int    size;
    
    @SuppressWarnings("unchecked")
	public QueueArray() {
        items = (Item[]) (new Object[1]);
        head = 0;
        tail = 0;
        size = 0;
    }
    
    public boolean isEmpty() {
        return (size == 0);
    }
    
    public int size() {
        return size;
    }
    
    public void enqueue(Item item) {
        if (size == items.length - 1) {    
            resize(2 * items.length);
        }
        
        items[tail++] = item;
        
        if (tail == items.length) {
            tail = 0;  
        }
        
        size++;
    }
    
    public Item dequeue() {
        if (this.isEmpty()) {
            throw new RuntimeException("Tried to dequeue an empty queue");
        }
        else {
            Item itemToReturn = items[head];
            items[head++] = null;
            size--;
            if (head == items.length) {
                head = 0;
            }
            if (size == items.length / 4) {
                resize(items.length / 2);
            }
            
            return itemToReturn;
        }
    }
    
    private void resize(int capacity) {
        @SuppressWarnings("unchecked")
		Item[] newArray = (Item[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = items[(head + i) % items.length];
        }
        items = newArray;
        head = 0;
        tail = size;
    }
    
    public Iterator<Item> iterator() {
        return (new Iterator<Item>() {

            private int pos = head;
            private int count = 0;
            
            public boolean hasNext() {
                return (count < size);
            }

            public Item next() {
                Item item = items[pos++];
                if (pos == items.length) 
                    pos = 0;
                count++;
                return item;
            }
        });
    }
}

