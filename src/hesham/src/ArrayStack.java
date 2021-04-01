public class ArrayStack<E> implements stack<E> {
    E data[];
    int t=-1;
   static final int capacity=100;
    public ArrayStack(int c) {data= (E[]) new Object[c];}
    public ArrayStack() {this(capacity);}

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;}
    @Override
    public E top() {
        if(isEmpty()) return null;
        return data[t];}
    @Override
    public void push(E element) throws IllegalStateException{
        if (size()==data.length) throw new IllegalStateException("Stack is full");
        data[++t]=element;}

    @Override
    public E pop() {
        if(isEmpty()) return null;
        E x = data[t];
        data[t]=null;
        t--;
        return x;
    }
}
