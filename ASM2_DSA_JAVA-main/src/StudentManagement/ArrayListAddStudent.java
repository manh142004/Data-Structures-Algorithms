package StudentManagement;

import java.util.ArrayList;

public class ArrayListAddStudent {
    public void addStudent(ArrayList<Student> students, Student objectData) {
        try {
            // Check if a student with the same ID already exists
            for (Student student : students) {
                if (student.getId().equals(objectData.getId())) {
                    throw new DuplicateIDException("Error: Student with ID " + objectData.getId() + " already exists.");
                }
            }
            students.add(objectData);
        } catch (DuplicateIDException e) {

            System.out.println("\033[1;31m" + e.getMessage() + "\033[0m");
        }
    }
}

