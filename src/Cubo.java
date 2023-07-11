import java.util.Scanner;

public class Cubo extends Figura{
    double a;
    @Override
    double CalcularArea() {
        double area= 6*Math.pow(calcularDistancia(0,1),2);
        return area;

    }

    @Override
    double CalcularPerimetro() {
        a= calcularDistancia(0,1);
        double perimetro=a*12;
        return perimetro;
    }

    @Override
    void IngresarPuntos() {
        Scanner sc = new Scanner(System.in);
        for (int i= 0; i<2; i++ ){
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
        double volumen= Math.pow(a,3);
        return volumen;
    }

}
