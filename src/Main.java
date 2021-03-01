import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("John", 35),
                new Person("Nick", 34),
                new Person("Ann", 27));
        List<Person> collect = personList.stream().sorted().collect(Collectors.toList());
        collect.forEach(System.out::println);
    }






}
