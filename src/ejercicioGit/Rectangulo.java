package ejercicioGit;
//Clase Rectangulo
public class Rectangulo implements Figura {
 private int base;
 private int altura;
 private char caracter;

 public Rectangulo(int base, int altura, char caracter) {
     this.base = base;
     this.altura = altura;
     this.caracter = caracter;
 }

 @Override
 public String nombre() {
     return "Rectángulo de " + base + "x" + altura;
 }

 @Override
 public void dibujar() {
     for (int i = 0; i < altura; i++) {
         for (int j = 0; j < base; j++) {
             System.out.print(caracter + " ");
         }
         System.out.println();
     }
 }

 @Override
 public int area() {
     return base * altura;
 }

 @Override
 public void setCaracter(char c) {
     this.caracter = c;
 }

 @Override
 public char getCaracter() {
     return caracter;
 }
}
