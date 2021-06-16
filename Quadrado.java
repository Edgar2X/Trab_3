public class Quadrado extends Quadrilatero{

    float lado;

    public Quadrado(float l1) {
        super(l1,l1,l1,l1);
        this.lado = l1;
    }

    public void getLado(){
        System.out.println("Lado: "+lado);
    }

    public void area() {
       System.out.println("Área: " + 4*lado);
    }

}

