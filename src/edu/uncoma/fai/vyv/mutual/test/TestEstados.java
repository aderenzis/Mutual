package edu.uncoma.fai.vyv.mutual.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.uncoma.fai.vyv.mutual.Mutual;

public class TestEstados {

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
		mutual.addBeneficiario(1);
		System.out.println("Estados: El consumo es: "+mutual.getConsumo());
		assertTrue(mutual.getConsumo()==200); 		
		assertTrue(mutual.getBeneficiarios()==1);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_GANANCIA);
		
		//4
		mutual.addBeneficiario(3);
		assertTrue(mutual.getConsumo()==800); 
		assertTrue(mutual.getBeneficiarios()==4);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_BALANCEADO); 
		
		//5
		mutual.addBeneficiario(1);
		assertTrue(mutual.getConsumo()==1000); 
		assertTrue(mutual.getBeneficiarios()==5);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_PASIVO);

		
		//6
		mutual.addBeneficiario(1);
		assertTrue(mutual.getConsumo()==1200); 
		System.out.println("El consumo es: "+mutual.getConsumo());
		assertTrue(mutual.getBeneficiarios()==6);
		assertTrue(mutual.getEstado()==Mutual.ESTADO_PERDIDA);
		System.out.println("Estado actual: "+mutual.getEstadoStr());

		
	}

}
