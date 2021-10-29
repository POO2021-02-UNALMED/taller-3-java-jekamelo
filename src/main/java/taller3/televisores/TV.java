package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV;
	
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		TV.numTV ++;
	}
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;

	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if (estado==true) {
			if (canal>=1 && canal<=120) {
				this.canal = canal;
		}
	}
	}		
	static public int getNumTV() {
		return TV.numTV;
	}
	
	static public void setNumTV(int numtv) {
		numTV = numtv;
	}
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if (estado == false || canal==120 ) {
			return;
		}
		else {
			 canal ++;
				
			}
		}
	public void canalDown() {
		if (estado == false || canal==1) {
			return;
		}
		else {
			canal --;
		}
		
	}
	
	public void volumenUp() {
		if ( volumen == 7 || estado == false) {
			return;
		}
		else {
			volumen ++;
		}
	}
	
	public void volumenDown() {
		if ( volumen == 0 || estado == false) {
			return;
		}
		else {
			volumen --;
		}
	}
	
	
	}
		
	
	
	
