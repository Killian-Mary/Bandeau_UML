package exemple;

import bandeau.Bandeau;

public class LetterByLetterEffect implements Effect {
	
	private String phrase;
	
	public LetterByLetterEffect(String phrase) {
		this.phrase = phrase;
	}
	@Override
	public void playOn(Bandeau b) {
		char c;
    	String message = "";
        for(int i=0; i< this.phrase.length(); i++){
            c= phrase.charAt(i);
            message = message + c;
            b.setMessage(message);

            try{
                Thread.sleep(100);
            }catch(Exception e){}
        } 
		
	}

	
}
