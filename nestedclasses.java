class nestedclasses{
    public static void main (String[] args) {
        outer o = new outer();
        outer.inner i = o.new inner();
        System.out.println(o.x);
        System.out.println(i.y);
    }
}

class outer{
    int x = 10;
    class inner{
        int y=5;
    }
}