package br.gov.serpro;

/**
 * Created by 27352403809 on 06/06/19.
 */
public class Childrens extends Movie{
    public Childrens(String title) {
        super(title);
    }

	public double getThisAmount(int daysRented) {
		double thisAmount = 1.5;
            if (daysRented > 3)
                thisAmount += (daysRented - 3) * 1.5;
		return thisAmount;
	}
}
