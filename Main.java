//Edgar Enthony Ferreira Lima

public class Main {
    public static void main(String[] args) {

        Quadrado q = new Quadrado(8);
        Retangulo r = new Retangulo(7,4);
        Circulo  c = new Circulo();     // Exemplo com construtor sem parametro
        Circulo  c2 = new Circulo(3);   // Exemplo com construtor com parametro
        
        System.out.println("Quadrado");
        
        q.getLado();
        q.perimetro();
        q.area();

        System.out.println("");
        System.out.println("Retangulo");

        r.getBase();
        r.getAltura();
        r.perimetro();
        r.area();
        
        System.out.println("");
        System.out.println("Círculo com raio igual a 1");

        c.getRaio();
        c.perimetro();
        c.area();

        System.out.println("");
        System.out.println("Círculo com raio diferente de 1");

        c2.getRaio();
        c2.perimetro();
        c2.area();
     }
}
 
