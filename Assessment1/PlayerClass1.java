import java.util.Date;

public class PlayerClass1 {
	private String name;
	private Date dateOfBirth;
	private String skill;
	private int numberOfMatches;
	private int runs;
	private int wickets;
	private String nationality;
	private Double powerRating;
	String date;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public PlayerClass1() {
		// TODO Auto-generated constructor stub
	}
	
	public PlayerClass1(String name, Date dateOfBirth, String skill, int numberOfMatches, int runs, int wickets,
			String nationality, Double powerRating) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.skill = skill;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date s) {
		this.dateOfBirth = s;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Double getPowerRating() {
		return powerRating;
	}
	public void setPowerRating(Double powerRating) {
		this.powerRating = powerRating;
	}

	@Override
	public String toString() {
		return "Name:" + name + "\nDate of Birth:" + dateOfBirth + "\nSkill:" + skill + "\nNumber of Matches:"
				+ numberOfMatches + "\nRuns:" + runs + "\nWickets:" + wickets + "\nNationality:" + nationality
				+ "\nPower Rating:" + powerRating;
	}
	
	
	

}
