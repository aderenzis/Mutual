package edu.uncoma.fai.vyv.mutual.test;

import static org.junit.Assert.*;

import org.junit.Test;


import edu.uncoma.fai.vyv.mutual.Mutual;


public class TestTransiciones extends Mutual {

	Mutual m=new Mutual();
	

	@Test
	public void test() {
		
		//condiciones de creación
		  assertTrue(400==m.getCredito()); 
	      assertTrue(0==m.getConsumo()); 
	      assertTrue(0==m.getBeneficiarios()); 
	      assertTrue(0==m.getTitulares()); 
	      assertTrue(Mutual.ESTADO_GANANCIA==m.getEstado());
	      
	      
	      m.addTitular(2);
	      assertTrue(900==m.getCredito()); 
	      assertTrue(1==m.getTitulares());
	      assertTrue(Mutual.ESTADO_GANANCIA==m.getEstado());
	      
	      
	      m.addBeneficiario(1);
	      System.out.println("Transiciones: El consumo es: "+m.getConsumo());
	      assertTrue(200==m.getConsumo()); 
	      assertTrue(1==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_GANANCIA==m.getEstado());
	      
	      
	      
	      m.deleteBeneficiario(1);
	      assertTrue(0==m.getConsumo()); 
	      assertTrue(0==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_GANANCIA==m.getEstado());
	     
	      
	      
	      m.deleteTitular(2);
	      assertTrue(400==m.getCredito()); 
	      assertTrue(0==m.getTitulares());
	      assertTrue(Mutual.ESTADO_GANANCIA==m.getEstado());
	      
	      
	      assertTrue(0==m.getTitulares());
	      assertTrue(0==m.getBeneficiarios());
	      assertTrue(400==m.getCredito());
	      assertTrue(0==m.getConsumo());
	      assertTrue(Mutual.ESTADO_GANANCIA==m.getEstado());
	      
	      
	      
	      m.addBeneficiario(2);
	      System.out.println(m.getConsumo());
	      assertTrue(400==m.getConsumo()); 
	      assertTrue(2==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_BALANCEADO==m.getEstado());
	      
	      
 
	      m.addTitular(1);
	      assertTrue(800==m.getCredito()); 
	      assertTrue(1==m.getTitulares());
	      assertTrue(Mutual.ESTADO_GANANCIA==m.getEstado());
	      
	      
	      m.deleteTitular(1);
	      assertTrue(400==m.getCredito()); 
	      assertTrue(0==m.getTitulares());
	      assertTrue(Mutual.ESTADO_BALANCEADO==m.getEstado());
	      
	      
	      
	      m.deleteBeneficiario(1);
	      assertTrue(200==m.getConsumo()); 
	      assertTrue(1==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_GANANCIA==m.getEstado());
	     
	      

	      m.addTitular(2);
	      assertTrue(900==m.getCredito()); 
	      assertTrue(1==m.getTitulares());
	      assertTrue(Mutual.ESTADO_GANANCIA==m.getEstado());
	      
	      
	      m.addBeneficiario(1);
	      System.out.println(m.getConsumo());
	      assertTrue(400==m.getConsumo()); 
	      assertTrue(2==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_BALANCEADO==m.getEstado());
	      
	      
	      
	      m.addTitular(0);
	      assertTrue(1100==m.getCredito()); 
	      assertTrue(2==m.getTitulares());
	      assertTrue(Mutual.ESTADO_GANANCIA==m.getEstado());
	      
	      
	      m.addBeneficiario(3);
	      System.out.println(m.getConsumo());
	      assertTrue(1000==m.getConsumo()); 
	      assertTrue(5==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_BALANCEADO==m.getEstado());
	      
	      
	      m.addBeneficiario(1);
	      System.out.println(m.getConsumo());
	      assertTrue(1200==m.getConsumo()); 
	      assertTrue(6==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_PASIVO==m.getEstado());
	      
	      
	      m.deleteBeneficiario(1);
	      assertTrue(1000==m.getConsumo()); 
	      assertTrue(5==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_BALANCEADO==m.getEstado());
	     
	      

	      m.deleteTitular(0);
	      assertTrue(900==m.getCredito()); 
	      assertTrue(1==m.getTitulares());
	      assertTrue(Mutual.ESTADO_PASIVO==m.getEstado());
	      
	      
	      
	      m.addTitular(0);
	      assertTrue(1100==m.getCredito()); 
	      assertTrue(2==m.getTitulares());
	      assertTrue(Mutual.ESTADO_BALANCEADO==m.getEstado());
	      
	      
	      assertTrue(2==m.getTitulares());
	      assertTrue(5==m.getBeneficiarios());
	      assertTrue(1100==m.getCredito());
	      assertTrue(1000==m.getConsumo());
	      assertTrue(Mutual.ESTADO_BALANCEADO==m.getEstado());
	      
	      m.addBeneficiario(1);
	      System.out.println(m.getConsumo());
	      assertTrue(1200==m.getConsumo()); 
	      assertTrue(6==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_PASIVO==m.getEstado());
	      
	      
	      m.addTitular(2);
	      assertTrue(1600==m.getCredito()); 
	      assertTrue(3==m.getTitulares());
	      assertTrue(Mutual.ESTADO_GANANCIA==m.getEstado());
	      
	      
	      m.addBeneficiario(1);
	      System.out.println(m.getConsumo());
	      assertTrue(1400==m.getConsumo()); 
	      assertTrue(7==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_BALANCEADO==m.getEstado());
	      
	      m.addBeneficiario(1);
	      System.out.println(m.getConsumo());
	      assertTrue(1600==m.getConsumo()); 
	      assertTrue(8==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_BALANCEADO==m.getEstado());
	      
	      
	      m.deleteBeneficiario(1);
	      assertTrue(1400==m.getConsumo()); 
	      assertTrue(7==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_BALANCEADO==m.getEstado());
	     
	      
	      m.deleteTitular(0);
	      assertTrue(1400==m.getCredito()); 
	      assertTrue(2==m.getTitulares());
	      assertTrue(Mutual.ESTADO_BALANCEADO==m.getEstado());
	      
	      
	      m.addTitular(0);
	      assertTrue(1600==m.getCredito()); 
	      assertTrue(3==m.getTitulares());
	      assertTrue(Mutual.ESTADO_BALANCEADO==m.getEstado());
	      
	      
	      m.addBeneficiario(2);
	      System.out.println(m.getConsumo());
	      assertTrue(1800==m.getConsumo()); 
	      assertTrue(9==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_PASIVO==m.getEstado());
	      
	      
	      m.deleteBeneficiario(3);
	      assertTrue(1200==m.getConsumo()); 
	      assertTrue(6==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_GANANCIA==m.getEstado());
	     
	      
	      
	      m.addTitular(1);
	      assertTrue(2000==m.getCredito()); 
	      assertTrue(4==m.getTitulares());
	      assertTrue(Mutual.ESTADO_GANANCIA==m.getEstado());
	      
	      
	      m.addTitular(0);
	      assertTrue(2200==m.getCredito()); 
	      assertTrue(5==m.getTitulares());
	      assertTrue(Mutual.ESTADO_BALANCEADO==m.getEstado());
	      
	      
	      m.addBeneficiario(3);
	      System.out.println(m.getConsumo());
	      assertTrue(1800==m.getConsumo()); 
	      assertTrue(9==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_BALANCEADO==m.getEstado());
	      
	      
	      m.addBeneficiario(2);
	      System.out.println(m.getConsumo());
	      assertTrue(2200==m.getConsumo()); 
	      assertTrue(11==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_BALANCEADO==m.getEstado());
	      
	      m.addBeneficiario(1);
	      System.out.println(m.getConsumo());
	      assertTrue(2400==m.getConsumo()); 
	      assertTrue(12==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_PASIVO==m.getEstado());
	      
	      
	      m.deleteTitular(0);
	      assertTrue(2000==m.getCredito()); 
	      assertTrue(4==m.getTitulares());
	      assertTrue(Mutual.ESTADO_PASIVO==m.getEstado());
	      
	      
	      m.addTitular(0);
	      assertTrue(2200==m.getCredito()); 
	      assertTrue(5==m.getTitulares());
	      assertTrue(Mutual.ESTADO_PASIVO==m.getEstado());
	      
	      
	      m.addBeneficiario(1);
	      System.out.println(m.getConsumo());
	      assertTrue(2600==m.getConsumo()); 
	      assertTrue(13==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_PASIVO==m.getEstado());
	      
	      m.deleteBeneficiario(1);
	      assertTrue(2400==m.getConsumo()); 
	      assertTrue(12==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_PASIVO==m.getEstado());
	     
	      
	      m.addBeneficiario(2);
	      System.out.println(m.getConsumo());
	      assertTrue(2800==m.getConsumo()); 
	      assertTrue(14==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_PERDIDA==m.getEstado());
	      
	      m.deleteBeneficiario(1);
	      assertTrue(2600==m.getConsumo()); 
	      assertTrue(13==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_PASIVO==m.getEstado());
	     
	      
	      m.deleteTitular(0);
	      assertTrue(2000==m.getCredito()); 
	      assertTrue(4==m.getTitulares());
	      assertTrue(Mutual.ESTADO_PERDIDA==m.getEstado());
	      
	      
	      m.addTitular(0);
	      assertTrue(2200==m.getCredito()); 
	      assertTrue(5==m.getTitulares());
	      assertTrue(Mutual.ESTADO_PASIVO==m.getEstado());
	      
	      
	      assertTrue(5==m.getTitulares());
	      assertTrue(13==m.getBeneficiarios());
	      assertTrue(2200==m.getCredito());
	      assertTrue(2600==m.getConsumo());
	      assertTrue(Mutual.ESTADO_PASIVO==m.getEstado());
	      
	      
	      m.addBeneficiario(1);
	      System.out.println(m.getConsumo());
	      assertTrue(2800==m.getConsumo()); 
	      assertTrue(14==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_PERDIDA==m.getEstado());
	      
	      
	      m.addBeneficiario(1);
	      System.out.println(m.getConsumo());
	      assertTrue(3000==m.getConsumo()); 
	      assertTrue(15==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_PERDIDA==m.getEstado());
	      
	      
	      m.addTitular(0);
	      assertTrue(2400==m.getCredito()); 
	      assertTrue(6==m.getTitulares());
	      assertTrue(Mutual.ESTADO_PERDIDA==m.getEstado());
	      
	      m.deleteTitular(0);
	      assertTrue(2200==m.getCredito()); 
	      assertTrue(5==m.getTitulares());
	      assertTrue(Mutual.ESTADO_PERDIDA==m.getEstado());
	      
	      
	      m.deleteBeneficiario(1);
	      assertTrue(2800==m.getConsumo()); 
	      assertTrue(14==m.getBeneficiarios()); 
	      assertTrue(Mutual.ESTADO_PERDIDA==m.getEstado());
	     
	      
	      assertTrue(5==m.getTitulares());
	      assertTrue(14==m.getBeneficiarios());
	      assertTrue(2200==m.getCredito());
	      assertTrue(2800==m.getConsumo());
	      assertTrue(Mutual.ESTADO_PERDIDA==m.getEstado());

	      
	}     
}
