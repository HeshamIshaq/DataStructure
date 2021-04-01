package class2;

public class test {

    public static void main(String[] args) {
        person p1;
        student s1 = new student(1,"hesham",111);
        p1 = s1; //widening cast
        System.out.println(p1);
       // class2.person p2 = new class2.person(32,"fatima");
        person p2 = new student(32,"fatima");
        if ( p2 instanceof student) {
            student s2;
            s2 = (student) p2; //narrowing cast
        }












    }}
