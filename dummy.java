import java.util.ArrayList;

public class StudentGrader {

    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Charlie");

        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(85);
        grades.add(92);
        grades.add("78"); // Error: adding a string to an Integer list

        for (int i = 0; i <= studentNames.size(); i++) { // Error: index out of bounds
            String name = studentNames.get(i);
            int grade = grades.get(i);

            printResult(name, grade); // Error: method not static
        }

        System.out.println("Grading complete!")
    }

    public void printResult(String name, int grade) { // Error: method not static
        if (grade > 90) {
            System.out.println(name + " received an A.");
        } else if (grade >= 80) {
            System.out.println(name + " received a B.");
        else { // Error: missing closing brace for else if
            System.out.println(name + " needs improvement.");
        }
    }
}
