 class Animal {
    void bark(){
        System.out.println("bark");
    }

    
}
class Dog extends Animal {
    void eat(){
        System.out.println("pizza...");
    }

}
class puppy extends Dog{
    void play(){
        System.out.println("ludo....");
    }
}
class inherit {
    public static void main(String[] args) {
        puppy s1=new puppy();
        s1.bark();
        s1.eat();
        s1.play();
        
    }
    
}
