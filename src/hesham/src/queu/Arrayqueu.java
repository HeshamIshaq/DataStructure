package queu;

public class Arrayqueu<E> implements QueuDS<E> {
    E data[];
    static int capacity=100;
    int f=0;
    int sz=0;

    public Arrayqueu(int c) {
        data=(E[]) new Object[c];
    }
    public Arrayqueu() {
        this(capacity);
    }
    @Override
    public boolean isEmpty() {
        return sz==0;
    }
    @Override
    public int size() {
        return sz;
    }
    @Override
    public E first() {
        if(isEmpty()) return null;
        return data[f];
    }
    @Override
    public void enqueue(E element) throws IllegalStateException{
        if (sz==data.length) throw new IllegalStateException("queu is full");
        int x= (f+sz)%data.length;
        data[x]=element;
        sz++;

    }
    @Override
    public E dequeue() {
        if (isEmpty()) return null;
        E del=data[f];
        data[f]=null;
        sz--;
        f=(f+1)%data.length;
        return del;
    }
}
