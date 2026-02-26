interface Animal {
    void run();
}

class Dog implements Animal {
    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}

public class abst2 {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.run();
    }
}