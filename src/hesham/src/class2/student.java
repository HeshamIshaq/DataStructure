package class2;

public class student extends person {
    int id ;
    public student(int number, String name) {
        super(number, name);
    }

    public student(int number, String name, int id) {
        super(number, name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString()+ "class2.student{" +
                "id=" + id +
                '}';
    }
}
