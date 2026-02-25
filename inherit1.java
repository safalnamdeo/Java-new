class Employee{
    void work(){
        System.out.println("Employee is working");
    }
}
class Manager extends Employee{
    void attendMeeting(){
        System.out.println("attending meeting");
    }
}
public class inherit1 {
    public static void main(String[] args) {
        Manager s1=new Manager();
        s1.attendMeeting();
        
    }
    
}
