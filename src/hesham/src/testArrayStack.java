public class testArrayStack {
    public static void main(String[] args) {
        ArrayStack<Integer>stack = new ArrayStack<>();
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        while (!stack.isEmpty())
            System.out.println(stack.pop());


    }
}
