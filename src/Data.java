import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Data {

    private String name;
    private ArrayList<Passport> data;

    public Data (String name){
        this.name=name;
        this.data=new ArrayList<Passport>(10);
    }

    public void find(String find) {
            if (getData().toString().contains(find)) {
                System.out.println("Паспорт номер: " +find+" найден в "+getData().toString());
            } else {
                System.out.println("Паспорт не найден!");
            }
        }

        public void infoData(){
            System.out.println(toString());
        }


    public String getName() {
        return name;
    }

    public ArrayList<Passport> getData() {
            return data;
        }

        public void get(int a){
            for(int i = 0; i < getData().size(); i++) {
                if (a==i){
                    System.out.print(getData().get(i).toString());
            }}
        }

    @Override
 public String toString() {
     return "Data "
             + name +
             " "+data +
             ".";
 }
}
