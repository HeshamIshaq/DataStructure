import class2.DoublyLinkedList;

/**
 * Created by KING TECH on 01/03/2021.
 */
public class TestDou {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addLast(11);
        list.addLast(12);
        list.addLast(13);
        int n = list.size();
        for (int i = 0; i < n; i++) {
            System.out.println(list.removeLast());
        }
    }
}
