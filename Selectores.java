/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectores;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Selectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // definicion de objetos y variables
        Scanner objread=new Scanner(System.in);
        DecimalFormat formato=new DecimalFormat("#.##");
        int n,nro_personas=0;
        float valor_persona,valor_total;
        String cod,ciudad;
        System.out.println("digite cantidad de registros");
        n=objread.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("¿cual es el codigo del viaje? ");
            cod=objread.next();
            System.out.println("¿cuantas personas viajan? ");
            nro_personas = objread.nextInt();
            System.out.println("¿cual es la ciudad destino ? ");
            ciudad=objread.next();
            switch (ciudad){
                case "cartagena" : valor_persona=1200000;
                break;
                case "leticia" : valor_persona=2000000;
                break;
                case "cali" : valor_persona=8000000;
                break;
                case "bogota" : valor_persona=7000000;
                break;
                default:System.out.println(" opcion no valida ");
                 valor_persona=0;
                 break;
                
            } //fin caso
            valor_total= valor_persona * nro_personas;
            System.out.println("el valor total es " + formato.format  (valor_total));
            
            
        }//fin para
    }
    
}
