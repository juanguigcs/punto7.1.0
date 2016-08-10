/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7;

import java.util.Scanner;

/**
 *
 * @author El Memo
 */
public class Punto7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        basedatos c1 =new basedatos();
        Scanner lector= new Scanner(System.in);
        int contm1,contm2,contm3,contm4;
        double fecha;
        do{
            System.out.println("1.ingresar usuario");
            System.out.println("2. estadisticas ");
            System.out.println("3.salir");
            contm1=lector.nextInt();
            switch(contm1){
                case 1:
                    do{
                        System.out.println("ingrese fecha");
                        fecha=lector.nextDouble();
                    }while((fecha-2016)>=0);
                    c1.setAño((2016-fecha)+c1.getAño());
                    c1.setCont(c1.getCont()+1);  
                    do{
                        System.out.println("1.Masculino");
                        System.out.println("2.Femenino");
                        contm2=lector.nextInt();
                        switch(contm2){
                            case 1: 
                                    c1.setMasc(c1.getMasc()+1);
                                    break;
                            case 2:
                                    c1.setFem(c1.getFem()+1);
                                    break;
                            case 3:
                                break;
                            default : System.out.println("Número incorrecto");
                                break;
                        }
                    }while(contm2>2);                       
                    do{
                        System.out.println("1.medellin");
                        System.out.println("2.otra ciudad");
                        contm3=lector.nextInt();
                        switch(contm3){
                            case 1: 
                                    c1.setMed(c1.getMed()+1);
                                    break;
                            case 2:
                                    c1.setOcity(c1.getOcity()+1);
                                    break;
                            case 3: break;
                            default : System.out.println("Número incorrecto");
                                break;
                        }
                    }while(contm3>2);    
                break;
                case 2:
                    System.out.println("Las estadísticas son:"+" prom edad"+(c1.getAño()/c1.getCont())+"Mas"+c1.getMasc()+"fem"+c1.getFem()+"meda"+c1.getMed()+"otra"+c1.getOcity());
                    break;
                    case 3: break;
                    
                default : System.out.println("Número incorrecto");
                    break;
            }
            
        }while(contm1!=3);
    }
    
}
