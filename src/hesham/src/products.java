import java.sql.Array;
import java.util.ArrayList;

public class products {
    private String name_pro ;
    private int price_pro ;
    private int Qualty_pro ;
    public products() {
    }
    public products(String name_pro, int price_pro, int qualty_pro) {
        this.name_pro = name_pro;
        this.price_pro = price_pro;
        Qualty_pro = qualty_pro;
    }
    public String getName_pro() {
        return name_pro;
    }
    public void setName_pro(String name_pro) {
        this.name_pro = name_pro;
    }
    public int getPrice_pro() {
        return price_pro;
    }
    public void setPrice_pro(int price_pro) {
        this.price_pro = price_pro;
    }
    public int getQualty_pro() {
        return Qualty_pro;
    }
    public void setQualty_pro(int qualty_pro) {
        Qualty_pro = qualty_pro;
    }

    @Override
    public String toString() {
        return "products{" +
                "name_pro='" + name_pro + '\'' +
                ", price_pro=" + price_pro +
                ", Qualty_pro=" + Qualty_pro +
                '}';
    }

    public void addpro(){


    }
}
