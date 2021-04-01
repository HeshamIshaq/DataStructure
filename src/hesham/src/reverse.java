import java.util.Scanner;
public class reverse {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int  i, j = 0;
            int a=0;
            int b =0;
            System.out.println("Enter the size : ");
            a = s.nextInt();
            int arr1[] = new int[a];
            int arr2[] = new int[a];
            System.out.println("Enter " + a +" "+ "element");
            for (i = 0; i < a; i++) {
                arr1[i] = s.nextInt();
            }
            System.out.println("reverse is : ");
            for (i = a; i > 0; i--, j++) {
                arr2[j] = arr1[i - 1];
                System.out.print(arr2[j]+" ");}}}
