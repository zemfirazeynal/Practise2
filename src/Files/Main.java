package Files;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List <Student> all = new ArrayList<>();

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student(sc.next(), sc.nextLong(), sc.nextLong());

        all.add(s1);

        get(s1);
    }

    public static void add(Student s){
        all.add(s);
    }

    public static void delete (Student s){
        all.remove(s);
    }
    public static void get (Student s1){
        for (Student s : all ){
            System.out.println(s.toString());
        }
    }
}
