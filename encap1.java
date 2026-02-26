class Atm {
    private int paisa;
    public Atm(int r ){
        this.paisa=r;

    }
    public int gatter(int a){
        return paisa;

    }
}
public class encap1 {
    public static void main(String[] args) {
        Atm s1=new Atm(100);
        System.out.println(s1.gatter(20));
    }

    
}
