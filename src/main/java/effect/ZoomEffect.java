package effect;

import java.awt.Font;

import bandeau.Bandeau;

public class ZoomEffect implements Effect{

	private int nbZooms;
	
	public ZoomEffect(int nbZooms) {
		this.nbZooms = nbZooms;
	}
	
	@Override
	public void playOn(Bandeau b) {
		b.setMessage("Zoom x12");
	       for (int i = 0; i < this.nbZooms; i ++) {
	    	   b.setFont(new Font(b.getFont().toString(), Font.BOLD, 50 + (10*i)));
	    	   b.sleep(100);
	       }
	}

}
