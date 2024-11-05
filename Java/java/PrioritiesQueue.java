import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.Comparator.comparingDouble;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getCGPA() {
        return this.cgpa;
    }
}

class Priorities {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents(List<String> events) {
        events.forEach(item -> {
            if(item.startsWith("ENTER")) {
                String[] attributes = item.split(" ");
                this.students.add(new Student(Integer.valueOf(attributes[3]), attributes[1], Double.valueOf(attributes[2])));
            } else if(item.equals("SERVED") && !this.students.isEmpty()) {
                Optional<Student> max = this.students.stream()
                .sorted(comparingDouble(Student::getCGPA).reversed()
                        .thenComparing(Student::getName)
                        .thenComparingInt(Student::getID))
                .findFirst();
                if(max.isPresent()) {
                    this.students.remove(max.get());
                }
            }
        });
        return this.students.stream().sorted(comparingDouble(Student::getCGPA).reversed()
                                .thenComparing(Student::getName)
                                .thenComparingInt(Student::getID))
                        .collect(Collectors.toList());
    }
}

class PrioritiesOptimized {
    private PriorityQueue<Student> students = new PriorityQueue<>(
                comparingDouble(Student::getCGPA).reversed()
                        .thenComparing(Student::getName)
                        .thenComparingInt(Student::getID));
    
    public List<Student> getStudents(List<String> events) {
        events.forEach(item -> {
            if(item.startsWith("ENTER")) {
                String[] attributes = item.split(" ");
                this.students.add(new Student(Integer.valueOf(attributes[3]), attributes[1], Double.valueOf(attributes[2])));
            } else if(item.equals("SERVED") && !this.students.isEmpty()) {
                students.poll();
            }
        });
        return students.stream().sorted(comparingDouble(Student::getCGPA).reversed()
                        .thenComparing(Student::getName)
                        .thenComparingInt(Student::getID)).collect(Collectors.toList());
    }
}


public class PrioritiesQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}