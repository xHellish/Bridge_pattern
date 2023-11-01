package bridge_pattern;

public class Main {

	public static void main(String[] args) {
        // Crear instancias de dispositivos de control y dispositivos de casa
        DispositivoCasa smartTV = new SmartTV();
        DispositivoControl smartphoneControl = new SmartphoneControl(smartTV);
        DispositivoControl googleHomeControl = new GoogleHomeControl(smartTV);

        // Controlar los dispositivos de la casa desde los dispositivos de control
        smartphoneControl.controlarDispositivoCasa();
        googleHomeControl.controlarDispositivoCasa();
    }

}
