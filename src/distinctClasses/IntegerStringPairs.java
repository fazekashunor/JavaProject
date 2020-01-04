package distinctClasses;

public class IntegerStringPairs {
	
	private int number;
	private String name;
	private String score;
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IntegerStringPairs(Integer number,String name,String score) {
			this.number = number;
			this.name = name;
			this.score = score;
	}
	
	public static int compare(IntegerStringPairs a,IntegerStringPairs b) {
		if(a.number == b.number) return 0;
		if(a.number < b.number) return -1;
		else return 1;
	}
}
