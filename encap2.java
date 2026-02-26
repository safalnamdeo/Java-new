class Student {

    private String name;
    private int marks;

    // Correct Constructor (NO void)
    public Student(String n, int m) {
        this.name = n;
        this.marks = m;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void printDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class encap2 {
    public static void main(String[] args) {

        Student obj = new Student("Rahul", 34);
        obj.printDetails();
    }
}