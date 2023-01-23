import java.util.ArrayList;
import java.util.Arrays;

public class Numbers {
    private String name;

    private ArrayList<String> listNumbers;

    public Numbers(String name) {
        this.name=name;
        this.listNumbers = new ArrayList<>();
    }


    public void infoListNumbers() {
        System.out.println(Arrays.toString(getListNumbers().toArray()));
    }


    public ArrayList<String> getListNumbers() {
        return listNumbers;
    }
}
