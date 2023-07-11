import java.util.Scanner;

public class Esfera extends Figura{
    @Override
    double CalcularArea() {
        double area = 4*Math.PI* Math.pow(calcularRadio(0,1),2);
        return area;

    }

    @Override
    double CalcularPerimetro() {
        double perimetro = 2* Math.PI*calcularRadio(0,1);
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
        double volumen =  (4 * Math.PI * Math.pow(calcularRadio(0,1), 3)) / 3;
        return volumen;
    }

}