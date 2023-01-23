import java.util.*;

public class ListRecipes {
    private String name;

    private ArrayList<Recipes> listRecipes;

    public ListRecipes(String name) {
        this.name=name;
        this.listRecipes = new ArrayList<>();
    }


    public void infoListRecipes() {
        System.out.println(Arrays.toString(getListRecipes().toArray()));
    }


    public String getName() {
        return name;
    }

    public ArrayList<Recipes> getListRecipes() {
        return listRecipes;
    }
}
