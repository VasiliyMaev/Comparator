import java.util.Comparator;

public class SurnameLength implements Comparator<Person> {
    protected int count;

    public SurnameLength(int count) {
        this.count = count;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String separator = " |-|,";
        String[] countWordsO1 = o1.getSurname().split(separator);
        String[] countWordsO2 = o2.getSurname().split(separator);

        if (countWordsO1.length == countWordsO2.length && (countWordsO1.length > count & countWordsO2.length > count)){
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return Integer.compare(countWordsO1.length, countWordsO2.length);
    }
}
