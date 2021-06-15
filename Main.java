//Edgar Enthony Ferreira Lima

public class Main {
    public static void main(String[] args) {
        Circulo  c = new Circulo();     // Exemplo com construtor sem parametro
        Circulo  c2 = new Circulo(5);   // Exemplo com construtor com parametro
        
        c.getRaio();
        c.perimetro();
        c.area();

        c2.getRaio();
        c2.perimetro();
        c2.area();
     }
}
 
