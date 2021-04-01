package class2;
public class oldpair {

    Object frist;
    Object scond;

    public oldpair(Object frist, Object scond) {
        this.frist = frist;
        this.scond = scond;
    }

    public Object getFrist() {
        return frist;
    }

    public void setFrist(Object frist) {
        this.frist = frist;
    }

    public Object getScond() {
        return scond;
    }


    public void setScond(Object scond) {
        this.scond = scond;
    }

    @Override
    public String toString() {
        return "oldpair{" +
                "frist=" + frist +
                ", scond=" + scond +
                '}';
    }

    public static void main(String[] args) {
        oldpair bookpir = new oldpair("book1",1);
        oldpair suppir = new oldpair("book1",2.111);
        String x = (String )bookpir.frist;
        int y = (int )bookpir.scond;
        System.out.println(x + " " + y);
        student s1 = new student(10,"aa",11);
        student s2 = new student(20,"bb",22);
        oldpair comp= new oldpair(s1,s2);
        System.out.println(comp);
    }
}
