/*To sort the objects of custom class (this is the class whose objects do not have a natural ordering), you need to implement the comparable interface in that custom class
 and override the compareTo method to compare the objects as you desire */
import java.util.*;
public class MyComparableCustom {

    public static class Author implements Comparable<Author>{
        private String firstName;
        private String lastName;
        private String bookName;

        public Author(String fname, String lname, String book){
            this.firstName = fname;
            this.lastName = lname;
            this.bookName = book;
        }

        /* This is where we write the logic to sort. This method automatically sort by the
        first name if the last names are the same */
        @Override
        public int compareTo(Author au){

            //Because firstName and lastName are strings I have called the compareTo method of string class
            int out = this.lastName.compareTo(au.lastName);
            return out==0 ? this.firstName.compareTo(au.firstName) : out;
        }

    }

    public static void main(String[] args){
        List<Author> list = new ArrayList<>();
        list.add(new Author("balaji", "arun", "java"));
        list.add(new Author("lekha", "balaji", "algo"));
        list.add(new Author("punitha", "arun", "cook"));
        list.add(new Author("arun", "subramaniam", "pokynose"));

        Collections.sort(list);

        for(Author au : list){
            System.out.println(au.firstName + " " + au.lastName + " " + au.bookName);
        }

    }
}
