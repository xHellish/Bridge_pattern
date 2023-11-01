package bridge_pattern;

public class SmartphoneControl extends DispositivoControl{
	
	public SmartphoneControl(DispositivoCasa dispositivoCasa) {
        super(dispositivoCasa);
    }
	
	@Override
    public void controlarDispositivoCasa() {
        System.out.println("Control desde un smartphone:");
        dispositivoCasa.mostrarFotos();
        dispositivoCasa.cambiarVolumen(50);
        dispositivoCasa.ajustarTamañoFoto();
    }

}
