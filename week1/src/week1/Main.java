package week1;

import java.util.Scanner;

class Fraction{
	int numerator ;
	int denominator ;
	Fraction(int numerator,int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	double toDouble()
	{
		return (double)numerator/denominator;
	}
	Fraction plus(Fraction r) {//分数加法
        Fraction result = new Fraction(0,0);
        result.denominator=this.denominator*r.denominator;
        result.numerator=this.numerator*r.denominator+r.numerator*this.denominator;
        return result;
    }
    Fraction multiply(Fraction r) {//分数乘法
        Fraction result=new Fraction(0,0);
        result.numerator=this.numerator*r.numerator;
        result.denominator=this.denominator*r.denominator;
        return result;
    }
	void print()
	{
		int x = this.numerator,y = this.denominator,r;
		if(this.numerator==this.denominator)
		{
			System.out.println(1);
			return;
		}
		while(y!=0)//辗转相除法求最大公约数
		{
			r = x%y;
			x = y;
			y = r;
		}
		numerator/=x;
		denominator/=x;
		System.out.println(numerator + "/" + denominator);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		Fraction a = new Fraction(in.nextInt(), in.nextInt());

		Fraction b = new Fraction(in.nextInt(),in.nextInt());

		a.print();

		b.print();

		a.plus(b).print();

		a.multiply(b).plus(new Fraction(5,6)).print();

		a.print();

		b.print();

		in.close();

	}

}
