import java.util.*;

public class Race {

    public String  name;
    public double bestLapTime;
    private Set<Transport> listParticipants;
   // private String


    public Race (String name) {
        this.name=name;
        this.bestLapTime=10000;
        listParticipants = new HashSet<Transport>();
    }

        public void infoListParticipants() {
            System.out.println(getListParticipants());
       }

// public void infoListParticipants(){
   //     System.out.println("Гонка "+getName()+". Всего участников: "+listParticipants.size());
   //     for (int i=0; i<3; i++) {
   //         System.out.println(listParticipants.get(i).getBrand()+" "+listParticipants.get(i).getModel()+" "+listParticipants.get(i).getColor());
   //     }
   // }

    public String getName() {
        return name;
    }

    public Set<Transport> getListParticipants() {
        return listParticipants;
    }


    public double getBestLapTime() {
        return bestLapTime;
    }

    public void setBestLapTime(double bestLapTime) {
        this.bestLapTime = bestLapTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return listParticipants.equals(race.listParticipants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listParticipants);
    }
}
