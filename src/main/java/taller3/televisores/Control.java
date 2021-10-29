package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazar(TV tv) {
		this.tv = tv;
		this.tv.control = this; 
	}
	
	public TV getTv() {
		return tv;
	} 
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public void canalUp() {
		if (tv.estado == false || tv.canal==120 ) {
			return;
		}
		else {
			 tv.canal ++;
				
			}
		}
	public void canalDown() {
		if (tv.estado == false || tv.canal==1) {
			return;
		}
		else {
			tv.canal --;
		}
		
	}
	
	public void volumenUp() {
		if ( tv.volumen == 7 || tv.estado == false) {
			return;
		}
		else {
			tv.volumen ++;
		}
	}
	
	public void volumenDown() {
		if ( tv.volumen == 0 || tv.estado == false) {
			return;
		}
		else {
			tv.volumen --;
		}
	}
	
	public void setCanal(int canal) {
		if (tv.estado == true) {
			if (canal>=1 && canal<=120) {
				this.tv.canal = canal;
	}
		}
}
	public void turnOn() {
		tv.estado = true;
	}
	public void turnOff() {
		tv.estado = false;
	}
}
