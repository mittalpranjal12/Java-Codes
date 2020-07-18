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
