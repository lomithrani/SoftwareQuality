package SoftwareQuality.Assignment2;

import java.util.*;

import java.util.*;

public class HanoiTower {

	private int N;
	private int nombreDeplacement = 0;

	/* Creating Stack array */

	public MyStack[] tower = new MyStack[3];

	public HanoiTower(int nbDisk) {
		this.setN(nbDisk);
		tower[0] = new MyStack(getN());
		tower[1] = new MyStack(getN());
		tower[2] = new MyStack(getN());
	}
	
	/* Function to push disks into stack */

	public void toh(int n) {
		for (int d = n; d > 0; d--)
			tower[0].push(d);
		display();
		

	}

	/* Recursive Function to move disks */

	public void move(int n, int a, int b, int c) {
		if (n > 0) {
			move(n - 1, a, c, b);
			int d = tower[a].pop();
			tower[c].push(d);
			display();
			setNombreDeplacement(getNombreDeplacement() + 1);
			System.out.println(getNombreDeplacement() + " déplacement(s)\n");
			move(n - 1, b, a, c);
		}
	}
	/* Function to display */

	public void display() {
		System.out.println(" A | B | C");
		System.out.println("---------------");
		for (int i = getN() - 1; i >= 0; i--) {
			String d1 = " ", d2 = " ", d3 = " ";
			try {
				d1 = String.valueOf(tower[0].getStack()[i]);
			} catch (Exception e) {
			}

			try {
				d2 = String.valueOf(tower[1].getStack()[i]);
			} catch (Exception e) {

			}

			try {
				d3 = String.valueOf(tower[2].getStack()[i]);
			} catch (Exception e) {

			}
			System.out.println(" " + d1 + " | " + d2 + " | " + d3);
		}
		System.out.println("\n");

	}

	public int getN() {
		return N;
	}

	public void setN(int n) {
		N = n;
	}

	private int getNombreDeplacement() {
		return nombreDeplacement;
	}

	private void setNombreDeplacement(int nombreDeplacement) {
		this.nombreDeplacement = nombreDeplacement;
	}

}
