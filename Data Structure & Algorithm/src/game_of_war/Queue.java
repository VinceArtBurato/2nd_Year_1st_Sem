// Name: Burato, Vince Art  		Section Code: T207
package game_of_war;

public interface Queue <Item> extends Iterable <Item> {
    
    boolean isEmpty();
    int size();
    void enqueue(Item item);
    Item dequeue();
}
