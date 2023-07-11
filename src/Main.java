import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion;
        List<Figura> listaFiguras = new ArrayList<>();
        List<Figura> calcularArea = new ArrayList<>();
        List<Figura> perimeTro = new ArrayList<>();
        List<Figura> volumen = new ArrayList<>();
        System.out.println("Bienvenido al sistema de Cálculos de Figuras Trigonometricas");

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("a) Triángulo");
            System.out.println("b) Cuadrado");
            System.out.println("c) Círculo");
            System.out.println("d) Piramide");
            System.out.println("e) Cubo");
            System.out.println("f) Esfera");
            System.out.println("g) Figuras Registradas Con sus datos");
            System.out.println("q) Salir");

            opcion = scanner.nextLine().charAt(0);

            switch (opcion) {
                case 'a':
                    Triangulo tr = new Triangulo();
                    tr.IngresarPuntos();
                    listaFiguras.add(tr);
                    calcularArea.add(tr);
                    perimeTro.add(tr);
                    break;
                case 'b':
                    Cuadrado cu = new Cuadrado();
                    cu.IngresarPuntos();
                    listaFiguras.add(cu);
                    calcularArea.add(cu);
                    perimeTro.add(cu);
                    break;
                case 'c':
                    Circulo ci = new Circulo();
                    ci.IngresarPuntos();
                    listaFiguras.add(ci);
                    calcularArea.add(ci);
                    perimeTro.add(ci);
                    break;
                case 'd':
                    Piramide pi  = new Piramide();
                    pi.IngresarPuntos();
                    listaFiguras.add(pi);
                    calcularArea.add(pi);
                    perimeTro.add(pi);
                    volumen.add(pi);
                    break;
                case 'e':
                    Cubo cb = new Cubo();
                    cb.IngresarPuntos();
                    listaFiguras.add(cb);
                    calcularArea.add(cb);
                    perimeTro.add(cb);
                    volumen.add(cb);
                    break;
                case 'f':
                    Esfera es = new Esfera();
                    es.IngresarPuntos();
                    listaFiguras.add(es);
                    calcularArea.add(es);
                    perimeTro.add(es);
                    volumen.add(es);
                    break;
                case 'g':
                    if (listaFiguras.isEmpty()) {
                        System.out.println("Ninguna figura fue seleccionada.");
                    } else {
                        System.out.println("Figuras y Puntos ingresados:");
                        for (Figura figura : listaFiguras) {
                            System.out.println(figura.getClass().getSimpleName());
                            for (Punto punto : figura.listaPuntos) {
                                System.out.println("Punto: (" + punto.getX() + ", " + punto.getY() + ", " + punto.getZ() + ")");
                            }
                            System.out.println("Área: " + figura.CalcularArea());
                            System.out.println("Perímetro: " + figura.CalcularPerimetro());
                            if (volumen.contains(figura)) {
                                System.out.println("Volumen: " + figura.CalcularVolumen());
                            }
                            System.out.println();
                        }
                    }
                    break;
                case 'q':
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 'q');

    }
}

