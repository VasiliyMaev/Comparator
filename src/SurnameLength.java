import java.util.Comparator;

public class SurnameLength implements Comparator<Person> {
    int count;

    public SurnameLength(int count) {
        this.count = count;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int countWordsO1 = o1.getSurname().split("-| |,").length;
        int countWordsO2 = o2.getSurname().split("-| |,").length;

        if (countWordsO1 == countWordsO2 && (countWordsO1 > count & countWordsO2 > count)){
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return Integer.compare(o1.getSurname().length(), o2.getSurname().length());
    }
}
