import java.io.Serializable;

public class ProductManagment implements Serializable {
    private String id;
    private String name;
    private int cost;
    private String manufactured;
    private String describe;

    public ProductManagment(String id, String name, int cost, String manufactured, String describe) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.manufactured = manufactured;
        this.describe = describe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getManufactured() {
        return manufactured;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "ProductManagment{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", manufactured='" + manufactured + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
