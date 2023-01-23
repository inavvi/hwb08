import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Products bananas = new Products("Бананы", 70, "1 кг");
        Products porkMeat = new Products("Свинина", 300, "1 кг");
        Products apple = new Products("Яблоки", 68, "1 кг");
        Products milk = new Products("Молоко", 62, "1 шт.");
        Products chocolate = new Products("Шоколад", 110, "1 шт.");
        Products egg = new Products("Яйцо", 20, "2 шт.");
        Products tomato = new Products("Помидор", 20, "1 шт.");
        Products sausage = new Products("Сосиска", 20, "1 шт.");


        ListProducts ivan = new ListProducts("Иван");
        ListProducts steggs = new ListProducts("Яичница с помидором");
        ListProducts sseggs = new ListProducts("Яичница с сосиской");

        ListRecipes vivan = new ListRecipes("Коллекция Ивана");

        Recipes raSteggs = new Recipes("Яичница с помидором", steggs, 40);
        Recipes rbSteggs = new Recipes("Яичница с сосиской", sseggs, 40);

        Numbers nivan = new Numbers("Числа Ивана");

        ivan.getListProducts().add(bananas);
        ivan.getListProducts().add(porkMeat);
        ivan.getListProducts().add(bananas);
        ivan.getListProducts().add(apple);
        ivan.getListProducts().add(milk);
        ivan.getListProducts().add(chocolate);

        steggs.getListProducts().add(egg);
        steggs.getListProducts().add(tomato);

        sseggs.getListProducts().add(egg);
        sseggs.getListProducts().add(sausage);


        vivan.getListRecipes().add(raSteggs);
        vivan.getListRecipes().add(rbSteggs);

        nivan.getListNumbers().add("2");
        nivan.getListNumbers().add("8");
        nivan.getListNumbers().add("42");
        nivan.getListNumbers().add("16");
        nivan.getListNumbers().add("1");
        nivan.getListNumbers().add("4");
        nivan.getListNumbers().add("46");
        nivan.getListNumbers().add("36");
        nivan.getListNumbers().add("3");
        nivan.getListNumbers().add("22");
        nivan.getListNumbers().add("6");
        nivan.getListNumbers().add("14");
        nivan.getListNumbers().add("142");
        nivan.getListNumbers().add("164");
        nivan.getListNumbers().add("98");
        nivan.getListNumbers().add("94");
        nivan.getListNumbers().add("64");
        nivan.getListNumbers().add("78");
        nivan.getListNumbers().add("82");
        nivan.getListNumbers().add("84");

        nivan.getListNumbers().remove("1");
        nivan.getListNumbers().remove("3");

        Car murcielago = new Car("Lamborghini", "Murcielago", Car.BodyType.COUPE, "оранжевый", "6,19 л.");
        Car murcielagob = new Car("Lamborghini", "Murcielago", Car.BodyType.COUPE, "белый", "6,19 л.");
        Car murcielagoc = new Car("Lamborghini", "Murcielago", Car.BodyType.COUPE, "красный", "6,19 л.");
        Car lancer = new Car("Mitsubishi", "Lancer Evolution VIII", Car.BodyType.SEDAN, "красный", "2 л.");

        Race leman = new Race("Леман");

        leman.getListParticipants().add(murcielago);
        leman.getListParticipants().add(murcielagob);
        leman.getListParticipants().add(murcielagob);
        leman.getListParticipants().add(lancer);

        Task one = new Task("Умножение");

        one.getListTask().add("2*1=");
        one.getListTask().add("2*2=");
        one.getListTask().add("2*3=");
        one.getListTask().add("2*4=");
        one.getListTask().add("2*5=");
        one.getListTask().add("3*1=");
        one.getListTask().add("3*2=");
        one.getListTask().add("3*3=");
        one.getListTask().add("3*4=");
        one.getListTask().add("3*5=");
        one.getListTask().add("4*1=");
        one.getListTask().add("4*2=");
        one.getListTask().add("4*3=");
        one.getListTask().add("4*4=");
        one.getListTask().add("4*5=");
        one.getListTask().add("2*1=");
        one.getListTask().add("2*2=");
        one.getListTask().add("2*3=");
        one.getListTask().add("2*4=");
        one.getListTask().add("2*5=");

        Data ru = new Data("Россия");

        Passport ivanov = new Passport("123456", "Иванов Иван Иванович", "1 августа 2000");
        Passport ivanova = new Passport("123546", "Иванов Алексей Иванович", "2 августа 2002");
        Passport ivanovs = new Passport("123654", "Иванов Сергей Иванович", "3 августа 2003");

        ru.getData().add(ivanov);
        ru.getData().add(ivanova);
        ru.getData().add(ivanovs);

        ivan.infoListProducts();
        raSteggs.infoRecipes();
        rbSteggs.infoRecipes();

        vivan.infoListRecipes();
        nivan.infoListNumbers();

        leman.infoListParticipants();

        one.infoTask();

        ivanov.infoPassport();
        ru.infoData();
        ru.find("123546");
        ru.get(0);


        //private void process(Collection<Integer> firstCollection, List<Integer> list) {
        //    if (firstCollection.containsAll(list)) {
        //        System.out.println("Первая коллекция содержит все элементы списка");
        //    } else {
        //        System.out.println("Некоторые (или все) элементы из списка отсутствуют в первой коллекции");
        //    }
        //}

        //ArrayList - ячейки памяти идут друг за другом с возрастанием индекса на 1, поэтому скорость выполнения бытет выше.

    }
}