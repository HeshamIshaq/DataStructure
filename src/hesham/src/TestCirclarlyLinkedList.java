/**
 * Created by KING TECH on 01/03/2021.
 */
public class TestCirclarlyLinkedList {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> list = new CircularlyLinkedList<>();
        list.addlast(11);
        list.addlast(12);
        list.addlast(13);
        int n= list.size();
        for (int i = 0; i < n; i++) {
            System.out.println(list.first());
            list.rotate();
        }
    }
}
