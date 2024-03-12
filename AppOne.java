class Thing
{ //example for the static variables

    public static final int Lucky_Number = 7;
    public String name;
    public static String description;
    public int id;

    public static int count = 0;

    public Thing() { // this is constructor, and this basically
        //  runs everytime a new_thing will be created
        id = count;
        count++;
    }
    // here the count will be keep on incrementing based on the
    //static variable present ....
    public void showName() {
        System.out.println("Object id: " + id + "," + description + ":" + name );
    }

    public static void main(String[] args) {
        System.out.println(description);

        // wont work with SOP( name);
    }
    //So Everytime when the object  is created, the count gets increased by one number

}

public class AppOne {

    public static void main(String[] args) {

        Thing.description = "I'm a thing named";

        // Thing.showInfo();

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "Bob";
        thing2.name = "Sue";

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);
        System.out.println(Thing.Lucky_Number);
    }
  //has it's own ID..!!!, but thers's only one show to count ..!!!
}
