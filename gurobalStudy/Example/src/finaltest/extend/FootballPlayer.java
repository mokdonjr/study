package finaltest.extend;

public class FootballPlayer {
	
	private String name;
	private int age;
	private String countryName;
	private String teamName;
	
	public FootballPlayer() {
//		System.out.println("init FootballPlayer");
	}
	public FootballPlayer(String name) {
		this.name = name;
//		System.out.println("init FootballPlayer");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
}
