package entities;

public class Student {

	public String name;
	public double notaSem1;
	public double notaSem2;
	public double notaSem3;

	private double notaMaxSem1 = 35;
	private double notaMaxSem2 = 35;
	private double notaMaxSem3 = 35;
	private double media = (notaMaxSem1 + notaMaxSem2 + notaMaxSem3) * 0.6;

	
	
	
	public Double getNotaMaxSem1() {
		
		return notaMaxSem1;
	}
	
	public Double getNotaMaxSem2() {
			
			return notaMaxSem1;
		}
	
	public Double getNotaMaxSem3() {
		
		return notaMaxSem1;
	}
	
	public Double getMedia(){
		
		return media;
	}

	
	
	public double FinalGrade() {

		return notaSem1 + notaSem2 + notaSem3;
	}

	public double MissingPoints() {

		if (FinalGrade() < media) {

			return media - FinalGrade();

		} else {

			return 0.0;

		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("FINAL GRADE = %.2f", FinalGrade());
	}

}
