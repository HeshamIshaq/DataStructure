package queu;

public class DoublyLinkedQueu<E> implements QueuDS<E> {
    DoublyLinkedList<E> list = new DoublyLinkedList<E>();
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
        return list.first();
    }

    @Override
    public void enqueue(E element) {

    }

    @Override
    public E dequeue() {
        return null;
    }
}
