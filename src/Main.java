import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Котофей", "Пупочкин", 23));
        personList.add(new Person("Иван", "Табуреткин-Заводской", 42));
        personList.add(new Person("Катерина", "Барабанова Трубская Баринова Лапочкина", 44));
        personList.add(new Person("Софья", "ДранниковаБлинчиковаГолубцова-Сметанина", 22));
        personList.add(new Person("Ян", "У И Ля Сяо Ху", 13));

        Comparator<Person> comparator = (Person o1, Person o2) -> {
            String[] countWordsO1 = o1.toString().split("[-| |,]");
            String[] countWordsO2 = o2.toString().split("[-| |,]");
            if (countWordsO1.length == countWordsO2.length && (countWordsO1.length > 4 & countWordsO2.length > 4)) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            return Integer.compare(countWordsO1.length, countWordsO2.length);
        };


        Collections.sort(personList, comparator);
        System.out.println(personList);


    }
}