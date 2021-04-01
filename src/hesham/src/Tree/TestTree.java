package Tree;

import Tree.BinaryThree;

public class TestTree {

    public static void main(String[] args) {
        BinaryThree<String> t= new BinaryThree<>();
        position<String> p = t.addRoot("A");
        t.addleft(p,"E");
        t.addright(p,"C");
        System.out.println(t.size());
        System.out.println(t.root().getElemnt());
        System.out.println(t.left(p).getElemnt());
        System.out.println(t.right(p).getElemnt());

    }
}
