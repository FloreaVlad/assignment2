package mvc.POJO;

import mvc.POJO.helper.IdAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name="BOOK")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "author", "quantity", "price"})
public class Book {

    @XmlAttribute
    @XmlJavaTypeAdapter(IdAdapter.class)
    private Integer id;

    private String name;

    private String author;

    private int quantity;

    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
