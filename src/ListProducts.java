import java.util.*;
import java.util.Iterator;

public class ListProducts {

    private String name;
    private Set<Products> listParticipants;

    public ListProducts(String name) {
        this.name=name;
        this.listParticipants = new HashSet<Products>();
    }

    public void infoListProducts() { //System.out.println(Arrays.toString(getListProducts().toArray()));
        System.out.println("Название списка покупок: "+getName()+".");
        Iterator<Products> iterator=listParticipants.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());}
   }


    public String getName() {
        return name;
    }

    public Set<Products> getListProducts() {
        return listParticipants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListProducts that = (ListProducts) o;
        return Objects.equals(name, that.name) && Objects.equals(listParticipants, that.listParticipants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, listParticipants);
    }
}
