package ejercicioGit;

import java.util.ArrayList;
import java.util.List;

// Clase Pantalla
public class Pantalla {
    private List<Figura> figuras;

    public Pantalla() {
        figuras = new ArrayList<>();
    }

    public void anadeFigura(Figura figura) {
        figuras.add(figura);
    }

    public void modificaFigura(char nuevoCaracter) {
        for (Figura figura : figuras) {
            figura.setCaracter(nuevoCaracter);
        }
    }

    public void listaFiguras() {
        for (Figura figura : figuras) {
            System.out.println(figura.nombre());
        }
    }

    public int areaPantalla() {
        int areaTotal = 0;
        for (Figura figura : figuras) {
            areaTotal += figura.area();
        }
        return areaTotal;
    }

    public void muestraPantalla() {
        for (Figura figura : figuras) {
            figura.dibujar();
            System.out.println();
        }
    }
}
