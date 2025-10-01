 package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorTexto
{
    public static void main(String[] args)
    {
        String ruta = "src/main/resources/entrada.txt"; // Ruta relativa al proyecto
        try (BufferedReader br = new BufferedReader(new FileReader(ruta)))
        {
            String linea;
            while ((linea = br.readLine()) != null)
            {
                System.out.println(linea);
            }
        } catch (IOException e)
        {
            System.err.println("Error al leer el archivo.");
        }
    }
}
