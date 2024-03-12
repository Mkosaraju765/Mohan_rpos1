import java.sql.SQLOutput;

public class AppTwo {

    public static void main(String[] args) {

        //inefficient

        String info = " ";

        info += "My name is Bob:";
        info += " ";
        info += "I'm a builder";


        System.out.println(info);

        // this is the more efficient method
        StringBuilder sb = new StringBuilder(" ");

        sb.append("My name is sue...");
        sb.append(" ");
        sb.append("I'm a lion tamer..");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("My name is Roger..").append(" ").append("I'm a Skydiver ..");

        System.out.println(s.toString());

        //string buffer is only a small threaded version of String builder...
        //string bulder is more historically newer than string buffer


        ///////////////formatting//////////////////

        System.out.println("Here is some text ..\t That was a tab. \n THat was a new line ");

        System.out.println("More text...!!");

        System.out.printf("Total cost is %-5d;  quantity is %d", 5, 58);

        for (int i = 0; i < 20; i++) {
            // System.out.println("%d: some text here\n", i); }
        }
    }
}
