import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("�������", "��������", 23));
        personList.add(new Person("����", "����������-���������", 42));
        personList.add(new Person("��������", "���������� ��������", 44));
        personList.add(new Person("�����", "����������-�������-�����������", 22));

        SurnameLength surnameLength = new SurnameLength(1);

        personList.sort(surnameLength);
        System.out.println(personList);



    }
}