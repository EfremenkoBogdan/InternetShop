import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "shop_items")
public class Item
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_items")
    private int id;

    @Column(name = "title")
    private String title;

    @Column (name = "price")
    private int price;

    @OneToMany (mappedBy = "item")
    private List <Warehouse> warehouses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List <Warehouse> getWarehouse() {
        return warehouses;
    }

    public void setWarehouse(List <Warehouse> warehouse) {
        this.warehouses = warehouse;
    }

    public Item ()
    {

    }

        public Item (String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Item [id = %d, title = '%s', price = %d ]", id, title,price);
    }

}
