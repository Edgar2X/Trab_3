public class Quadrado extends Quadrilatero{

    float lado;

    public Quadrado(float l1) {
        super(l1,l1,l1,l1);
        this.lado = l1;
    }

    public void area() {
       System.out.println(4*lado);
    }

    

}

