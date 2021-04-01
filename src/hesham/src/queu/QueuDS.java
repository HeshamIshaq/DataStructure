package queu;
public interface QueuDS<E> {

    boolean isEmpty();
    int size();
    E first();
    void enqueue (E element);
    E dequeue();

}
