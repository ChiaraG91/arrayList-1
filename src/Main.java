import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Student studente1 = new Student("Fabio",21);
        Student studente2 = new Student("Giulia", 20);
        Student studente3 = new Student("Marco",22);


        ArrayList<String> student = new ArrayList<String>();
        student.add(String.valueOf(studente1));
        student.add(String.valueOf(studente2));
        student.add(String.valueOf(studente3));
        System.out.println(student);

        student.add(String.valueOf(new Student("Luca",21)));
        student.add(String.valueOf(new Student("Giorgia", 20)));
        student.add(String.valueOf(new Student("Mario",22)));

        System.out.println(student);

    }



}

