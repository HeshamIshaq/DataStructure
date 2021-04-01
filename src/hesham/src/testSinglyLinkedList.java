/**
 * Created by KING TECH on 22/02/2021.
 */
public class testSinglyLinkedList {
    public static void main(String[] args) {
        singlyLinkedList<Integer> list = new singlyLinkedList<>();
        singlyLinkedList<Integer> list2 = new singlyLinkedList<>();
        list.addFirst(11);
        list.addFirst(12);
        list.addlast(13);
        // System.out.println(list.print());
        int n = list.size();
        for (int i=0; i<n; i++){
            int x=list.removeFerst();
            list2.addFirst(x);
            System.out.println();
        }
        System.out.println(list.size());
    }
}
