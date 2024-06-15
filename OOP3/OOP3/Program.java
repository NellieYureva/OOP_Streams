package OOP3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
// — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
// — Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;

public class Program {
   
    static List <Stream> Stream1 = new ArrayList<>();
    static List <Stream> Stream2 = new ArrayList<>();
    static List <Stream> Stream3 = new ArrayList<>();
    
    
    public static void main(String[] args) {

        StudentGroup sg1 = new StudentGroup("Group 1");
        StudentGroup sg2 = new StudentGroup("Group 2");
        StudentGroup sg3 = new StudentGroup("Group 3");
        StudentGroup sg4 = new StudentGroup("Group 4");
        StudentGroup sg5 = new StudentGroup("Group 5");
        StudentGroup sg6 = new StudentGroup("Group 6");
        StudentGroup sg7 = new StudentGroup("Group 7");
        StudentGroup sg8 = new StudentGroup("Group 8");
        StudentGroup sg9 = new StudentGroup("Group 9");
   

        final Stream st1 = new Stream (Arrays.asList(sg1, sg2), "Stream1");
        Stream st2 = new Stream(Arrays.asList(sg3, sg4, sg5), "Stream2");
        Stream st3 = new Stream(Arrays.asList(sg6, sg7, sg8, sg9), "Stream3");

        List<Stream> streams = Arrays.asList(st1, st2, st3);

        System.out.println(streams);

        StreamService streamService = new StreamService();
        streamService.sortStream(streams);

        for (Stream stream : streams) {
            int count = stream.getGroup().size();
            System.out.println("Количество групп в потоке " + stream.getName() + ": " + count + ".");
        }

    }

}