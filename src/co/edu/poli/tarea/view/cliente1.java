package co.edu.poli.tarea.view;
import co.edu.poli.tarea.model.*;
import java.util.*;
public class cliente1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		System.out.println("elige 1: crear.  2: modificar.    3: leer");
		int opcion = sc.nextInt();
		
		ConsumoEnergia.valorkwhAplicado = 454.45;
		ConsumoEnergia.generarNumeroFactura();
		int[] historial = {100, 150, 200, 180, 250};
		ConsumoEnergia consumo = new ConsumoEnergia("agosto", 30, 3, 32.3, 5.5, 70, historial);
		//System.out.println(consumo.valorkwhAplicado);
		 //System.out.println(consumo);
		 Cliente cliente1 = new Cliente("brayan melo", "cl 43 sur ", "bogota", "bosa", "3102021203", 2312);
		 
		  //int promedioConsumo = consumo.calcularPromedioConsumo(historial);
		  //System.out.println("El promedio de consumo es: " + promedioConsumo + " Kwh");
		
		Electrodomestico nevera = new Electrodomestico(4356453, "LG Guardacomida", 23.6);
		Electrodomestico lavadora = new Electrodomestico(343546, "Acce lavaropa", 35.5);
		Electrodomestico computador = new Electrodomestico(12456, "PCMASTERACE",50.5);
		Electrodomestico [] electrodomestico = new Electrodomestico [3];  
		electrodomestico [0] = nevera;
		electrodomestico [1] = lavadora;
		electrodomestico [2] = computador;
		Factura datosFactura1 = new Factura(213321, "21agosto",cliente1 , 213213, 312312, "21083", "32155",consumo, electrodomestico);
		Factura datosFactura2 = new Factura(213322, "21agosto",cliente1 , 213213, 312312, "21083", "32155", consumo, electrodomestico);
		Factura datosFactura3 = new Factura(213323, "21agosto",cliente1 , 213213, 312312, "21083", "32155", consumo, electrodomestico);
		Factura datosFactura4 = new Factura(213324, "21agosto",cliente1 , 213213, 312312, "21083", "32155", consumo, electrodomestico);
		Factura datosFactura5 = new Factura(213325, "21agosto",cliente1 , 213213, 312312, "21083", "32155", consumo, electrodomestico);
		FacturaGeneral[] facturas = new Factura [5];
		facturas [0] = datosFactura1;
		facturas [1] = datosFactura2;		
		facturas [2] = datosFactura3;
		facturas [3] = datosFactura4;
		facturas [4] = datosFactura5;
		String path = "";
        String file = "my3.txt";
        String s = "";
		OperacionFile op = new OperacionFile();
	    op.createFile(path, file);
	/*	



	    for (int i = 0; i < facturas.length; i++) {
	            if (!(facturas[i]==null))
	                s+=facturas[i].toString()+"\n";
	        }
	        op.writeFile(path, file, s);
	        System.out.println(op.readFile(path, file));
	*/
	        path = "";
	        file = "my2.txt";			
	       if (opcion == 1) {
		        op.serializar(facturas, path, file);
	       }
	       else if (opcion == 2) {
	    	   facturas = op.deserializar(path, file);
	    	   Accion accion1 = new Accion(facturas);
		        System.out.println("*** Array Facturas ***");
				accion1.setFacturas(facturas);
				accion1.create(datosFactura1);
				accion1.read(213321);
				accion1.delete(213322);
				accion1.update(datosFactura2, 213321);
		        op.serializar(facturas, path, file);
				System.out.println(accion1.readall());
	       }
	       else {
	    	   facturas = op.deserializar(path, file);
		        System.out.println("Leyendo archivo:");
	    	    for (int i = 0; i < facturas.length; i++) {
		            System.out.println(facturas[i]);    
		        }
	    	   
	       }

	        //Save data each object 
	        
	    
	        

	       
	        
	    
	    	


		FacturaAgua factura1 = new FacturaAgua(213123, "232 242", cliente1, 1323, 34343, "023142", "023042", 213232);
	//	System.out.println(factura1);
		//System.out.println(accion1.read(213325));
		//System.out.println("el consumo total de es: "+ datosFactura.calcularConsumo());
		//System.out.println(datosFactura);
		//System.out.println(datosFactura.calcularConsumo(20, 60));
	
		//double[] kwhConsumidoTotal = { nevera.getKwhConsumido(), lavadora.getKwhConsumido(), computador.getKwhConsumido()};
		//double Electrodomestico[] = {nevera.getKwhConsumido() + lavadora.getKwhConsumido() + computador.getKwhConsumido()};
		//double consumoTotal = Electrodomestico.calcularConsumo(Electrodomestico);

        //System.out.println("El consumo total es: " + consumoTotal + " Kwh");
		
		//double consumoTotal = nevera.calcularConsumo(kwhConsumidoTotal);

		//System.out.println(nevera);
		//System.out.println(lavadora);
		//System.out.println(computador);
		
		
		double subsidio = datosFactura1.calcularSubsidio(3);
	//	System.out.println("el subsidio corresponedio es: " + subsidio);
		  Iterativo iterativo = new Iterativo();
	        double resultado = iterativo.serieMclaurin(2);
	      //System.out.println(resultado);
	       
	  RecursionCola recursion = new RecursionCola();
	  double resul = recursion.calcularFactorial(2);
	  //System.out.println(resul);
	  
	  Recursivo recursivo = new Recursivo();
	  double resultado2 = recursivo.serieMclaurin(2);
	 // System.out.println(resultado2);
	
	}
	}


