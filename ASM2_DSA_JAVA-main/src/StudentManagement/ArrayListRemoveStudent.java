package StudentManagement;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListRemoveStudent {
    public void removeStudentById(ArrayList<Student> students, String id){
        try {
            boolean isRemoved = false;

            for (int i = 0; i < students.size(); i++) {
                if (Objects.equals(students.get(i).id, id)) {
                    students.remove(i);
                    isRemoved = true;
                    break;
                }
            }

            if (!isRemoved) {
                throw new Exception("Error: Student with ID " + id + " not found in the list.");
            }
        } catch (Exception e) {
            System.out.println("\033[1;31m" + e.getMessage() + "\033[0m");
        }
    }
}
