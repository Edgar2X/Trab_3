import java.math.*;
public class Circulo implements Geo{
    private float raio;
    
    public Circulo(){
        this.raio = 1;
    }

    public Circulo(float raio){
        this.raio = raio;
    }

    public void getRaio(){
        System.out.println("Raio: "+raio);
    };

    public void area() {
       System.out.println("Área: "+(Math.PI * (raio*raio)));
    }

    public void perimetro() {
        System.out.println("Perímetro: "+(2 * Math.PI * raio));
    }

}
