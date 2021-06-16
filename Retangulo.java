public class Retangulo extends Quadrilatero{

    float base;
    float altura;

    public Retangulo(float l1, float l2) {
        super(l1, l2, l1 ,l2);
        this.base = l1;
        this.altura = l2;
    }

    public void area() {
        System.out.println(base*altura);
    }
    
}
