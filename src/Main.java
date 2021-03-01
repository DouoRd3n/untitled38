import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("John", 35),
                new Person("Nick", 34),
                new Person("Ann", 27));
        sorted( personList);
personList.forEach(p-> System.out.println(p));
    }




    public static void sorted( List<Person> list){
        Person temp;
        for (int i = 0; i <list.size()-1 ; i++) {
            for (int j = 0; j <list.size()-1 ; j++) {
                if (list.get(j).hashCode()>list.get(j+1).hashCode()){
                    temp = list.get(j+1);
                    list.set(j+1,list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

}
