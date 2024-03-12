class Person  {

    //instance variables { date pr "state"}
    String name ;
    int age;

    //classes can contain
    //1.Data
    //2.Subroutines (methods)

    void speak() {
        for(int i = 0; i < 3; i++ )
        {
            System.out.println("My name is : " + " and I am " + age + "years old");
        }
        System.out.println("hello");

       /* void sayHello()
    { System.out.println("Hello There()"); } */

    }

/* void sayHello() {
 //   System.out.println("Hello There()");
} */
public class ClassExample {

    public static void main(String[] args) {

        //create a person object using the person class
        Person person1 = new Person();
        person1.name = "Joe Blogge";
        person1.age = 38;
        person1.speak();
        
      //  person1.sayHello();

    //create a second person object
        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.speak();

        System.out.println(person1.name);
        System.out.println(person1.age);

        System.out.println(person2.name);
        System.out.println(person2.age); 
    	}
	}
}
