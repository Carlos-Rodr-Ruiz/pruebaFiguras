package ejercicioGit;

import java.util.Scanner;

//Clase DibujaPantalla
public class DibujaPantalla {
 public static void main(String[] args) {
     Pantalla pantalla = new Pantalla();
     Scanner scanner = new Scanner(System.in);

     char opcion;
     do {
         System.out.println("Menú:");
         System.out.println("a. Añadir Figura");
         System.out.println("b. Modificar Carácter de Figuras");
         System.out.println("c. Mostrar Pantalla");
         System.out.println("d. Calcular Área de la Pantalla");
         System.out.println("e. Listar Figuras");
         System.out.println("f. Salir");
         System.out.print("Seleccione una opción: ");
         opcion = scanner.nextLine().charAt(0);

         switch (opcion) {
             case 'a':
                 System.out.println("¿Qué figura desea añadir? (r para rectángulo, t para triángulo):");
                 char tipoFigura = scanner.nextLine().charAt(0);
                 if (tipoFigura == 'r') {
                     System.out.print("Ingrese la base del rectángulo: ");
                     int base = Integer.parseInt(scanner.nextLine());
                     System.out.print("Ingrese la altura del rectángulo: ");
                     int altura = Integer.parseInt(scanner.nextLine());
                     System.out.print("Ingrese el carácter del rectángulo: ");
                     char caracterR = scanner.nextLine().charAt(0);
                     pantalla.anadeFigura(new Rectangulo(base, altura, caracterR));
                 } else if (tipoFigura == 't') {
                     System.out.print("Ingrese el lado del triángulo: ");
                     int lado = Integer.parseInt(scanner.nextLine());
                     System.out.print("Ingrese el carácter del triángulo: ");
                     char caracterT = scanner.nextLine().charAt(0);
                     pantalla.anadeFigura(new Triangulo(lado, caracterT));
                 } else {
                     System.out.println("Opción inválida");
                 }
                 break;
             case 'b':
                 System.out.print("Ingrese el nuevo carácter para todas las figuras: ");
                 char nuevoCaracter = scanner.nextLine().charAt(0);
                 pantalla.modificaFigura(nuevoCaracter);
                 break;
             case 'c':
                 pantalla.muestraPantalla();
                 break;
             case 'd':
                 System.out.println("El área total de la pantalla es: " + pantalla.areaPantalla());
                 break;
             case 'e':
                 pantalla.listaFiguras();
                 break;
             case 'f':
                 System.out.println("Saliendo...");
                 break;
             default:
                 System.out.println("Opción inválida");
                 break;
         }
     } while (opcion != 'f');
     scanner.close();
 }
}
