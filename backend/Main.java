package backend;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sopa de letras");
        Scanner sc = new Scanner(System.in);
        Palabras palabras = new Palabras();
        int n = sc.nextInt();
        ArrayList<String> lista = seleccionarPalabras(palabras.tecnologia[0], n);
        for(String elemento: lista){
            System.out.print("'"+elemento+"'" + ", ");
        }
    }

    public static void llenarSopa(ArrayList<Character> sopa) {

    }

    public static ArrayList<String> seleccionarPalabras(String[] listica, int n){
        ArrayList<String> lista = new ArrayList<>();
        for(int i = 0; i < listica.length; i++){
            if(listica[i].length() == n){
                lista.add(listica[i].toUpperCase());
            }
        }
        return lista;
    }
}
