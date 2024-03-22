import java.util.ArrayList;

public class Program1{

    //Arraylist  = is nothing but a resizable array
    //Elemnts can be added and removed after each co pilation phase,
    //which are stored reference datatypes

    public static void main(String[] args) {

    ArrayList<String> food = new ArrayList<String>();

    food.add("pizza");
    food.add("hamburger");
    food.add("hotdog");

    food .set( 0, "sushi");
    food.remove(2);
    food.clear();

        for (int i= 0 ; i < food.size(); i++)
            //normally for, arrays we use dot length parameter
    //here for the arraylist i.e food size() parameter will be used
        {
            System.out.println("\n"+ food.get(i));

            System.out.println(food.get(i));
         }

    }
}
