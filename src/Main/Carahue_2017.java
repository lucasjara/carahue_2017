package Main;

import java.awt.Dimension;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import vista.Marco;

public class Carahue_2017 {
    
    public static void main(String[] args) {
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            Marco m = new Marco();
            m.setSize(1366, 750);
            m.setVisible(true);
        } catch (Exception e) {
            
        }
    }
    
}
