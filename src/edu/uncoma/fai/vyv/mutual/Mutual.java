package edu.uncoma.fai.vyv.mutual;

public class Mutual {
	
	
	private double credito;
	private double consumo;
	private int estado;
	
	private int titulares;
	private int beneficiarios;
	
	public static int ESTADO_BALANCEADO=0;
	public static int ESTADO_PERDIDA=1;
	public static int ESTADO_PASIVO=2;
	public static int ESTADO_GANANCIA=3;
	
	public static int TITULAR_A=0;
	public static int TITULAR_B=1;
	public static int TITULAR_C=2;
	
	
	private static final double CONSUMO_BENEFICIARIO = 200;
	private static double MONTO_A=200;
	private static double MONTO_B=400;
	private static double MONTO_C=500;

	
	
	
	public Mutual() {
		this.credito=400;
		this.consumo=0;
		this.beneficiarios=0;
		this.titulares=0;
		this.estado=ESTADO_GANANCIA;
	}	
		
	public double getCredito() {
		return credito;
	}
	
	public double getConsumo() {
		return consumo;
	}
	

	public String getEstadoStr() {
		if(this.estado==ESTADO_PERDIDA)
			return "Perdida";
		if(this.estado==ESTADO_PASIVO)
			return "Pasivo";
		if(this.estado==ESTADO_BALANCEADO)
			return "Balanceado";
		if(this.estado==ESTADO_GANANCIA)
			return "Ganancia";
		else
			return "Sin estado";
	}

	public void addTitular(int categoria){
		if(categoria==TITULAR_A){
			this.credito=credito+MONTO_A;
		}
		else if(categoria==TITULAR_B){
			this.credito=credito+MONTO_B;
		}else if(categoria==TITULAR_C){
			this.credito=credito+MONTO_C;
		}
		this.titulares++;
		calcularEstado();
	}
	
	public void deleteTitular(int categoria){
		if(titulares>0){
			if(categoria==TITULAR_A){
				this.credito=credito-MONTO_A;
			}
			else if(categoria==TITULAR_B){
				this.credito=credito-MONTO_B;
			}else if(categoria==TITULAR_C){
				this.credito=credito-MONTO_C;
			}
			this.titulares--;
			calcularEstado();
		}
		else{
			System.out.println("No hay titulares para eliminar.");
		}
	}
	
	public void addBeneficiario(int cantidad){
		if(cantidad>0){
			if(this.estado!=ESTADO_PERDIDA){
				if(cantidad<=3){
					this.consumo=this.consumo+cantidad*CONSUMO_BENEFICIARIO;
					this.beneficiarios=this.beneficiarios+cantidad;
					calcularEstado();
				}
				else{
					System.out.println("La cantidad debe ser <= a 3");
				}
			}
			else{
				System.out.println("Imposible agregar beneficiario: estado perdida");
			}
		}
		else{
			System.out.println("La cantidad debe ser mayor a 0");
		}
	}
		
	public void deleteBeneficiario(int cantidad){
		if(cantidad>0){
			if(cantidad<=3){
				if(this.beneficiarios>=cantidad){
					this.consumo=this.consumo-cantidad*CONSUMO_BENEFICIARIO;
					this.beneficiarios=this.beneficiarios-cantidad;
					calcularEstado();
				}
				else{
					System.out.println("La cantidad ingresada es mayor a la cantidad de beneficiarios.");
				}
			}
			else{
				System.out.println("La cantidad debe ser <= a 3");
			}
		}
		else{
			System.out.println("La cantidad debe ser mayor a 0");
		}
	}


	
	private void calcularEstado() {
		double porcentajeConsumo = this.consumo*100/this.credito;
		double diferenciaPorcentual= 100-porcentajeConsumo;
		if(diferenciaPorcentual>20){
			this.estado=ESTADO_GANANCIA;
		}
		else if(diferenciaPorcentual<=20 && diferenciaPorcentual>=0){
			this.estado=ESTADO_BALANCEADO;
		}
		else if(diferenciaPorcentual<0 && diferenciaPorcentual>=-20){
			this.estado=ESTADO_PASIVO;
		}
		else if(diferenciaPorcentual<-20){
			this.estado=ESTADO_PERDIDA;		
		}
	}

	public int getTitulares() {
		return titulares;
	}


	public int getBeneficiarios() {
		return beneficiarios;
	}
	
	public int getEstado() {
		return estado;
	}
	


	
	
	

}
