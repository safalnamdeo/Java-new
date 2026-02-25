class Person{
    void displayName(){
        System.out.println("person");
    }
}
class Student extends Person{
    void displyclass(){
        System.out.println("displayingclass");
    }
}
class Monitor extends Student{
    void checkDiscipline(){
        System.out.println("checkingdiscipline");
    }
}
public class inherit2 {
    public static void main(String[] args) {
        Monitor s1=new Monitor();
        s1.displayName();
        s1.displyclass();
        s1.checkDiscipline();
    
        
    }
    
}
