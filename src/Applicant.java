/**
 * @author Aaron
 * This is a class that represents the information that would be displayed in an Array class, but is used in displaying the information for the queue and driver classes
 */

public class Applicant {

	/**
	 * Variables that the Array class Applicant uses
	 */
	private String lastName;
	private String firstName;
	private int age;
	private String email;
	private String education;
	private int eduValue;
	private String experience;

	/**
	 * creates the relationship between Applicant and the Strings and Integers
	 */
	public Applicant(String lastName, String firstName, int age, String email, String education, String experience) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.email = email;
		this.education = education;
		
		/**
		 * This is the edValues, which were created so that the level of education should be sorted.
		 */
		if (education.equalsIgnoreCase("4+ years"))
			eduValue = 6;
		else if (education.equalsIgnoreCase("2 years"))
			eduValue = 7;
		else if (education.equalsIgnoreCase("Diploma"))
			eduValue = 8;
		else if (education.equalsIgnoreCase("GED"))
			eduValue = 9;
		else if (education.equalsIgnoreCase("NA"))
			eduValue = 10;
		this.experience = experience;
	}

	/**
	 * getters and setters
	 */
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public int getEduvalue() {
		return eduValue;
	}

	public void setEduvalue(int eduValue) {
		this.eduValue = eduValue;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	/**
	 * toString method that is shown when display is called
	 */
	public String toString() {
		return "Applicant: Last Name: " + lastName + " ||| " + "First Name: " + firstName + " ||| " + " Email: " + email
				+ " ||| " + " Age: " + age + " ||| " + " Education: " + education + " ||| " + " Experience: "
				+ experience;
	}
}