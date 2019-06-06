package br.gov.serpro;

/**
 * Created by 27352403809 on 06/06/19.
 */
public class NewRelease extends Movie {

    public NewRelease(String title) {
        super(title);
    }

    @Override
    public double getThisAmount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
		if (daysRented > 1) {
				return 2;
		}
		return 1;
    }
}
