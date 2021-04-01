import class2.DoublyLinkedList;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addLast(11);
        list.addLast(12);
        list.addLast(13);
        int n= list.size();
        for (int i = 0; i <n ; i++) {
            System.out.println(list.removeLast());

        }

    }
}
