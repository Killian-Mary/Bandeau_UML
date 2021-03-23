package exemple;

import bandeau.Bandeau;
import effect.LetterByLetterEffect;
import effect.RotateEffect;
import effect.Scenario;
import effect.ZoomEffect;

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
        
        Scenario scenario = new Scenario();
        
        // Ajout des effets
        LetterByLetterEffect LbLE = new LetterByLetterEffect("Introducing the new iPhone12");
        ZoomEffect ze = new ZoomEffect(12);
        RotateEffect re = new RotateEffect(10);

        scenario.addEffect(LbLE);
        scenario.addEffect(re);
        scenario.addEffect(ze);
        
        scenario.playOn(monBandeau);
        
        monBandeau.sleep(1000);
       
        monBandeau.sleep(3000);
        monBandeau.close();
    }
    
}
