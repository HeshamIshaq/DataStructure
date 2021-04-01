package Tree;

public class BinaryThree<E> {
    private Node<E>root=null;
    private int size=0;
    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }
    protected Node<E>createNode (E e,Node<E>p,Node<E>l,Node<E>r)
    {
        return new Node<E>(e,p,l,r);

    }
    protected Node<E> validateNode(position<E> p)
    {
        if (!(p instanceof Node))
            throw new IllegalArgumentException("p is invalid position");
        Node<E>n =(Node<E>)p;
        if(n.getParent()==n)
            throw new IllegalArgumentException("p is not exist position");
        return n;
    }
    public position<E> root()
    {
        return root;
    }
    public position<E> parent(position<E> p)
    {
        Node<E>n=validateNode(p);
        return n.getParent();
    }
    public position<E> left(position<E> p)
    {
        Node<E>n=validateNode(p);
        return n.getLeft();
    }
    public position<E> right(position<E> p)
    {
        Node<E>n=validateNode(p);
        return n.getRight();
    }
    public int numOfChild(position<E> p)
    {
        int count=0;
        if(left(p)!=null)
            count++;
        if (right(p)!=null)
            count++;
        return count;
    }
    public position<E> addRoot (E e)
    {
        if (! isEmpty())
            throw new IllegalArgumentException("tree has root");
        root=createNode(e,null,null,null);
        size=1;
        return root;
    }
    public position<E> addleft(position<E> p, E e)
    {
        Node<E>parent=validateNode(p);
        if (parent.getLeft()!=null)
            throw new IllegalArgumentException("p has a left child");
        Node<E>child=createNode(e,parent,null,null);
        parent.setLeft(child);
        size++;
        return child;
    }
    public position<E> addright(position<E> p, E e)
    {
        Node<E>parent=validateNode(p);
        if (parent.getRight()!=null)
            throw new IllegalArgumentException("p has a left child");
        Node<E>child=createNode(e,parent,null,null);
        parent.setRight(child);
        size++;
        return child;
    }
    public E set(position<E> p, E e)
    {
        Node<E> n= validateNode(p);
        E del= n.getElement();
        n.setElement(e);
        return del;
    }


    private static class Node <E> implements position<E>
    {

        E element;
        Node<E>parent;
        Node<E>left;
        Node<E>right;


        public Node(E element, Node<E> parent, Node<E> left, Node<E> right) {
            this.element = element;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }
        public E getElement() {
            return element;
        }
        public void setElement(E element) {
            this.element = element;
        }
        public Node<E> getParent() {
            return parent;
        }
        public void setParent(Node<E> parent) {
            this.parent = parent;
        }
        public Node<E> getLeft() {
            return left;
        }
        public void setLeft(Node<E> left) {
            this.left = left;
        }
        public Node<E> getRight() {
            return right;
        }
        public void setRight(Node<E> right) {
            this.right = right;
        }
        @Override
        public E getElemnt() {
            return null;
        }
    }
}
