/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author PERSONAL
 */
public class Ejercicio01 {
    public static void main(String[] args) {

        String mensajeFinal = "";
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;
        int total4 = 0;

        // Ciclo for o para, que va disminuyendo,empieza en 30, termina en 10
        //y va restando de 1 en 1
       
        for (int i = 30; i >= 10; i--) {
            
            int valor1 = i;
            int valor2 = i * 2;
            int valor3 = i * 3;
            int valor4 = i * 4;

            mensajeFinal = String.format("%s%d-%d-%d-%d\n", 
                    mensajeFinal, valor1, valor2, valor3, valor4);

            // Sumamos las variables total mas los valores que se van acumulando
            total1 = total1 + valor1;
            total2 = total2 + valor2;
            total3 = total3 + valor3;
            total4 = total4 + valor4;
        }

      
        mensajeFinal = String.format("%sTotales = %d-%d-%d-%d\n", 
                mensajeFinal, total1, total2, total3, total4);

        System.out.printf("%s", mensajeFinal);
    }
}
     
    

