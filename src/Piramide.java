import java.util.Scanner;

public class Piramide extends Figura{
    double a,b,c,d,e,f,g;
    @Override
    double CalcularArea() {
        double area= (calcularDistancia(0,1)+calcularDistancia(0,2)+calcularDistancia(1,2))+(calcularDistancia(0,3)+ calcularDistancia(2,3)+calcularDistancia(1,3));
        return area;
    }

    @Override
    double CalcularPerimetro() {
        a= calcularDistancia(0,1);
        b= calcularDistancia(0,2);
        c= calcularDistancia(1,2);
        d= calcularDistancia(0,3);
        f= calcularDistancia(2,3);
        g= calcularDistancia(1,3);
        double perimetro=a+b+c+d+e+f+g;
        return perimetro;

    }

    @Override
    void IngresarPuntos() {
        Scanner sc = new Scanner(System.in);
        for (int i= 0; i<4; i++ ){
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
        double volumen = (((a+b+c)*f)/3);
        return volumen;
    }
}

