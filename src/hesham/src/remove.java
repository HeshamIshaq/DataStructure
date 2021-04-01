import java.util.Arrays;

public class remove {
    int a[]={5,4,3,2,1};
    public void removee (int arr[], int index){
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

    public static void main(String[] args) {
        remove r =new remove();
        System.out.println(Arrays.toString(r.a));
        r.removee(r.a,2);
        System.out.println(Arrays.toString(r.a));


    }
}
