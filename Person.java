public class Person {
	public	int		age		;
	public	double 	height	;
	private double 	weight	;

	public void setPerson(double x){ // setter 메서드
		weight = x;
	}
	public double getPerson(){ // getter 메서드
		return weight;
	}
}