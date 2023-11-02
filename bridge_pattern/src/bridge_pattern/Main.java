package bridge_pattern;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		DispositivoCasa smartTV = new SmartTV();
        DispositivoControl smartphoneControl = new SmartphoneControl(smartTV);
        DispositivoControl googleHomeControl = new GoogleHomeControl(smartTV);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CasaUI smartphoneUI = new CasaUI(smartphoneControl);
                smartphoneUI.setVisible(true);

                CasaUI googleHomeUI = new CasaUI(googleHomeControl);
                googleHomeUI.setVisible(true);
            }
        });
    }

}
