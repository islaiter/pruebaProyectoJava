package paquetePrueba;
public class NumeroEntero {

	/* Dejamos todo preparado por si queremos añadir soporte para numeros decimales
	 pero como es una clase simple de prueba, implementamos numeros enteros simples */
	
	// Prueba smee.io
	// Prueba smee.io 200 OK 17/01/2021 21.02 GMT+1
	// Otra prueba
	
	// Prueba ngrok2
	// Prueba ngrok3
	// Prueba ngrok4
	
	
	
	public Integer parteEntera;
	
	// Constructor vacio

	public NumeroEntero(){

	} 
	
	// Constructor por parametros, si tuviese parte decimal tendriamos que incluirlo

	public NumeroEntero(Integer parteEntera){
		this.parteEntera=parteEntera;
	}

	public Integer getParteEntera() {
		return parteEntera;
	}

	public void setParteEntera(Integer parteEntera) {
		this.parteEntera = parteEntera;
	}

	
	public NumeroEntero sumarNumerosEnteros (NumeroEntero entero1, NumeroEntero entero2){
		NumeroEntero result = new NumeroEntero();
		result.setParteEntera(entero1.getParteEntera()+entero2.getParteEntera());
		return result;
	}

	public NumeroEntero restarNumerosEnteros (NumeroEntero entero1, NumeroEntero entero2){
		NumeroEntero result = new NumeroEntero();
		result.setParteEntera(entero1.getParteEntera()-entero2.getParteEntera());
		return result;
	}


	public NumeroEntero multiplicarNumerosEnteros (NumeroEntero entero1, NumeroEntero entero2){
		NumeroEntero result = new NumeroEntero();
		result.setParteEntera(entero1.getParteEntera()*entero2.getParteEntera());
		return result;
	}

	public NumeroEntero dividirNumerosEnteros (NumeroEntero entero1, NumeroEntero entero2){
		NumeroEntero result = new NumeroEntero();
		if (entero1.getParteEntera()==0 || entero2.getParteEntera()==0){
			System.out.println("No se puede dividir por 0");
		} else {
		result.setParteEntera(entero1.getParteEntera()/entero2.getParteEntera());
			
		}
		return result;
	}
	
    //casos de prueba para JUnit
	
	public boolean esMayorACero(Integer numero){
		if(numero>0)
			return true;
			else
				return false;
	}

}

