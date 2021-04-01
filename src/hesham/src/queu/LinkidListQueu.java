package queu;

public class LinkidListQueu<E> implements QueuDS<E> {

    singlyLinkedList<E> list = new singlyLinkedList<E>();

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

        list.addlast(element);
    }

    @Override
    public E dequeue() {
        return list.removeFerst();
    }
}
