package User;

public class UserInputsAndValidation {
	private String name;
	private String phoneNumber;
	private String gender;
	private int age;
	private String password;

	public UserInputsAndValidation(String name, String phoneNumber, String gender, int age, String password) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.age = age;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\n" + "Phone number: " + phoneNumber + "\n" + "Gender: " + gender + "\n" + "Age: "
				+ age + "\n" + "Password: " + password + "\n";
	}

}
