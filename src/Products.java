import java.util.LinkedList;

public class Products {

    private String name;
    private int price;
    private String quantity;


    public Products(String name, int price, String quantity) {
        if(name==null || quantity==null || name.isEmpty() || quantity.isEmpty()){
            System.out.println("Ошибка! Заполните поля!");
        } else {
        this.name = name;
        this.price = price;
        this.quantity = quantity;}
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }

}
