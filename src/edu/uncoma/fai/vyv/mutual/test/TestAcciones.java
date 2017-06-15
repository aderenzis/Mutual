package edu.uncoma.fai.vyv.mutual.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.uncoma.fai.vyv.mutual.Mutual;



public class TestAcciones {

	Mutual mutual = new Mutual();
	
	@Test
	public void test() {
		
		//1		
		//Condiciones de creación
		assertTrue(mutual.getCredito()==400);
		assertTrue(mutual.getConsumo()==0);
		assertTrue(mutual.getTitulares()==0);
		assertTrue(mutual.getBeneficiarios()==0);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_GANANCIA);
		
		//2
		mutual.addTitular(Mutual.TITULAR_C);
		assertTrue(mutual.getCredito()==900);
		assertTrue(mutual.getTitulares()==1);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_GANANCIA);
		
		//3
		assertTrue(mutual.getTitulares()==1);
		
		//4
		assertTrue(mutual.getBeneficiarios()==0);
		
		//5
		assertTrue(mutual.getCredito()==900);
		
		//6
		assertTrue(mutual.getConsumo()==0);
		
		//7
		assertTrue(mutual.getEstado()==Mutual.ESTADO_GANANCIA);
		
		//8
		mutual.addBeneficiario(3);
		System.out.println("Acciones: El consumo es: "+mutual.getConsumo());
		assertTrue(mutual.getConsumo()==600);	
		assertTrue(mutual.getBeneficiarios()==3);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_GANANCIA);
		
		//9
		mutual.addBeneficiario(1);
		assertTrue(mutual.getConsumo()==800);
		System.out.println("El consumo es: "+mutual.getConsumo());
		assertTrue(mutual.getBeneficiarios()==4);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_BALANCEADO);
		System.out.println("El estado actual es: "+mutual.getEstadoStr());
		
		//10
		assertTrue(mutual.getTitulares()==1);
		
		//11
		assertTrue(mutual.getBeneficiarios()==4);
		
		//12
		assertTrue(mutual.getCredito()==900);
		
		//13
		assertTrue(mutual.getConsumo()==800);
		
		//14
		assertTrue(mutual.getEstado()==Mutual.ESTADO_BALANCEADO);
		System.out.println("El estado actual es: "+mutual.getEstadoStr());

		//15
		mutual.addBeneficiario(1);
		assertTrue(mutual.getConsumo()==1000);
		System.out.println("El consumo es: "+mutual.getConsumo());
		assertTrue(mutual.getBeneficiarios()==5);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_PASIVO);
		System.out.println("El estado actual es: "+mutual.getEstadoStr());
		
		//16
		assertTrue(mutual.getTitulares()==1);
		
		//17
		assertTrue(mutual.getBeneficiarios()==5);
		
		//18
		assertTrue(mutual.getCredito()==900);
		
		//19
		assertTrue(mutual.getConsumo()==1000);
		
		//20
		assertTrue(mutual.getEstado()==Mutual.ESTADO_PASIVO);
		System.out.println("El estado actual es: "+mutual.getEstadoStr());

		//21
		mutual.addTitular(Mutual.TITULAR_B);
		assertTrue(mutual.getCredito()==1300);
		assertTrue(mutual.getTitulares()==2);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_GANANCIA);
		
		//22
		System.out.println("El consumo es: "+mutual.getConsumo());
		mutual.deleteBeneficiario(1);
		assertTrue(mutual.getConsumo()==800);
		System.out.println("El consumo es: "+mutual.getConsumo());
		assertTrue(mutual.getBeneficiarios()==4);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_GANANCIA);
				
		//23
		mutual.deleteTitular(Mutual.TITULAR_B);
		assertTrue(mutual.getCredito()==900);
		assertTrue(mutual.getTitulares()==1);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_BALANCEADO);
		System.out.println("El estado actual es: "+mutual.getEstadoStr());
		
		//24
		mutual.addTitular(Mutual.TITULAR_A);
		assertTrue(mutual.getCredito()==1100);
		System.out.println("El credito actual es: "+mutual.getCredito());
		assertTrue(mutual.getTitulares()==2);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_GANANCIA);
		
		//25
		mutual.addBeneficiario(1);
		assertTrue(mutual.getConsumo()==1000);
		System.out.println("El consumo es: "+mutual.getConsumo());
		assertTrue(mutual.getBeneficiarios()==5);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_BALANCEADO);
		System.out.println("El estado actual es: "+mutual.getEstadoStr());
		
		//26
		System.out.println("El consumo es: "+mutual.getConsumo());
		mutual.deleteBeneficiario(1);
		assertTrue(mutual.getConsumo()==800);
		System.out.println("El consumo es: "+mutual.getConsumo());
		assertTrue(mutual.getBeneficiarios()==4);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_GANANCIA);
					
		//27
		mutual.addBeneficiario(1);
		assertTrue(mutual.getConsumo()==1000);
		System.out.println("El consumo es: "+mutual.getConsumo());
		assertTrue(mutual.getBeneficiarios()==5);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_BALANCEADO);
		System.out.println("El estado actual es: "+mutual.getEstadoStr());
		
		//28
		System.out.println("El credito actual es: "+mutual.getCredito());
		mutual.deleteTitular(Mutual.TITULAR_A);
		System.out.println("El credito actual es: "+mutual.getCredito());
		assertTrue(mutual.getCredito()==900);
		assertTrue(mutual.getTitulares()==1);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_PASIVO);
		System.out.println("El estado actual es: "+mutual.getEstadoStr());
	
		//29
		System.out.println("El consumo es: "+mutual.getConsumo());
		mutual.deleteBeneficiario(1);
		assertTrue(mutual.getConsumo()==800);
		System.out.println("El consumo es: "+mutual.getConsumo());
		assertTrue(mutual.getBeneficiarios()==4);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_BALANCEADO);
		System.out.println("El estado actual es: "+mutual.getEstadoStr());
		
		//30
		mutual.addBeneficiario(1);
		assertTrue(mutual.getConsumo()==1000);
		System.out.println("El consumo es: "+mutual.getConsumo());
		assertTrue(mutual.getBeneficiarios()==5);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_PASIVO);
		System.out.println("El estado actual es: "+mutual.getEstadoStr());
		
		//31
		mutual.addBeneficiario(1);
		assertTrue(mutual.getConsumo()==1200);
		System.out.println("El consumo es: "+mutual.getConsumo());
		assertTrue(mutual.getBeneficiarios()==6);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_PERDIDA);
		System.out.println("El estado actual es: "+mutual.getEstadoStr());
		
		//32
		mutual.addBeneficiario(1);
		assertTrue(mutual.getConsumo()==1400);
		System.out.println("El consumo es: "+mutual.getConsumo());
		assertTrue(mutual.getBeneficiarios()==7);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_PERDIDA);
		System.out.println("El estado actual es: "+mutual.getEstadoStr());
		
		//33
		mutual.addTitular(Mutual.TITULAR_B);
		assertTrue(mutual.getCredito()==1300);
		assertTrue(mutual.getTitulares()==2);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_PASIVO);
		System.out.println("El estado actual es: "+mutual.getEstadoStr());

		
		//34
		System.out.println("El credito actual es: "+mutual.getCredito());
		mutual.deleteTitular(Mutual.TITULAR_B);
		System.out.println("El credito actual es: "+mutual.getCredito());
		assertTrue(mutual.getCredito()==900);
		assertTrue(mutual.getTitulares()==1);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_PERDIDA);
		System.out.println("El estado actual es: "+mutual.getEstadoStr());
			
		//35
		mutual.addTitular(Mutual.TITULAR_A);
		assertTrue(mutual.getCredito()==1100);
		System.out.println("El credito actual es: "+mutual.getCredito());
		assertTrue(mutual.getTitulares()==2);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_PERDIDA);
		System.out.println("El estado actual es: "+mutual.getEstadoStr());
				
		
		//36
		mutual.deleteTitular(Mutual.TITULAR_A);
		assertTrue(mutual.getCredito()==900);
		assertTrue(mutual.getTitulares()==1);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_PERDIDA);
		System.out.println("El estado actual es: "+mutual.getEstadoStr());
				
		
		//37
		System.out.println("El consumo es: "+mutual.getConsumo());
		mutual.deleteBeneficiario(1);
		assertTrue(mutual.getConsumo()==1200);
		System.out.println("El consumo es: "+mutual.getConsumo());
		assertTrue(mutual.getBeneficiarios()==6);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_PERDIDA);
		System.out.println("El estado actual es: "+mutual.getEstadoStr());
				
				
		
		//38
		assertTrue(mutual.getTitulares()==1);
		
		//39
		assertTrue(mutual.getBeneficiarios()==6);
		
		//40
		assertTrue(mutual.getCredito()==900);
		
		//41
		assertTrue(mutual.getConsumo()==1200);
		System.out.println("El consumo es: "+mutual.getConsumo());

		//42
		assertTrue(mutual.getEstado()==Mutual.ESTADO_PERDIDA);
		System.out.println("El estado actual es: "+mutual.getEstadoStr());

	}
}
