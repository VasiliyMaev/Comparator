import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Котофей", "Пупочкин", 23));
        personList.add(new Person("Иван", "Табуреткин-Заводской", 42));
        personList.add(new Person("Катерина", "Барабанова Трубская", 44));
        personList.add(new Person("Софья", "Дранникова-Блинова-Пирожочкина", 22));

        SurnameLength surnameLength = new SurnameLength(1);

        personList.sort(surnameLength);
        System.out.println(personList);



    }
}