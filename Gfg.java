class GetterandSetters{
    int a;
    int b;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
boolean compare(GetterandSetters ob){
        return this.a == ob.a;
}
}

public class Gfg{
    public static void main(String args[]){
        GetterandSetters ob1 = new GetterandSetters();
        ob1.setA(23);

        GetterandSetters ob2 = new GetterandSetters();
        ob2.setA(23);

        GetterandSetters ob3 = new GetterandSetters();
        ob3.setA(46);

        System.out.println(ob1.compare(ob2));
        System.out.println(ob1.compare(ob3));
    }
}