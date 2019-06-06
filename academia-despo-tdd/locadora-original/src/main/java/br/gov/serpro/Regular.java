package br.gov.serpro;

/**
 * Created by 27352403809 on 06/06/19.
 */
public class Regular extends Movie{

    public Regular(String title) {
        super(title);
    }

    @Override
    public double getThisAmount(int daysRented) {
		double thisAmount = 2;
            if (daysRented > 2)
                thisAmount += (daysRented - 2) * 1.5;
        return thisAmount;
    }
}
