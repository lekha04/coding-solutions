/* Comparator interface with example - https://beginnersbook.com/2017/08/comparator-interface-in-java/#:~:text=For%20example%2C%20lets%20say%20we,this%20can%20be%20done%20using
If we want to sort the objects based on any of the data member we can use comparable but
if we want to have multiple sort choices and sort objects based on any choice we can use
comparator interface
 */
import java.util.*;
public class MyComparator {

    public static class Author{
        private String firstName;
        private String bookName;
        private int age;

        public Author(String fname, String book, int age){
            this.firstName = fname;
            this.bookName = book;
            this.age = age;
        }
    }

    public static class AgeComparator implements Comparator<Author> {

        @Override
        public int compare(Author a1, Author a2) {
            if (a1.age == a2.age) {
                return 0;
            } else if (a1.age < a2.age) {
                return -1;
            } else {
                return 1;

            }
        }
    }

        public static class NameComparator implements Comparator<Author> {

            @Override
            public int compare(Author a1, Author a2) {
                int out = a1.firstName.compareTo(a2.firstName);
                return out;
            }
        }

        public static void main(String[] args){
            Author[] arr = new Author[]{
                    new Author("lekha", "algo", 26),
                    new Author("balaji", "java", 25),
                    new Author("mom", "love", 62),
                    new Author("cheenu", "dog", 20)};

            Arrays.sort(arr, new AgeComparator());
            for(Author au : arr){
                System.out.println(au.firstName + " " + au.age);
            }

            Arrays.sort(arr, new NameComparator());
            for(Author au : arr){
                System.out.println(au.firstName + " " + au.age);
            }
        }
}
