import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Task {
    private String name;
    private Set<String> listTask;
    private int taskSize;

    public Task(String name) {
        this.name=name;
        this.listTask = new HashSet<String>();
    }

    public void infoTask() {
        Iterator<String> it=getListTask().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
           taskSize=getSize()+1;
        }
        System.out.println("Всего задач: "+getSize());
    }

    public Set<String> getListTask() {
        return listTask;
    }

    public int getSize() {
        return taskSize;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) && Objects.equals(listTask, task.listTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, listTask);
    }
}
