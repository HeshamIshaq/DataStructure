package class2;
public class Gmethod {

    public static <T> void print (T arr[])
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }


    public static void main(String[] args) {
        Integer a[] = {11,22,33,44,55};
        String b[] = {"aa","bb","cc"};
        print(a);
        print(b);
    }
}
