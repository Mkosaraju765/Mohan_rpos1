import java.util.ArrayList;

public class ForEachExample {

    public static void main(String[] args) {
        
        //for-each : traversing technique to iterate through
        //the elements in a correction

        //less steps, more readable
        //less flexible

        //String[] animals = {"cat", "dog", "rat", "bird"};
        ArrayList <String> animals = new ArrayList<String>();

        //Warning:(14, 52) Explicit type argument String can be replaced with <>
        animals.add("cat");
        animals.add("dog" + "\tns");
        animals.add("rat\t");
        animals.add("bird");
        animals.add("racoon");

        for(String i : animals) {

            System.out.println(i);
        }
    }
}
