package com.javaassignment0203;


public class X_Pattern {									//this class will print an X-pattern made of asterisks.

	public static void main(String[] args) {							
		// TODO Auto-generated method stub
		int locatNum=3;
		for (int countCol = 1; countCol <= (locatNum * 2 + 1); countCol++) //this will lead the cursor to desired columns to print the asterisk(*)
		   {
		       for (int countRow = 0; countRow <= (locatNum * 2 + 1); countRow++) // this nesting condition will lead the cursor to desired rows to print the asterisk(*)
		       {
		           if (countCol == countRow) 									// this condition will lead the print the asterisk in the places 
		           	{															// when countCol and countRow will be equal
		               System.out.print("*");
		           		}
		           else 
		        	   if (countCol + countRow == (locatNum * 2 + 2))			//this logic will print the asterisk at desired places 
		           {
		               System.out.print("*");
		           }
		           else
		           {
		               System.out.print(" ");									// this will print the spaces
		           }
		       }
		       System.out.println("");											// this will print the spaces
		   }

	}

}
