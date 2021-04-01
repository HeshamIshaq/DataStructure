package queu;

/**
 * Created by KING TECH on 15/03/2021.
 */
public class testQueu {
    public static void main(String[] args) {
       // Arrayqueu<String> q= new Arrayqueu<>();
        LinkidListQueu<String> q= new LinkidListQueu<>();
        q.enqueue("hesham");
        q.enqueue("rasheed");
        q.enqueue("mohammed");
        q.enqueue("adel mushwar");
        while (!q.isEmpty())
            System.out.println(q.dequeue());

    }
}
