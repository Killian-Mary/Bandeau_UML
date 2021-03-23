package effect;

import java.util.ArrayList;

public class Scenario {

	private ArrayList<Effect> effects;
	
	public Scenario() {
		this.effects = new ArrayList<Effect>();
		
	}
	
	public void addEffect(Effect e) {
		
		this.effects.add(e);
		System.out.println("Effet ajouté");
	}
	
	public void playOn(Bandeau b) {
	}
}
