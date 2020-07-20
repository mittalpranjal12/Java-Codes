// Implement a polynomial class, that contains following functions -
// 1. setCoefficient -
// This function sets coefficient for a particular degree value. If term with given degree is not there in the polynomial, then corresponding term (with specified degree and value) is added. If the term is already present in the polynomial, then previous coefficient value is replaced by given coefficient value.
// 2. add -
// Adds two polynomials and returns a new polynomial which has the result.
// 3. subtract -
// Subtracts two polynomials and returns a new polynomial which has the result.
// 4. multiply -
// Multiplies two polynomials and returns a new polynomial which has the result.
// 5. print -
// Prints all the terms (only terms with non zero coefficients are to be printed) in increasing order of degree.
// Print pattern for a single term : "x"
//  Input:
// P1 : 1x2 2x3 4x6 
// P2 : 3x4 1x2
// Output:
// P1 - P2 = 2x3 -3x4 4x6

package OOPS_1;

public class Polynomial {

	private int [] degreeCoeff;
	
	public Polynomial()
	{
		degreeCoeff = new int [5];
	}
	
	public void setCoefficient(int degree, int coeff)
	{
		if(degree >= degreeCoeff.length)
		{
			int nDC[] = new int[degree + 5];
			for(int i = 0; i < degreeCoeff.length; i++)
			{
				nDC[i] = degreeCoeff[i];
			}
			degreeCoeff = nDC;
		}
		degreeCoeff[degree] = coeff;
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print()
	{
		for(int i = 0; i < this.degreeCoeff.length; i++)
		{
			if(degreeCoeff[i] != 0)
			{
				System.out.print(degreeCoeff[i] + "x" + "^" + i + " +" + " ");
			}
		}
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p)
	{
		Polynomial sum = new Polynomial();
		int i = 0, j = 0;
		
		while(i < this.degreeCoeff.length && j < p.degreeCoeff.length)
		{
			sum.setCoefficient(i, this.degreeCoeff[i] + p.degreeCoeff[j]);
			i++;
			j++;
		}
		while(i < this.degreeCoeff.length)
		{
			sum.setCoefficient(i, this.degreeCoeff[i]);
			i++;
		}
		while(j < p.degreeCoeff.length)
		{
			sum.setCoefficient(j, p.degreeCoeff[j]);
			j++;
		}
		return sum;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p)
	{
		Polynomial diff = new Polynomial();
		int i = 0, j = 0;
		
		while(i < this.degreeCoeff.length && j < p.degreeCoeff.length)
		{
			diff.setCoefficient(i, this.degreeCoeff[i] - p.degreeCoeff[j]);
			i++;
			j++;
		}
		while(i < this.degreeCoeff.length)
		{
			diff.setCoefficient(i, this.degreeCoeff[i]);
			i++;
		}
		while(j < p.degreeCoeff.length)
		{
			diff.setCoefficient(j, -p.degreeCoeff[j]);
			j++;
		}
		return diff;
		
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p)
	{
		Polynomial multiply = new Polynomial();
		
		for(int i = 0; i < this.degreeCoeff.length; i++)
		{
			for(int j = 0; j < p.degreeCoeff.length; j++)
			{
				int newDegree = i + j;
				int newValue = this.degreeCoeff[i] * p.degreeCoeff[j];
				
				if(newDegree < multiply.degreeCoeff.length)
				{
					int oldValue = multiply.degreeCoeff[newDegree];
					newValue = newValue + oldValue;
				}
				multiply.setCoefficient(newDegree,newValue);
			}
		}
		return multiply;
	}

}
