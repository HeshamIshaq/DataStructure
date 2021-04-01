import java.util.Arrays;
import java.util.Random;

public class randomArr {
    int a[]={5,4,3,2,1};
    public void frandom(int arr[])
    {
        Random r = new Random();
        r.setSeed(System.currentTimeMillis());
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=r.nextInt(10);
        }
    }

    public static void main(String[] args) {

        randomArr rr = new randomArr();
        rr.frandom(rr.a);
        System.out.println(Arrays.toString(rr.a));}}