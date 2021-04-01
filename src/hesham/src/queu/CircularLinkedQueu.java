package queu;

/**
 * Created by KING TECH on 15/03/2021.
 */
public class CircularLinkedQueu<E> implements QueuDS<E> {
    CircularlyLinkedList<E> list = new CircularlyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E first() {
        return null;
    }

    @Override
    public void enqueue(E element) {

    }

    @Override
    public E dequeue() {
        return null;
    }
}
