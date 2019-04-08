import java.util.ArrayList;
import java.util.List;

public class Stuff {
    public static void main(String[] args){
        List<String> animals = new ArrayList<String>();

        animals.add("dog");
        animals.add("cat");
        animals.add("Snake");
        animals.set(2, "lizard");
        animals.add(1, "fish");
        animals.remove(3);
        System.out.println(animals);
    }
}



