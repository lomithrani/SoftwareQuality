package SoftwareQuality.Assignment2;
import java.util.NoSuchElementException;
import SoftwareQuality.Assignment2.HanoiTower;


import junit.framework.*;

public class HanoiTowerTests extends TestCase{

	private HanoiTower Hanoi;

	public void setUp(){
		Hanoi = new HanoiTower(3);
	}
	
	public void tearDown(){
		Hanoi = null;
	}
	
	
	public void testConstructorPosNbOfDisks() {
		Hanoi = new HanoiTower(4);
		assertTrue(Hanoi.tower[0].getSize()==4);
		assertTrue(Hanoi.tower[1].getSize()==4);
		assertTrue(Hanoi.tower[2].getSize()==4);
	}
	
	public void testConstructorNegNbOfDisks(){
		try{
			Hanoi = new HanoiTower(-1);
		}catch(NegativeArraySizeException ex){
			assertTrue(ex != null);
		}			
	}
	

	public void testConstructorNullNbOfDisks(){
		Hanoi = new HanoiTower(0);
		assertTrue(Hanoi.tower[0].getSize()==0);
		assertTrue(Hanoi.tower[1].getSize()==0);
		assertTrue(Hanoi.tower[2].getSize()==0);
	}
	
	public void testTohValue(){
		Hanoi.toh(3);
		int z=3;
		for (int i=0;i<3;i++)
		{
			assertTrue(Hanoi.tower[0].getStack()[i]==z);
			z--;
		}
	}
	
	public void testMoveOpti(){
		Hanoi.toh(3);
		Hanoi.move(3, 0, 1, 2);
		assertTrue(Hanoi.tower[0].getNumberOfElements()==0);
		assertTrue(Hanoi.tower[1].getNumberOfElements()==0);
		assertTrue(Hanoi.tower[2].getNumberOfElements()==3);
		int z=3;
		for (int i=0;i<3;i++)
		{
			assertTrue(Hanoi.tower[2].getStack()[i]==z);
			z--;
		}
	}
}
