import java.util.Arrays;
import java.util.Random;

public class ops {
    int a[]={5,4,3,2,1};
    int b[]={5,4,3,2};
    public void remove (int arr[], int index){
        if (index >= 0 && index < arr.length){
            int i = index;
            while (i<arr.length-1)
            {
                arr[i]=arr[i+1];
                i++;
            }
            arr[i]=0;
        }
    }
    public int search(int arr[],int value) {

        int i=0;
        boolean flag=false;
        int index = -1;
        while (!flag&&i<arr.length) {
            if(arr[i]==value)

            {
                flag=true;
                index=i;
            }
            i++;}
        return index;
    }
    public void insearionSort(int arr[]) {
        for (int i = 1; i < arr.length ; i++) {
            int cur =a[i];
            int j=i;
            while (j>0&& cur<arr[j-1])
            {
               arr[j]=arr[j-1];
                j--;
            }
            arr[j]=cur;
        }
    }
    public void fillrandom(int arr[])
    {
        Random r = new Random();
        r.setSeed(System.currentTimeMillis());
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=r.nextInt(10);
        }
    }
    public static void main(String[] args) {
        ops o= new ops();
        o.fillrandom(o.a);
        System.out.println(Arrays.toString(o.a));
        //Arrays.fill(o.a,3);
        //Arrays.sort(o.a);
        //  o.remove(o.a,2);
        //  o.insearionSort(o.a);
        //System.out.println(Arrays.toString(o.a));

        //System.out.println(Arrays.binarySearch(o.a,3));
        //System.out.println(Arrays.toString(o.a));
        //System.out.println(o.search(o.a,3));
        //System.out.println(Arrays.equals(o.a,o.b));

    }

}
