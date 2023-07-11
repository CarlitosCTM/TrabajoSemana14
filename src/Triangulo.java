import java.util.Scanner;

public class Triangulo extends Figura{

    double a,b,c ;


    @Override
    double CalcularArea() {
        double area=Math.sqrt(CalcularPerimetro()/2*(CalcularPerimetro()/2-a)*(CalcularPerimetro()/2-b)*(CalcularPerimetro()/2-c));
        return area;
    }

    @Override
    double CalcularPerimetro() {
        a= calcularDistancia(0,1);
        b= calcularDistancia(0,2);
        c= calcularDistancia(1,2);
        double perimetro=a+b+c;
        return perimetro;

    }

    @Override
    void IngresarPuntos() {
        Scanner sc = new Scanner(System.in);
        for (int i= 0; i<3; i++ ){
            System.out.println("Ingrese la coordenada x "+i+": ");
            double x = sc.nextDouble();
            System.out.println("Ingrese la coordenada y "+i+": ");
            double y = sc.nextDouble();
            System.out.println("Ingrese la coordenada z "+i+": ");
            double z = sc.nextDouble();
            listaPuntos.add(new Punto(x,y,z));
        }
    }

    @Override
    double CalcularVolumen() {
        return 0;
    }
}
