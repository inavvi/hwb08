import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;

public class Passport {

    private String passport;
    private String fullName;
    private String birthDate;


    public Passport(String passport, String fullName, String birthDate) {
        this.passport=passport;
        this.fullName=fullName;
        this.birthDate=birthDate;
    }



    public void infoPassport(){
        System.out.println(toString());
    }

    public String getPassport() {
        return passport;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Паспорт " +
                "номер: " + passport +
                "; ФИО: " + fullName +
                "; день рождения: " + birthDate;
    }
}
