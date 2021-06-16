//Edgar Enthony Ferreira Lima

public class Main {
    public static void main(String[] args) {
        
        Quadrado q = new Quadrado(4);
        Retangulo r = new Retangulo(4,6);
        Circulo  c = new Circulo();     // Exemplo com construtor sem parametro
        Circulo  c2 = new Circulo(5);   // Exemplo com construtor com parametro
        
        q.perimetro();
        q.area();

        r.perimetro();
        r.area();

        c.getRaio();
        c.perimetro();
        c.area();

        c2.getRaio();
        c2.perimetro();
        c2.area();
     }
}
 
