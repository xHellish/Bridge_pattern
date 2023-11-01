package bridge_pattern;

public class GoogleHomeControl extends DispositivoControl{
	
	public GoogleHomeControl(DispositivoCasa dispositivoCasa) {
        super(dispositivoCasa);
    }

    @Override
    public void controlarDispositivoCasa() {
        System.out.println("Control desde Google Home:");
        dispositivoCasa.mostrarFotos();
        dispositivoCasa.cambiarVolumen(40);
        dispositivoCasa.ajustarTamañoFoto();
    }

}
