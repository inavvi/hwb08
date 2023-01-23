import java.util.*;

public class Recipes <Lp extends ListProducts> {

    private String name;
    //private Set<ListProducts> listProducts;
    private ArrayList<ListProducts> listProducts;
    private int totalPrice;



    public Recipes(String name, ListProducts listProducts, int totalPrice) {
        if(name==null || name.isEmpty()){
            System.out.println("Ошибка! Заполните поля!");
        } else {
            this.name = name;
            this.listProducts = new ArrayList<>();
            getListProducts().add(listProducts);
            this.totalPrice = totalPrice;}
    }


    public void infoRecipes() {
        System.out.println("Название рецепта: "+getName()+".");
        System.out.println("Список продуктов: "+getListProducts()+".");
        System.out.println("Стоимость продуктов итого: "+getTotalPrice());
    }


    public ArrayList<ListProducts> getListProducts() {
       return listProducts;
     }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes<?> recipes = (Recipes<?>) o;
        return listProducts.equals(recipes.listProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listProducts);
    }
}
