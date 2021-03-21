package exemple;

import bandeau.Bandeau;

public class RotateEffect implements Effect {

	@Override
	public void playOn(Bandeau b) {
		
		for (int i = 0; i <= 100; i++) {
          b.setRotation(2 * Math.PI * i / 100);
          b.sleep(10);
      }
	}

}
