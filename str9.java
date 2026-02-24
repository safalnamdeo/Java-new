class Employee {

    String name;
    int id;
    double salary;

    void giveIncrement() {
        salary = salary + (salary * 0.05);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.name = "Rahul";
        emp.id = 101;
        emp.salary = 50000;

        System.out.println("Before Increment:");
        emp.display();

        emp.giveIncrement();

        System.out.println("After 5% Increment:");
        emp.display();
    }
}