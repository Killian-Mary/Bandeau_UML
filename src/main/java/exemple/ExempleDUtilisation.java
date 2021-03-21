package exemple;

import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {

    public static void main(String[] args) {
        new ExempleDUtilisation().exemple();
    }

    public void exemple() {
    	Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
        
        // set "de base"
        monBandeau.setBackground(Color.BLACK);
        monBandeau.setForeground(Color.white);
        monBandeau.setFont(new Font("ITC Garamond", Font.PLAIN, 50));

        // Ajout des effets
        ZoomEffect ze = new ZoomEffect(12);
        LetterByLetterEffect LbLE = new LetterByLetterEffect("Introducing the new iPhone12");
        RotateEffect re = new RotateEffect();
        
        // Scénario
        LbLE.playOn(monBandeau);
        ze.playOn(monBandeau);
        re.playOn(monBandeau);
        
        monBandeau.sleep(1000);
       
        monBandeau.sleep(3000);
        monBandeau.close();
    }
    
    public void upperLetterByLeter(String s, Bandeau b) {
    	
    }
}
