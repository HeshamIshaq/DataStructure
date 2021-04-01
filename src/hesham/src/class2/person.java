package class2;

public class person {
    int number;
    String name;

    public person(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "class2.person{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}