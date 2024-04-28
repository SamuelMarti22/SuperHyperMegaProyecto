package backend;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicializar Scanner
        Scanner sc = new Scanner(System.in);
        // Creación de variables necesarias u objetos
        Palabras palabras = new Palabras();
        ArrayList<String> listaPalabras = new ArrayList<String>();

        // Menu de usuario
        System.out.println("Sopa de letras");
        System.out.print("Ingresa la dificultad de la sopa de letras:\n0. Facil \n1. Intermedio\n2. Dificil\nDecide: ");
        int dificultad = sc.nextInt();
        System.out.print(
                "Ingresa el tema de la sopa de letras:\n1. Naturaleza \n1. Historia\n2. Tecnología\n4. Deporte\nDecide: ");
        int tipo = sc.nextInt();

        // Condicionales a partir de las opciones del usuario
        if (tipo == 1) {
            String[] lista = palabras.naturaleza[dificultad];
            listaPalabras = seleccionarPalabras(lista, dificultad);
        } else if (tipo == 2) {
            String[] lista = palabras.historia[dificultad];
            listaPalabras = seleccionarPalabras(lista, dificultad);
        } else if (tipo == 3) {
            String[] lista = palabras.tecnologia[dificultad];
            listaPalabras = seleccionarPalabras(lista, dificultad);
        } else if (tipo == 4) {
            String[] lista = palabras.deporte[dificultad];
            listaPalabras = seleccionarPalabras(lista, dificultad);
        } else {
            System.out.println("Ingresa un numero valido");
        }

        String[][] matriz = ponerPalabras(listaPalabras, dificultad);
        for (String[] columna : matriz) {
            System.out.print("| ");
            for (String fila : columna) {
                System.out.print(fila + " | ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static String[][] ponerPalabras(ArrayList<String> listaPalabras, int dificultad) {
        Random rand = new Random();
        // Crear la matríz con las posiciones y el tamaño adecuado
        String[][] matriz;
        int i = 0;
        if (dificultad == 0) {
            matriz = new String[10][10];
            matriz = llenarSopa(matriz);
            String palabra = listaPalabras.get(7);
            while (i < palabra.length()) {
                matriz[1 + i][1 + i] = Character.toString(palabra.charAt(i));
                i += 1;
            }
            i = 0;
            palabra = listaPalabras.get(6);
            while (i < palabra.length()) {
                matriz[1 + i][8] = Character.toString(palabra.charAt(i));
                i += 1;
            }

        } else if (dificultad == 1) {
            matriz = new String[15][15];
            matriz = llenarSopa(matriz);
            String palabra = listaPalabras.get(12);
            while (i < palabra.length()) {
                matriz[1 + i][1 + i] = Character.toString(palabra.charAt(i));
                i += 1;
            }
            i = 0;
            palabra = listaPalabras.get(11);
            while (i < palabra.length()) {
                matriz[1 + i][8] = Character.toString(palabra.charAt(i));
                i += 1;
            }
        } else {
            matriz = new String[20][20];
            matriz = llenarSopa(matriz);
            String palabra = listaPalabras.get(17);
            while (i < palabra.length()) {
                matriz[1 + i][1 + i] = Character.toString(palabra.charAt(i));
                i += 1;
            }
            i = 0;
            palabra = listaPalabras.get(16);
            while (i < palabra.length()) {
                matriz[1 + i][10] = Character.toString(palabra.charAt(i));
                i += 1;
            }
        }
        i = listaPalabras.size() - 3;
        while (i >= 0 && i <= listaPalabras.size() - 3) {
            String palabra = listaPalabras.get(i);
            String matrizL = "";
            String palabraL = "";
            int disponibles = 0;
            int w = 0;
            int x = rand.nextInt(matriz.length - palabra.length());
            int y = rand.nextInt(matriz.length - palabra.length());
            while (w < palabra.length()) {
                matrizL = matriz[x + w][y];
                palabraL = Character.toString(palabra.charAt(w));
                if ((matrizL.equals(palabraL) || matrizL.equals(" "))) {
                    disponibles += 1;
                }
                w += 1;
            }
            if (disponibles == palabra.length()) {

                int a = 0;
                while (a < palabra.length()) {
                    matrizL = matriz[x + a][y];
                    palabraL = Character.toString(palabra.charAt(a));
                    matriz[x + a][y] = palabraL;
                    a += 1;
                }
            } else {
                w = 0;
                disponibles = 0;
                while (w < palabra.length()) {
                    matrizL = matriz[x][y + w];
                    palabraL = Character.toString(palabra.charAt(w));
                    if ((matrizL.equals(palabraL) || matrizL.equals(" "))) {
                        disponibles += 1;
                    }
                    w += 1;
                }

                if (disponibles == palabra.length()) {
                    int a = 0;
                    while (a < palabra.length()) {
                        matrizL = matriz[x][y + a];
                        palabraL = Character.toString(palabra.charAt(a));
                        matriz[x][y + a] = palabraL;
                        a += 1;
                    }
                } else {
                    w = 0;
                    disponibles = 0;
                    while (w < palabra.length()) {
                        matrizL = matriz[x + w][y + w];
                        palabraL = Character.toString(palabra.charAt(w));
                        if ((matrizL.equals(palabraL) || matrizL.equals(" "))) {
                            disponibles += 1;
                        }
                        w += 1;
                    }

                    if (disponibles == palabra.length()) {
                        int a = 0;
                        while (a < palabra.length()) {
                            matrizL = matriz[x + a][y + a];
                            palabraL = Character.toString(palabra.charAt(a));
                            matriz[x + a][y + a] = palabraL;
                            a += 1;
                        }
                    } else {
                        i = i + 1;
                    }
                }

            }
            i -= 1;
        }
        return matriz;

    }

    public static String[][] llenarSopa(String[][] sopaIncompleta) {
        String[][] matrizLista = sopaIncompleta;
        for (int i = 0; i < sopaIncompleta.length; i++) {
            for (int j = 0; j < sopaIncompleta[i].length; j++) {
                if (matrizLista[i][j] == null) {
                    matrizLista[i][j] = " ";
                }
            }
        }
        return matrizLista;
    }

    public static ArrayList<String> seleccionarPalabras(String[] listica, int dificultad) {
        Random rand = new Random();
        ArrayList<String> lista = new ArrayList<>();
        int cantidad = 3;
        int cantidad2 = 2;
        if (dificultad == 1) {
            cantidad += 2;
            cantidad2 += 1;
        } else if (dificultad == 2) {
            cantidad += 4;
            cantidad2 += 2;
        }
        for (int i = 0; i < cantidad; i++) {
            String seleccionado = listica[rand.nextInt(7)];
            if (lista.contains(seleccionado)) {
                i--;
            } else {
                lista.add(seleccionado);
            }
        }
        for (int i = 0; i < cantidad; i++) {
            String seleccionado = listica[rand.nextInt(7, 14)];
            if (lista.contains(seleccionado)) {
                i--;
            } else {
                lista.add(seleccionado);
            }
        }
        for (int i = 0; i < cantidad2; i++) {
            String seleccionado = listica[rand.nextInt(14, 20)];
            if (lista.contains(seleccionado)) {
                i--;
            } else {
                lista.add(seleccionado);
            }
        }
        return lista;
    }
}

// matrizL = matriz[x + w][y];
// palabraL = Character.toString(palabra.charAt(w));
// if (matrizL.equals(palabraL) || matrizL.equals(" ")) {
// matriz[x + w][y] = palabraL;
// w += 1;
// }