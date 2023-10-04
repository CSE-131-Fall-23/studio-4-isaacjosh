package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color color = new Color(0, 0, 0);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0, 0, 0.5,1);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.4, 0.5, 0.25);

		StdDraw.filledCircle(0.6, 0.5, 0.25);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(0, 0, 1, 1);
	}
}