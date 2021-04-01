package class2;
public class GArray <T> {
    T arr[];
    int num = 0;

    public GArray(T[] arr) {
        this.arr = arr;
    }

    public GArray() {
        arr = (T[]) new Object[2];
    }

    public void add(T el) {
        if (num <= arr.length-1) {
            arr[num++] = el;
        }
    }

    public void print()
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] args) {

        GArray<Integer> a = new GArray<>();
        a.add(1);
        a.add(2);
        a.print();
        GArray<String> a2 = new GArray<>();
        a2.add("hesham");
        a2.add("fatima");
        a2.print();
    }
}
