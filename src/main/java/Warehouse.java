import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "warehouses")
public class Warehouse
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_warehouses")
    private int idWarehouse;

    @Column(name = "name_warehouses")
    private String warehouseName;


    @ManyToOne
    @JoinColumn (name = "id_items")
    private Item item;

    public int getIdWarehouse (){
        return idWarehouse;
    }

    public void setIdWarehouse (int idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public Item getItems() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Warehouse ()
    {

    }

    public Warehouse (String warehouseName, Item item) {
        this.warehouseName = warehouseName;
        this.item = item;
    }

    @Override
    public String toString() {
        return String.format("Warehouse [id = %d, name = '%s']", idWarehouse, warehouseName);
    }

}

