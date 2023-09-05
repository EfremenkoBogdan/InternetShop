import jakarta.persistence.*;

@Entity
@Table (name = "customers_details")
public class CustomerDetail
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "email")
    private String email;

    @Column (name = "city")
    private String city;

    @OneToOne (mappedBy = "details")
    private Customer customer;

    public int getId (){
        return id;
    }
    public void setId (int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CustomerDetail (String city, String email) {
        this.city = city;
        this.email = email;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CustomerDetail (){

    }

    @Override
    public String toString() {
        return String.format("CustomerDetail[email = '%s', city = '%s']", email, city );
    }
}
