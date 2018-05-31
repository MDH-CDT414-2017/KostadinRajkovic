import junit.framework.TestCase;

/** BowlingGameTest 
 *
 * @author CDT414 Student:
 * @version 1.0 
 * @date 2016-11-24
 */

/** BowlingGame Score calculator test cases 
 *  
 */	 
public class BowlingGameTest extends TestCase {
        
	/** test01 
	 * 	
	 *  If no game is provided, score should be -1 (error)   
	 */	     


	public void test00() {
        BowlingGame bowlingGame = new BowlingGame("[[10,4][3,6]");
        assertEquals(-1, bowlingGame.getScore());
    }
	
	public void test01() {
        BowlingGame bowlingGame = new BowlingGame("");
        assertEquals(-1, bowlingGame.getScore());
    }
	public void test02() {
        BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(81, bowlingGame.getScore());
    }

	public void test03() {
        BowlingGame bowlingGame = new BowlingGame("[10,0][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(94, bowlingGame.getScore());
    }
	public void test04() {
        BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(112, bowlingGame.getScore());
    }

	public void test05() {
        BowlingGame bowlingGame = new BowlingGame("[1,9][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(88, bowlingGame.getScore());
    }
	public void test06() {
        BowlingGame bowlingGame = new BowlingGame("[8,2][5,5][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(98, bowlingGame.getScore());
    }
	public void test07() {
        BowlingGame bowlingGame = new BowlingGame("[10,0][4,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(103, bowlingGame.getScore());
    }
	public void test08() {
        BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,8][7]");
        assertEquals(90, bowlingGame.getScore());
    }
	
	public void test09() {
        BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][10,0][7,2]");
        assertEquals(92, bowlingGame.getScore());
    }
	public void test10() {
        BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,8][10]");
        assertEquals(93, bowlingGame.getScore());
    }
	public void test11() {
        BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10]");
        assertEquals(300, bowlingGame.getScore());
    }
	public void test12() {
        BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0]");
        assertEquals(290, bowlingGame.getScore());
    }

	
	//TODO: Add more test cases below...
	
}