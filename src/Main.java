import java.util.*;

public class Main {

    record student(String name, double gpa) {}
    static List<student> students = new ArrayList<student>();
    // Our Queue

    public static void main(String[] args) {



        //student s1 = new student("Yabalis", 3.0);
        //student s2 = new student("John Doe", 2.9);
        students.add(new student("Yabalis", 3.0));
        students.add(new student("John Doe", 2.9));
        students.add(new student("Jehu",2.7));
        students.add(new student("Ben",3.6));
        students.add(new student("Jake",3.4));

        System.out.println(students);

        filterGPA(students);

        System.out.printf("\nAfter Filter: %s\n", students);

        // Priority Queue




        // Students => { name: Steven } or {Steven} students -> { name:Steven, GPA: 2.0 }
    }

    static void filterGPA(List<student> students) {

        //ArrayList<Integer> removeIndexes = new ArrayList<>();
        List<student> copyOfStudents = new ArrayList<>();
        for (int i = 0; i < students.size(); i += 1) {
            if (students.get(i).gpa >= 3.0) {

                // Keep track of indexes with less than 3.0 gpa, remove them
                copyOfStudents.add(students.get(i));
                // Old approach: remove indexes while looping and checking gpas simultaneously
                //System.out.printf("\nArray size: %d\n", students.size());
                //students.remove(i);
            }
        }
        // Remove corresponding indexes
        //for (int i = 0; i < removeIndexes.size(); i += 1) {
          //  students.remove(i);
        //}
        //students = copyOfStudents;
       newList(copyOfStudents);
        // call that method here
    }

    // make a method this method is going to take in our new list
    static void newList(List<student> copyStudents) {
        students = copyStudents;
    }
}