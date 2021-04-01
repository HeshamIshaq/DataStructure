package class2;
public class pir<A,B> {

    A first ;
    B scond ;

    public pir(A first, B scond) {
        this.first = first;
        this.scond = scond;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getScond() {
        return scond;
    }

    public void setScond(B scond) {
        this.scond = scond;

    }

    @Override
    public String toString() {
        return "pir{" +
                "first=" + first +
                ", scond=" + scond +
                '}';
    }

    public static void main(String[] args) {
        pir<String,Integer> bookpir = new pir<>("Fatima",123);
        String x = bookpir.getFirst();
        int y = bookpir.getScond();
        System.out.println(x + " " + y);
    }
}
