// A ComplexNumber class contains two data members : one is the real part (R) and the other is imaginary (I) (both integers).
// Implement the Complex numbers class that contains following functions -
// 1. constructor
// You need to create the appropriate constructor.
// 2. plus -
// This function adds two given complex numbers and updates the first complex number.
// Input :
// 4 5
// 6 7
// 1
// Output :
// 10 + i12

package OOPS_1;

public class ComplexNumbers {

	public int real;
	public int imaginary;
	
	public ComplexNumbers(int real, int imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public int getreal(int real)
	{
		return real;
	}
	
	public int getimaginary(int imaginary)
	{
		return imaginary;
	}
	
	public void setReal(int real)
	{
		this.real = real;
	}
	
	public void setImaginary(int imaginary)
	{
		this.imaginary = imaginary;
	}
	
	public void print()
	{
		System.out.println(real + " + " +  imaginary + "i");
	}
	
	public void plus(ComplexNumbers c2)
	{
		this.real = this.real + c2.real;
		this.imaginary = this.imaginary + c2.imaginary;
	}
	
	public void multiply(ComplexNumbers c2)
	{
		int real = (this.real * c2.real) - (this.imaginary * c2.imaginary);
		int imaginary = (this.real * c2.imaginary) + (this.imaginary * c2.real);
		this.real = real;
		this.imaginary = imaginary;
	}
}
