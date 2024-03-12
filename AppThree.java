import static java.lang.String.format;

class Frog{

    private int id;
    private String name;

    public Frog(int id, String name){
        this.id = id;
        this.name = name;

    }
    public String toString(){

        return String.format("%-3d: %s", id, name);

       /*  The String Builder method
       StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);

        return sb.toString(); */
//toString method reduces the
// inefficiency of the adding the two Strings
       //  return id + ": " + name;
    }
}

public class AppThree {

    public static void main(String[] args) {
        Frog frog1 = new Frog(7, "chegks");
        Frog frog2 = new Frog(31, "Roger");

        System.out.println(frog1);
        System.out.println(frog2);
    }
}
