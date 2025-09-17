package mynewpack;

import java.util.*;

class myStudent {
    String name;
    int marks;

    myStudent(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " (" + marks + ")";
    }
}

// Comparator class to compare students by marks
class StudentMarksComparator implements Comparator<myStudent> {
    public int compare(myStudent s1, myStudent s2) {
        return Integer.compare(s1.marks, s2.marks);
    }
}

public class  C1_Searchingeg  {
    public static void main(String[] args) {
        List<myStudent> students = new ArrayList<>();
        students.add(new myStudent("Alice", 80));
        students.add(new myStudent("Bob", 60));
        students.add(new myStudent("Charlie", 90));

        // Create comparator object
        Comparator<myStudent> byMarks = new StudentMarksComparator();

        // Sort students by marks
        Collections.sort(students, byMarks);

        // Binary search for a student with marks = 80
        int index = Collections.binarySearch(students, new myStudent("X", 80), byMarks); //The name doesn’t matter because comparator only compares marks.

        System.out.println("Sorted Students: " + students);
        System.out.println("Index: " + index);
        System.out.println("Student found: " + students.get(index));
    }
}

