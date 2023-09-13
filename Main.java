
 class Main{
     public static void main (String[] args) {
        phone p1 = new jio();
        p1.charge();
        p1.color();
        
        phone p2 = new oppo();
        p2.charge();
        p2.color();
        
    }
}

interface phone{
    void charge();
    default void color(){
        System.out.printf("BLACK");
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
