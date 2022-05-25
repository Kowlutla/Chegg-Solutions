package com.Chegg.RationalNumbers;

public class RationalTest
{
	public static void main(String args[])
	{
		RationalNumber r1=new RationalNumber(5,10);
		RationalNumber r2=new RationalNumber(0);
		System.out.println("-----Operations involving Zero----- ");
		System.out.println("Number 1: "+r1);
		System.out.println("Number 2: "+r2);
		System.out.println("Sum: "+r1.add(r2));
		System.out.println("Substraction: "+r1.subtract(r2));
		System.out.println("Multiplication: "+r1.multiply(r2));
		System.out.println("Division : "+r1.divide(r2));
		
		System.out.println("-------Operations Involving positive and negative Numbers------- ");
		r1=new RationalNumber(4,-9);
		r2=new RationalNumber(-3,7);
		System.out.println("Number 1: "+r1);
		System.out.println("Number 2: "+r2);
		System.out.println("Sum: "+r1.add(r2));
		System.out.println("Substraction: "+r1.subtract(r2));
		System.out.println("Multiplication: "+r1.multiply(r2));s
		System.out.println("Division : "+r1.divide(r2));
		
		System.out.println("-----Various normalization Possibilites-----");
		r1=new RationalNumber(-10,15);
		System.out.println("Original Number: "+r1);
		r1.Normalize();
		System.out.println("Normalized Number: "+r1);
		r2=new RationalNumber(4,-15);
		System.out.println("Original Number: "+r2);
		r2.Normalize();
		System.out.println("Normalized Number: "+r2);
	}
}

class RationalNumber
{
   private int numerator, denominator;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the rational number by ensuring a nonzero
   //  denominator and making only the numerator signed.
   //-----------------------------------------------------------------
   public RationalNumber (int numer, int denom)
   {
	   this.numerator = numer;
      this.denominator = denom;
   }

   //-----------------------------------------------------------------
   //  Constructor: Sets up the rational number by ensuring a nonzero
   //  denominator as 1.
   //-----------------------------------------------------------------
   public RationalNumber(int whole)
   {
	   this.numerator=whole;
	   this.denominator=1;
   }
   
   //-----------------------------------------------------------------
   //  Constructor: Sets up the rational number by 0
   //  denominator as 0.
   //-----------------------------------------------------------------
   public RationalNumber()
   {
	   this.numerator=0;
	   this.denominator=0;
   }
   //-----------------------------------------------------------------
   //  Returns the numerator of this rational number.
   //-----------------------------------------------------------------
   public int getNumerator ()
   {
      return numerator;
   }

   //-----------------------------------------------------------------
   //  Returns the denominator of this rational number.
   //-----------------------------------------------------------------
   public int getDenominator ()
   {
      return denominator;
   }

   //-----------------------------------------------------------------
   //  Returns the reciprocal of this rational number.
   //-----------------------------------------------------------------
   public RationalNumber reciprocal ()
   {
      return new RationalNumber (denominator, numerator);
   }

   //-----------------------------------------------------------------
   //  Adds this rational number to the one passed as a parameter.
   //  A common denominator is found by multiplying the individual
   //  denominators.
   //-----------------------------------------------------------------
   public RationalNumber add (RationalNumber op2)
   {
      int commonDenominator = denominator * op2.getDenominator();
      int numerator1 = numerator * op2.getDenominator();
      int numerator2 = op2.getNumerator() * denominator;
      int sum = numerator1 + numerator2;

      return new RationalNumber (sum, commonDenominator);
   }

   //-----------------------------------------------------------------
   //  Subtracts the rational number passed as a parameter from this
   //  rational number.
   //-----------------------------------------------------------------
   public RationalNumber subtract (RationalNumber op2)
   {
      int commonDenominator = denominator * op2.getDenominator();
      int numerator1 = numerator * op2.getDenominator();
      int numerator2 = op2.getNumerator() * denominator;
      int difference = numerator1 - numerator2;

      return new RationalNumber (difference, commonDenominator);
   }

   //-----------------------------------------------------------------
   //  Multiplies this rational number by the one passed as a
   //  parameter.
   //-----------------------------------------------------------------
   public RationalNumber multiply (RationalNumber op2)
   {
      int numer = numerator * op2.getNumerator();
      int denom = denominator * op2.getDenominator();

      return new RationalNumber (numer, denom);
   }

   //-----------------------------------------------------------------
   //  Divides this rational number by the one passed as a parameter
   //  by multiplying by the reciprocal of the second rational.
   //-----------------------------------------------------------------
   public RationalNumber divide (RationalNumber op2)
   {
      return multiply (op2.reciprocal());
   }

   
   
   //-----------------------------------------------------------------
   //  Determines if this rational number is equal to the one passed
   //  as a parameter.  Assumes they are both reduced.
   //-----------------------------------------------------------------
   public boolean equals (RationalNumber op2)
   {
	   Normalize();
      return ( numerator == op2.getNumerator() &&
               denominator == op2.getDenominator() );
   }

   //-----------------------------------------------------------------
   //  Returns this rational number as a string.
   //-----------------------------------------------------------------
   public String toString ()
   {
      String result;

      if (numerator == 0)
         result = "0";
      else
         if (denominator == 1)
            result = numerator + "";
         else
            result = numerator + "/" + denominator;
    
      return result;
   }

   
 //-----------------------------------------------------------------
   //Perform normalization and reduces the number as much as possible   
   //-----------------------------------------------------------------
   public void Normalize()
   {
	   if (denominator < 0)
	   {
		   numerator = numerator * -1;
		   denominator = denominator * -1;
	   }
	   if (numerator != 0)
	   {
		   int common = gcd (Math.abs(numerator), denominator);
		   numerator = numerator / common;
	       denominator = denominator / common;
	   }
   }
   //-----------------------------------------------------------------
   //  Computes and returns the greatest common divisor of the two
   //  positive parameters. Uses Euclid's algorithm.
   //-----------------------------------------------------------------
   private int gcd (int num1, int num2)
   {
      while (num1 != num2)
      {
         if (num1 > num2)
            num1 = num1 - num2;
         else
            num2 = num2 - num1;
      }
      return num1;
   }
}
