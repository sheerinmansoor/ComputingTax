/**
 * 
 */
package com.gsu.sheerin;
/**
 * @author Sheerin Mansoor
 *
 */

import java.util.Scanner;

public class ComputingTax {
	public static void main(String[] args) {
		
		System.out.println("Filing Status: (enter)\n"
				+ "0 = Single Filers\n"
				+ "1 = Married Filing Jointly\n"
				+ "2 = Married Filing Separately\n"
				+ "3 = Head of Household");
		
		System.out.println("Enter the Filing Status:");
		Scanner console = new Scanner(System.in);
		int filingStatus = console.nextInt();
		
		System.out.println("Enter the Taxable Income:");
		double taxableIncome  = console.nextDouble();
		
		if(filingStatus == 0) {
			if(taxableIncome >= 0 && taxableIncome <= 8350)
				System.out.println("Your tax is:" + taxableIncome*.1);
			
			else if(taxableIncome >= 8351 && taxableIncome <= 33950)
				System.out.println("Your tax is:" + (((8350*.1) + (taxableIncome - 8350)*.15)));
			
			else if(taxableIncome >= 33951 && taxableIncome <= 82250)
				System.out.println("Your tax is:" + (((33950*.15) + (taxableIncome - 33950)*.25)));
			
			else if(taxableIncome >= 82251 && taxableIncome <= 171550)
				System.out.println("Your tax is:" + (((82250*.25) + (taxableIncome - 82250)*.28)));
			
			else if(taxableIncome >= 171551 && taxableIncome <= 372950)
				System.out.println("Your tax is:" + (((171550*.28) + (taxableIncome - 171550)*.33)));
			
			else if(taxableIncome >= 372951)
				System.out.println("Your tax is:" + taxableIncome*.35);

		}
		
		if (filingStatus == 1) {
			if(taxableIncome >= 0 && taxableIncome <= 16700)
				System.out.println("Your tax is:" + taxableIncome*.1);
			
			else if(taxableIncome >= 16701 && taxableIncome <= 67900)
				System.out.println("Your tax is:" + (((16700*.1) + (taxableIncome - 16700)*.15)));
			
			else if(taxableIncome >= 67901 && taxableIncome <= 137050)
				System.out.println("Your tax is:" + (((67900*.15) + (taxableIncome - 67900)*.25)));
			
			else if(taxableIncome >= 137051 && taxableIncome <= 208850)
				System.out.println("Your tax is:" + (((137050*.25) + (taxableIncome - 137050)*.28)));
			
			else if(taxableIncome >= 208851 && taxableIncome <= 372950)
				System.out.println("Your tax is:" + (((208850*.28) + (taxableIncome - 208850)*.33)));
			
			else if(taxableIncome >= 372951)
				System.out.println("Your tax is:" + taxableIncome*.35);
		}
		
		if (filingStatus == 2) {
			if(taxableIncome >= 0 && taxableIncome <= 8350)
				System.out.println("Your tax is:" + taxableIncome*.1);
			
			else if(taxableIncome >= 8351 && taxableIncome <= 33950)
				System.out.println("Your tax is:" + (((8350*.1) + (taxableIncome - 8350)*.15)));
			
			else if(taxableIncome >= 33951 && taxableIncome <= 68525)
				System.out.println("Your tax is:" + (((33950*.15) + (taxableIncome - 33950)*.25)));
			
			else if(taxableIncome >= 68526 && taxableIncome <= 104425)
				System.out.println("Your tax is:" + (((68525*.25) + (taxableIncome - 68525)*.28)));
			
			else if(taxableIncome >= 104426 && taxableIncome <= 186475)
				System.out.println("Your tax is:" + (((104425*.28) + (taxableIncome - 104425)*.33)));
			
			else if(taxableIncome >= 186476)
				System.out.println("Your tax is:" + taxableIncome*.35);
		}
		
		if (filingStatus == 3) {
			if(taxableIncome >= 0 && taxableIncome <= 11950)
				System.out.println("Your tax is:" + taxableIncome*.1);
			
			else if(taxableIncome >= 11951 && taxableIncome <= 45500)
				System.out.println("Your tax is:" + (((11950*.1) + (taxableIncome - 11950)*.15)));
			
			else if(taxableIncome >= 45501 && taxableIncome <= 117450)
				System.out.println("Your tax is:" + (((45500*.15) + (taxableIncome - 45500)*.25)));
			
			else if(taxableIncome >= 117451 && taxableIncome <= 190200)
				System.out.println("Your tax is:" + (((117450*.25) + (taxableIncome - 117450)*.28)));
			
			else if(taxableIncome >= 190201 && taxableIncome <= 372950)
				System.out.println("Your tax is:" + (((190200*.28) + (taxableIncome - 190200)*.33)));
			
			else if(taxableIncome >= 372951)
				System.out.println("Your tax is:" + taxableIncome*.35);
		}
		
	}
}
