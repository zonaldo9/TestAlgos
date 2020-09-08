public class CalcSalaire {


	public static double calcSalaire(int nbHeures, int montantHoraire) {
		double salaire = 0;

		if (nbHeures <= 160) {
			salaire = montantHoraire * nbHeures;
		} else if (nbHeures <= 200) {
			salaire = montantHoraire * (160 + (nbHeures - 160) * 1.25);
		} else {
			salaire = montantHoraire * (160 + 40 * 1.25 + (nbHeures - 200) * 1.5);
		}

		if (nbHeures <= 160) {
			salaire = montantHoraire * nbHeures;
		} else if (nbHeures <= 200) {
			salaire = montantHoraire *(160 + (nbHeures - 160) * 1.25);
		} else if (nbHeures > 200) {
			salaire = montantHoraire *(160 + 40 * 1.25 + (nbHeures - 200) * 1.5);

		}

		//
		return salaire;
	}

	public static void main(String[] args) {
		System.out.println(calcSalaire(220, 10));

	}

}
