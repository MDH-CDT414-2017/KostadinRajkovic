import java.io.ByteArrayOutputStream;
import java.io.Console;
import java.io.PrintStream;

import sun.rmi.runtime.Log;



/** BowlingGame Score calculator 
 *
 * @author CDT414 Student: 
 * @version 1.0 
 * @date 2016-11-24
 */
public class BowlingGame {

	/** BowlingGame Score calculator constructor which require string as input 
	 * @param game Expected format "[n,n][n,n]..[n,n]"
	 * 
	 */	 

	private char[] gameChar;
	private int[] gameNum;
	private int value;
	public BowlingGame(String game)
	{	
		//TODO: create constructor for BowlingGame
		this.gameChar=game.toCharArray();
		value=0;
		gameNum=new int[game.length()];
		for(int i=0; i<game.length(); i++)
			gameNum[i]=0;

		
	}
	
	/** getScore method returns a score of current Bowling game or -1 if error
	 * 
	 * @return Integer value of Bowling score, in case of error return value is -1 
	 */
	
	public int getScore() {
		//TODO: calculate the score of game and return correct value
		int i=0,j=0;
		if(gameChar.length<5) return -1;
		while(i<gameChar.length){
			int number=0;
			if(gameChar[i]=='['){
				i++;
				while(i<gameChar.length && Character.isDigit(gameChar[i])){
					number=number*10+Character.getNumericValue(gameChar[i]);
					i++;
				}
				if(number>10 || i==gameChar.length) return -1;
				gameNum[j++]=number;
				if(gameChar[i]==']' && i==gameChar.length-1)
					i++;
				else if (gameChar[i]==',') {
					i++;
					number=0;
					while(i<gameChar.length && Character.isDigit(gameChar[i])){
						number=number*10+Character.getNumericValue(gameChar[i]);
						i++;
					}
					if(number>10 || i==gameChar.length) return -1;
					gameNum[j++]=number;
					if(gameChar[i]==']') i++;
					else return -1;
				}
				else return -1;
			}            
			else return -1;
		}
		
		i=0;
		j=0;
		while(i<gameNum.length){
			//strike
			if(gameNum[i]==10 && i%2==0 && i<18){
				if(i+2<gameNum.length ) {
					//double strike
					if(gameNum[i+2]==10) {
					  if(i+4<gameNum.length) {
						  value+=gameNum[i]+gameNum[i+2]+gameNum[i+4];
						  i+=2;
					  }
					 
					}
					else {
						//regular strike
						if(i+3<gameNum.length) {
							value+=gameNum[i]+gameNum[i+2]+gameNum[i+3];
							i+=2;
						}
						//regular strike but end of game
					}	
				}
				//strike in bonus throw
		
			}
			else {
				if(i<gameNum.length-1) {
					//spare
					if(gameNum[i]+gameNum[i+1]==10 && i<18) {
						value+=gameNum[i]+gameNum[i+1]+gameNum[i+2];
						i+=2;
					}
					//regular throw
					else {
						value+=gameNum[i]+gameNum[i+1];
						i+=2;
					}
				}
				//bonus throw
				else {
					value+=gameNum[i];
					i++;
				}
			}
		}
		return value;
	
	}
	
}
