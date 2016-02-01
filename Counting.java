/*
 *Counting.java
 *@author:Rich Mangan
 *Date: 21/11/2013
 *BSHC1B
 */
public class Counting{
	//variables
	private String sentence;
	private int spaces, vow, cons, letters;

	public Counting(){
		sentence = new String();
		spaces =0;
		letters =0;
		vow=0;
		}
	 public void setSentence(String sentence){
		this.sentence =sentence;
		}
	public void compute(){
		for(int i=0; i<sentence.length(); i++){
			if(sentence.charAt(i)==' '){
				spaces=spaces+1;
			}
		}//The || orerator won't work for me, so I did it with if statments
		 //and made an "else if" for the capital letters too.
		for(int j=0; j<sentence.length(); j=j+1){
			if(sentence.charAt(j)=='a'){vow=vow+1;}
				else if(sentence.charAt(j)=='e'){vow=vow+1;}
				else if(sentence.charAt(j)=='i'){vow=vow+1;}
				else if(sentence.charAt(j)=='o'){vow=vow+1;}
				else if(sentence.charAt(j)=='u'){vow=vow+1;}

				else if(sentence.charAt(j)=='A'){vow=vow+1;}
				else if(sentence.charAt(j)=='E'){vow=vow+1;}
				else if(sentence.charAt(j)=='I'){vow=vow+1;}
				else if(sentence.charAt(j)=='O'){vow=vow+1;}
				else if(sentence.charAt(j)=='U'){vow=vow+1;}
				else{cons=cons+1;}
		}
	int i = letters;
	letters = letters-spaces;
	}

	public int getSpaces(){
		return spaces;
		}
		public int getVow(){
				return vow;
		}
		public int getCons(){
				return cons;
		}

}

