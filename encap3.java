class student{
    private String name;
    private int marks;

    
    public student(String n, int m) {
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

 class encap3 {
    public static void main(String[] args) {

        student obj = new student("safal", 34);
        obj.printDetails();
    }
}