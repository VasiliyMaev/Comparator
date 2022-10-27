import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Котофей", "Пупочкин", 23));
        personList.add(new Person("Иван", "Табуреткин-Заводской", 42));
        personList.add(new Person("Катерина", "Барабанова Трубская Баринова Лапочкина", 44));
        personList.add(new Person("Софья", "ДранниковаБлинчиковаГолубцоваСметанина", 22));
        personList.add(new Person("Ян", "У И Ля Сяо Ху", 13));

        SurnameLength surnameLength = new SurnameLength(3);

        personList.sort(surnameLength);
        System.out.println(personList);



    }
}