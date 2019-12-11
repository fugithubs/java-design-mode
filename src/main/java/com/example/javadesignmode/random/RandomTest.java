package com.example.javadesignmode.random;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 DecimalFormat dcmFmt = new DecimalFormat("0.00");
		 Random rand = new Random();
		 float f = rand.nextFloat() * 1000;
		System.out.println(dcmFmt.format(f));
		 */
		Random r = new Random();
		DecimalFormat dcmFmt = new DecimalFormat("0.00");
		float[] b = new float[419];
		for (int i = 0; i < b.length; i++) {
			b[i] = Float.parseFloat(dcmFmt.format(r.nextFloat()*100));
			for (int j = 0; j < i + 1; j++) {
				if ((i != j) && b[i] == b[j])
					b[i] = Float.parseFloat(dcmFmt.format(r.nextFloat()*100));
			}
		}
		
		for(int i=0;i<b.length;i++){
			System.out.println(i+":"+b[i]);
		}
	}
}
