import java.util.LinkedList;

public class Quize {

    public static void main(String[] args) {
        LinkedList<products> li = new LinkedList<products>();
        products pr1 = new products("s1",1,1);
        li.add(pr1);
        products pr2 = new products("s2",11,1);
        li.add(pr2);
        products pr3 = new products("s3",111,1);
        li.add(pr3);
        int x = li.size();
        for (int i = 0; i <x ; i++) {
            System.out.println(li.removeLast().toString());

        }



    }
}
