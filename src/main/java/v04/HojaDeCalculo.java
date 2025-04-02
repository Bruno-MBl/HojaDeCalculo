package v04;

public class HojaDeCalculo {

    private Celda[][] celdas;
    private final int FILAS;
    private final int COLUMNAS;

    public HojaDeCalculo(int numeroFilas, int numeroColumnas) {
        this.FILAS = numeroFilas;
        this.COLUMNAS = numeroColumnas;
        celdas = new Celda[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                celdas[i][j] = new Celda();
            }
        }
    }

    public Celda getCelda(int fila, int columna) {
        return celdas[fila][columna];
    }

    public int getNumeroDeFilas() {
        return FILAS;
    }

    public int getNumeroDeColumnas() {
        return COLUMNAS;
    }

    public void ordenarColumna(int columna, boolean ascendente) {
        if (ascendente) {
            for (int i = 0; i < FILAS; i++) {
                int temp = Integer.parseInt(celdas[i][columna].getContenido());
                for (int j = i; j < FILAS; j++) {
                    int celda = Integer.parseInt(celdas[i][columna].getContenido());
                    if (temp > celda) {
                        temp = celda;
                        celdas[j][columna].setContenido(celdas[i][columna].getContenido());
                        celdas[i][columna].setContenido(String.valueOf(temp));
                    }
                }
            }
        } else {
            for (int i = 0; i < FILAS; i++) {
                int temp = Integer.parseInt(celdas[i][columna].getContenido());
                for (int j = i; j < FILAS; j++) {
                    int celda = Integer.parseInt(celdas[i][columna].getContenido());
                    if (temp < celda) {
                        temp = celda;
                        celdas[j][columna].setContenido(celdas[i][columna].getContenido());
                        celdas[i][columna].setContenido(String.valueOf(temp));
                    }
                }
            }

        }
    }
}
