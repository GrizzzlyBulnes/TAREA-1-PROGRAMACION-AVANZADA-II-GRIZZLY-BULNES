package hn.uth.tarea1_GrizzlyBulnes_maven;

import java.util.Scanner;

public class App {
	
private static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opc = 0;
        
        do {
            System.out.println("CALCULADORA DE AREAS");
            System.out.println("1. Calcular el area de un circulo");
            System.out.println("2. Calcular el area de un cuadrado");
            System.out.println("3. Calcular el area de un rectangulo");
            System.out.println("4. Calcular el area de un triangulo");
            System.out.println("5. Salir");
            System.out.println("___________________________________");
            System.out.println("Ingrese una opcion: ");
            opc = entrada.nextInt();
            
            switch (opc) {
                case 1:
                    double radioCirculo = LeerDecimales("Ingrese el radio del circulo: ");
                    Double AreaCirculo = AreaCirculo(radioCirculo);
                    if (AreaCirculo != null) {
                        System.out.println("El area del circulo es:" + AreaCirculo + "\n");
                    }
                    break;
                    
                case 2:
                    double ladoCuadrado = LeerDecimales("Ingrese el lado del cuadrado: ");
                    Double AreaCuadrado = AreaCuadrado(ladoCuadrado);
                    if (AreaCuadrado != null) {
                        System.out.println("El area del cuadrado es:" + AreaCuadrado + "\n");
                    }
                    break;
                    
                case 3:
                    double largoRectangulo = LeerDecimales("Ingrese el largo del rectangulo: ");
                    double anchoRectangulo = LeerDecimales("Ingrese el ancho del rectangulo: ");
                    Double AreaRectangulo = AreaRectangulo(largoRectangulo, anchoRectangulo);
                    if (AreaRectangulo != null) {
                        System.out.println("El area del rectangulo es:" + AreaRectangulo + "\n");
                    }
                    break;
                    
                case 4:
                    double baseTriangulo = LeerDecimales("Ingrese la base del triangulo: ");
                    double alturaTriangulo = LeerDecimales("Ingrese la altura del triangulo: ");
                    Double AreaTriangulo = AreaTriangulo(baseTriangulo, alturaTriangulo);
                    if (AreaTriangulo != null) {
                        System.out.println("El area del triangulo es:" + AreaTriangulo + "\n");
                    }
                    break;
                    
                case 5:
                    break;
                    
                default:
                    System.out.println("Ingrese una de las opciones del menu.");
                    break;
            } 
        } while (opc != 5);
    }
    
    public static Double LeerDecimales(String mensaje) {
        System.out.println(mensaje);
        return entrada.nextDouble();
    }
    
    public static Double AreaCirculo(double radio) {
        Double pi = Math.PI;
        Double resultado = null;
        
        if (radio > 0) {
            resultado = pi * (radio * radio);
        } else {
            System.err.println("El radio no puede ser negativo");
        }
        return resultado;
    }
    
    public static Double AreaCuadrado(double lado) {
        Double resultado = null;
        
        if (lado > 0) {
            resultado = lado * lado;
        } else {
            System.err.println("El lado no puede ser negativo");
        }
        return resultado;
    }
    
    public static Double AreaRectangulo(double largo, double ancho) {
        Double resultado = null;
        if (largo > 0 && ancho > 0) {
            resultado = largo * ancho;
        } else {
            System.err.println("Los datos no pueden ser negativos");
        }
        return resultado;
    }
    
    public static Double AreaTriangulo(double base, double altura) {
        Double resultado = null;
        
        if (base > 0 && altura > 0) {
            resultado = (base * altura / 2);
        } else {
            System.err.println("Los datos no pueden ser negativos");
        }
        return resultado;
    }
}
