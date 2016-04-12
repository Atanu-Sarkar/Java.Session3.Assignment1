package com.acadgild.session.three;

public class CalculateSruareCubeRoot {

	public static void main(String[] args) {
		int cube = 8;
        int square = 25;
 
        int cbrt = (int) Math.cbrt(cube);
        int sqrt = (int) Math.sqrt(square);
        
        System.out.println("Cube root of " + cube + " is " + cbrt);
        System.out.println("Square root of " + square + " is " + sqrt);
	}

}
