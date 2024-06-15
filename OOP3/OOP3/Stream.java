// Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
// Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
// Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;

package OOP3;


import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> group;
    private String name;

    public Stream(List<StudentGroup> group, String name) {
        this.group = group;
        this.name = name;
    }

    public List<StudentGroup> getGroup() {
        return group;
    }

    public String getName() {
        return name;        
    }

    @Override
    public String toString() {
        return " " + name + " ";
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return group.iterator();
    }

    
}

    
