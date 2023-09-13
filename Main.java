
 class Main{
     public static void main (String[] args) {
        phone p1 = new jio();
        p1.charge();
        p1.color();
        System.out.println();
        
        phone p2 = new oppo();
        p2.charge();
         System.out.println();
        p2.color();
        System.out.println();
        System.out.println(phone.A);
        
        smart s = new smart();
        s.charge();
        s.cover();
        
    }
}

interface phone{
    void charge();
    static final int A = 2003;
    default void color(){
        System.out.printf("BLACK");
    }
}

interface iphone{
    void cover();
}
class smart implements phone,iphone{         // IT IS multiple interface example 
    public void charge(){
        System.out.println("it is charging");
    }
    public void cover(){
        System.out.println("it is super charging");
    }
}

class jio implements phone{
    public void charge(){
        System.out.println("charging");
    }
}

class oppo implements phone{
    public void charge(){
        System.out.printf("Super charging");
    }
}
