package queu;

public class singlyLinkedList<E> {
    private Node<E> head=null;
    private  Node<E> tail=null;
    private int size=0;
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public E first(){
        if(isEmpty()) return null;
        return head.getElement();
    }
    public E last(){
        if(isEmpty()) return null;
        return tail.getElement();
    }
    public void addFirst(E element){
        head = new Node<E>(element, head);
        if(size==0)
            tail=head;
        size++;
    }
    public void addlast(E element){
        Node<E> newest=new Node<E>(element, null);
        if (size==0) head=newest;
        else tail.setNext(newest);
        tail = newest;
        size++;
    }
    public E removeFerst(){
        if(isEmpty()) return null;
        E deleted = head.getElement();
        head=head.getNext();
        size--;
        if(size==0) tail=null;
        return deleted;
    }
    public String print(){
        Node<E> i= head;
        String all="";
        while (i != null){
            all= all+i.getElement().toString()+"\n";
            i = i.getNext();
        }
        return all;
    }
    private static class Node<E> {
        E element;
        Node<E> next;
        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
        public E getElement() {
            return element;
        }
        public void setElement(E element) {
            this.element = element;
        }
        public Node<E> getNext() {
            return next;
        }
        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}