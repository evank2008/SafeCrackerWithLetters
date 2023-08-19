//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _02_methods._2_safe_cracker_with_letters;

import java.io.File;
import java.util.Random;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class SafeCracker {
String l1 = null;
String l2 = null;
String l3 = null;
String l4 = null;
String l5 = null;
String l6 = null;
String secretCode = null;
/*
HOW TO ADD ANOTHER LETTER
1. Add another string under the SafeCracker class above this comment. Name it l
 and then the next number after the previous one.
2.In the cracker() void, copy from the word 'for' at the top to the bracket right after the comment,
"This bracket is for the switch".
3. Paste above the previous for loop.
4. In the switch, MANUALLY :( change EACH :( instance of the l variable and the dig variable to the next number up.
:(
5. At the bottom of the cracker() void, find the line that runs the tryCode() void. Add in the new l int.
6. Add a new bracket at the end.
7. Change the message in the tryCode() void to reflect the new character limit.

*/

	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	boolean canPlaySounds = true;
	
	public static void main(String[] args) {
		SafeCracker sc = new SafeCracker();
		System.out.println("sc.crackthesafe");
		sc.tryCode("Start#$%^");
		sc.crackTheSafe();
		
	}

	
	void crackTheSafe() {
		tryCode("bazinga");
		System.out.println("cracksafe ran");
		JOptionPane.showMessageDialog(null, "Oh no! The safe is locked!");
		JOptionPane.showMessageDialog(null, "Initialize safecracker?");
		cracker();
		}

	void cracker() {
		System.out.println("cracker ran");
		for(int dig6 = 0;6<=26;) {
			switch (dig6) {
			case 0:
				l6="";
				break;
			case 1:
				l6 = "a";
				break;
			case 2:
				l6 = "b";
				break;
			case 3:
				l6 = "c";
				break;
			case 4:
				l6 = "d";
				break;
			case 5:
				l6 = "e";
				break;
			case 6:
				l6 = "f";
				break;
			case 7:
				l6 = "g";
				break;
			case 8:
				l6 = "h";
				break;
			case 9:
				l6 = "i";
				break;
			case 10:
				l6 = "j";
				break;
			case 11:
				l6 = "k";
				break;
			case 12:
				l6 = "l";
				break;
			case 13:
				l6 = "m";
				break;
			case 14:
				l6 = "n";
				break;
			case 15:
				l6 = "o";
				break;
			case 16:
				l6 = "p";
				break;
			case 17:
				l6 = "q";
				break;
			case 18:
				l6 = "r";
				break;
			case 19:
				l6 = "s";
				break;
			case 20:
				l6 = "t";
				break;
			case 21:
				l6 = "u";
				break;
			case 22:
				l6 = "v";
				break;
			case 23:
				l6 = "w";
				break;
			case 24:
				l6 = "x";
				break;
			case 25:
				l6 = "y";
				break;
			case 26:
				l6 = "z";
				break;
			default:
				System.out.println("error");
				//this bracket is for the switch
			} 
		for(int dig5 = 0;dig5<=26;) {
			switch (dig5) {
			case 0:
				l5="";
				break;
			case 1:
				l5 = "a";
				break;
			case 2:
				l5 = "b";
				break;
			case 3:
				l5 = "c";
				break;
			case 4:
				l5 = "d";
				break;
			case 5:
				l5 = "e";
				break;
			case 6:
				l5 = "f";
				break;
			case 7:
				l5 = "g";
				break;
			case 8:
				l5 = "h";
				break;
			case 9:
				l5 = "i";
				break;
			case 10:
				l5 = "j";
				break;
			case 11:
				l5 = "k";
				break;
			case 12:
				l5 = "l";
				break;
			case 13:
				l5 = "m";
				break;
			case 14:
				l5 = "n";
				break;
			case 15:
				l5 = "o";
				break;
			case 16:
				l5 = "p";
				break;
			case 17:
				l5 = "q";
				break;
			case 18:
				l5 = "r";
				break;
			case 19:
				l5 = "s";
				break;
			case 20:
				l5 = "t";
				break;
			case 21:
				l5 = "u";
				break;
			case 22:
				l5 = "v";
				break;
			case 23:
				l5 = "w";
				break;
			case 24:
				l5 = "x";
				break;
			case 25:
				l5 = "y";
				break;
			case 26:
				l5 = "z";
				break;
			default:
				System.out.println("error");
				//this bracket is for the switch
			} 
		for(int dig4 = 0;dig4<=26;) {
			switch (dig4) {
			case 0:
				l4="";
				break;
			case 1:
				l4 = "a";
				break;
			case 2:
				l4 = "b";
				break;
			case 3:
				l4 = "c";
				break;
			case 4:
				l4 = "d";
				break;
			case 5:
				l4 = "e";
				break;
			case 6:
				l4 = "f";
				break;
			case 7:
				l4 = "g";
				break;
			case 8:
				l4 = "h";
				break;
			case 9:
				l4 = "i";
				break;
			case 10:
				l4 = "j";
				break;
			case 11:
				l4 = "k";
				break;
			case 12:
				l4 = "l";
				break;
			case 13:
				l4 = "m";
				break;
			case 14:
				l4 = "n";
				break;
			case 15:
				l4 = "o";
				break;
			case 16:
				l4 = "p";
				break;
			case 17:
				l4 = "q";
				break;
			case 18:
				l4 = "r";
				break;
			case 19:
				l4 = "s";
				break;
			case 20:
				l4 = "t";
				break;
			case 21:
				l4 = "u";
				break;
			case 22:
				l4 = "v";
				break;
			case 23:
				l4 = "w";
				break;
			case 24:
				l4 = "x";
				break;
			case 25:
				l4 = "y";
				break;
			case 26:
				l4 = "z";
				break;
			default:
				System.out.println("error");
				//this bracket is for the switch
			} 
		for(int dig3 = 0;dig3<=26;) {
			switch (dig3) {
			case 0:
				l3="";
				break;
			case 1:
				l3 = "a";
				break;
			case 2:
				l3 = "b";
				break;
			case 3:
				l3 = "c";
				break;
			case 4:
				l3 = "d";
				break;
			case 5:
				l3 = "e";
				break;
			case 6:
				l3 = "f";
				break;
			case 7:
				l3 = "g";
				break;
			case 8:
				l3 = "h";
				break;
			case 9:
				l3 = "i";
				break;
			case 10:
				l3 = "j";
				break;
			case 11:
				l3 = "k";
				break;
			case 12:
				l3 = "l";
				break;
			case 13:
				l3 = "m";
				break;
			case 14:
				l3 = "n";
				break;
			case 15:
				l3 = "o";
				break;
			case 16:
				l3 = "p";
				break;
			case 17:
				l3 = "q";
				break;
			case 18:
				l3 = "r";
				break;
			case 19:
				l3 = "s";
				break;
			case 20:
				l3 = "t";
				break;
			case 21:
				l3 = "u";
				break;
			case 22:
				l3 = "v";
				break;
			case 23:
				l3 = "w";
				break;
			case 24:
				l3 = "x";
				break;
			case 25:
				l3 = "y";
				break;
			case 26:
				l3 = "z";
				break;
			default:
				System.out.println("error");
				//this bracket is for the switch
			}
			
		for(int dig2 = 0;dig2<=26;) {
			switch (dig2) {
			case 0:
				l2="";
				break;
			case 1:
				l2 = "a";
				break;
			case 2:
				l2 = "b";
				break;
			case 3:
				l2 = "c";
				break;
			case 4:
				l2 = "d";
				break;
			case 5:
				l2 = "e";
				break;
			case 6:
				l2 = "f";
				break;
			case 7:
				l2 = "g";
				break;
			case 8:
				l2 = "h";
				break;
			case 9:
				l2 = "i";
				break;
			case 10:
				l2 = "j";
				break;
			case 11:
				l2 = "k";
				break;
			case 12:
				l2 = "l";
				break;
			case 13:
				l2 = "m";
				break;
			case 14:
				l2 = "n";
				break;
			case 15:
				l2 = "o";
				break;
			case 16:
				l2 = "p";
				break;
			case 17:
				l2 = "q";
				break;
			case 18:
				l2 = "r";
				break;
			case 19:
				l2 = "s";
				break;
			case 20:
				l2 = "t";
				break;
			case 21:
				l2 = "u";
				break;
			case 22:
				l2 = "v";
				break;
			case 23:
				l2 = "w";
				break;
			case 24:
				l2 = "x";
				break;
			case 25:
				l2 = "y";
				break;
			case 26:
				l2 = "z";
				break;
			default:
				System.out.println("error");
				//this bracket is for the switch
			}
			
			for(int dig1 = 1;dig1<=26;) {
				switch (dig1) {
				case 1:
					l1 = "a";
					break;
				case 2:
					l1 = "b";
					break;
				case 3:
					l1 = "c";
					break;
				case 4:
					l1 = "d";
					break;
				case 5:
					l1 = "e";
					break;
				case 6:
					l1 = "f";
					break;
				case 7:
					l1 = "g";
					break;
				case 8:
					l1 = "h";
					break;
				case 9:
					l1 = "i";
					break;
				case 10:
					l1 = "j";
					break;
				case 11:
					l1 = "k";
					break;
				case 12:
					l1 = "l";
					break;
				case 13:
					l1 = "m";
					break;
				case 14:
					l1 = "n";
					break;
				case 15:
					l1 = "o";
					break;
				case 16:
					l1 = "p";
					break;
				case 17:
					l1 = "q";
					break;
				case 18:
					l1 = "r";
					break;
				case 19:
					l1 = "s";
					break;
				case 20:
					l1 = "t";
					break;
				case 21:
					l1 = "u";
					break;
				case 22:
					l1 = "v";
					break;
				case 23:
					l1 = "w";
					break;
				case 24:
					l1 = "x";
					break;
				case 25:
					l1 = "y";
					break;
				case 26:
					l1 = "z";
					break;
				default:
					System.out.println("error");
					//this bracket is for the switch
				}
				tryCode(l6+l5+l4+l3+l2+l1);
				dig1++;
				}
			//this bracket is for digit 1
			dig2++;
		//this bracket is for the for loop
			}
		dig3++;
		}
	dig4++;
		}
		dig5++;
		}
		dig6++;
		if(dig6==27) {
			break;
		}
		}
		JOptionPane.showMessageDialog(null, "Amazing! I couldn't crack your code.");
	}
		
	
	
	//this bracket is for the void oneLetter
		
	
	 void tryCode(String guess) {
		 if(guess.equals("Start#$%^")) {
			 secretCode = JOptionPane.showInputDialog("Please enter your new password. Password must be 6 characters or less and \n may not contain symbols, numbers, or capital letters");
			 if(secretCode.length()>6) {
				 JOptionPane.showMessageDialog(null, "That's too long! try again!");
				 tryCode("Start#$%^");
			 }
		 }
		 else
		System.out.println("trying " + guess);
		if (guess.equals(secretCode)) {
			JOptionPane.showMessageDialog(null, "Congratulations! You cracked the safe with " + guess);
			playTheSoundOfSuccess();
			System.exit(0);
		}
	}

	private void playTheSoundOfSuccess() {
		
		String path = "src/_02_methods/_2_safe_cracker/";
		if (canPlaySounds) {	
			File sound = new File(path+"me-gusta.wav");
			if (sound.exists()) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}
			}
		}
	}

	
}
