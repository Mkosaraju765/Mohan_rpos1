import java.util.ArrayList;

public class ProgramTwo {

    public static void main(String[] args) {

        ArrayList <String> bakeryList = new ArrayList();

        bakeryList.add("pastaa");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");


        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("Raddish");
        produceList.add("Green peppers");

        ArrayList<String> produceListTwo = new ArrayList();

        produceListTwo.add("tomotoes");
        produceListTwo.add("zucchini");
        produceListTwo.add("Green peppers");

        System.out.println(bakeryList.get(1));
        System.out.println(bakeryList.get(0));
        System.out.println(bakeryList.get(2));

        //Warning:(19, 48) Raw use of parameterized class 'ArrayList'
/*Warning:(7, 45) Raw use of parameterized class 'ArrayList'
Warning:(7, 45) Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList<java.lang.String>'
Warning:(14, 27) Contents of collection 'produceList' are updated, but never queried
Warning:(14, 45) Raw use of parameterized class 'ArrayList'
Warning:(14, 45) Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList<java.lang.String>'
Warning:(19, 27) Contents of collection 'produceListTwo' are updated, but never queried
Warning:(19, 48) Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList<java.lang.String>' */
    }


}
