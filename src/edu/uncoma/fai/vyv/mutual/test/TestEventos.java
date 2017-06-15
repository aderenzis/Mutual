package edu.uncoma.fai.vyv.mutual.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.uncoma.fai.vyv.mutual.Mutual;


public class TestEventos extends Mutual {

	Mutual mutual=new Mutual();
	
	@Test
	public void test() {
		
		
		  //1
		  //Condiciones de creación 
	      assertTrue(400==mutual.getCredito()); 
	      assertTrue(0==mutual.getConsumo()); 
	      assertTrue(0==mutual.getBeneficiarios()); 
	      assertTrue(0==mutual.getTitulares()); 
	      assertTrue(Mutual.ESTADO_GANANCIA==mutual.getEstado());
	      
	      //2
	      mutual.addTitular(2);
	      assertTrue(900==mutual.getCredito()); 
	      assertTrue(1==mutual.getTitulares());
	      assertTrue(Mutual.ESTADO_GANANCIA==mutual.getEstado());
	      
	      //3
	      mutual.deleteTitular(2);
	      assertTrue(400==mutual.getCredito()); 
	      assertTrue(0==mutual.getTitulares());
	      assertTrue(Mutual.ESTADO_GANANCIA==mutual.getEstado());
	      
	      //4
	      mutual.addBeneficiario(1);
	      System.out.println("Eventos: El consumo es: "+mutual.getConsumo());
	      assertTrue(200==mutual.getConsumo()); 
	      assertTrue(1==mutual.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_GANANCIA==mutual.getEstado());
	      
	      //5
	      mutual.deleteBeneficiario(1);
	      assertTrue(0==mutual.getConsumo()); 
	      assertTrue(0==mutual.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_GANANCIA==mutual.getEstado());
	      
	      
	      //6
	      assertTrue(0==mutual.getTitulares());
	      //7
	      assertTrue(0==mutual.getBeneficiarios());
	      //8
	      assertTrue(400==mutual.getCredito());
	      //9
	      assertTrue(0==mutual.getConsumo());
	      //10
	      assertTrue(Mutual.ESTADO_GANANCIA==mutual.getEstado());
	      
	       
	}     
		
}
