package OptionalTaskJavaCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//4.   Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
public class Paragraph4 {
    public static String Стихотворение =
"He sendeth sun, he sendeth shower,,\n"+
"Alike they're needful for the flower:,\n"+
"And joys and tears alike are sent,\n"+
"To give the soul fit nourishment.,\n"+
"As comes to me or cloud or sun,,\n"+
"Father! thy will, not mine, be done!,\n"+
"Can loving children e'er reprove,\n"+
"With murmurs whom they trust and love?,\n"+
"Creator! I would ever be,\n"+
"A trusting, loving child to thee:,\n"+
"As comes to me or cloud or sun,,\n"+
"Father! thy will, not mine, be done!,\n"+
"Oh, ne'er will I at life repine:,\n"+
"Enough that thou hast made it mine.,\n"+
"When falls the shadow cold of death,\n"+
"I yet will sing, with parting breath,,\n"+
"As comes to me or shade or sun,,\n"+
"Father! thy will, not mine, be done!,\n";

       private static Comparator <String> SortByIncreaseLongLines = new Comparator<String> () {
        @Override
        public int compare(String o1, String o2) {
            return o1.length () - o2.length ();
        }
    };
    public static void main (String[] args){
        List<String> lines = Arrays.asList(Стихотворение.split("\n"));
        System.out.println(lines);

        Collections.sort(lines, SortByIncreaseLongLines);
        System.out.println(lines);
    }
}
