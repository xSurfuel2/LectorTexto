package org.example;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class LectorTexto {
    public static void main(String[] args)
    {
        try (InputStream is = LectorTexto.class.getResourceAsStream("/entrada.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            if (is == null) {
                System.err.println("Error: No se pudo encontrar 'entrada.txt' en los recursos.");
                return;
            }

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo.");
        }
    }
}
