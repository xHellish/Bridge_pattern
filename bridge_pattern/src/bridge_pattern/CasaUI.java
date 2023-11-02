package bridge_pattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CasaUI extends JFrame {

    private DispositivoControl dispositivoControl;

    public CasaUI(DispositivoControl dispositivoControl) {
        this.dispositivoControl = dispositivoControl;

        setTitle("Control de Casa - Mover ventana");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton controlButton = new JButton("Controlar Dispositivo de Casa");
        controlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispositivoControl.controlarDispositivoCasa();
            }
        });

        add(controlButton);
    }
    
    
    
}

