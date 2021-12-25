package com.binary;

import java.util.Scanner;
import com.util.UtilClass;

public class BinaryConv {

	static void showArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	static boolean powerOf2(int n) {
		int i = 0, temp = (int) Math.pow(2, i);
		while (temp < n) {
			if (temp == n) {
				return true;
			}
			i++;
		}
		return false;
	}

	static int[] swapNibbles(int[] arr) {
		int temp, j = arr.length - 4;
		for (int i = 0; i < 4; i++) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}

	public static void main(String[] args) {
		UtilClass UtilClass = new UtilClass();	
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter a no");
			int[] binary = UtilClass.toBinary(s.nextInt());
			System.out.println("binary is ");
			showArr(binary);
			s.close();
			swapNibbles(binary);
			System.out.println("after swapping ");
			showArr(binary);
			int swapDec = UtilClass.toDecimal(binary);
			System.out.println("decimal of swapped binary is " + swapDec);

			if (powerOf2(swapDec))
				System.out.println("its power of 2");
			else
				System.out.println("not power of 2");

		} catch (Exception e) {
			System.out.println("enter input as integer ");
		}

	}
}

