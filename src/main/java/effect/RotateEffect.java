package effect;

import bandeau.Bandeau;

public class RotateEffect implements Effect {

	private int speed; // plus speed est petit, plus la rotation sera rapide et fluide
	
	public RotateEffect(int speed) {
		this.speed = speed;
	}
	
	@Override
	public void playOn(Bandeau b) {
		
		for (int i = 0; i <= 100; i++) {
          b.setRotation(2 * Math.PI * i / 100);
          b.sleep(speed);
      }
	}

}
