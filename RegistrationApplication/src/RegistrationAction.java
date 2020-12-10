import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class RegistrationAction extends ActionSupport{
	private String firstName,lastName,gender,emaill,address,selectedColor;
	public Integer age;
	List<String> colors;
	public String initializeFormFields()
	{
		System.out.println("initialize form fields methoddd");
		initializeColors();
		return "input";
	}
	public void initializeColors()
	{System.out.println("initialize colorrrr  methoddd");
		colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("White");
	}
	public String execute()
	{
		System.out.println("Registration Execute method worked");
		return "success";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmaill() {
		return emaill;
	}

	public void setEmaill(String emaill) {
		this.emaill = emaill;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSelectedColor() {
		return selectedColor;
	}

	public void setSelectedColor(String selectedColor) {
		this.selectedColor = selectedColor;
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	
	/*
	 * public void validate() { if(firstName.equals("")) {
	 * addFieldError("firstName", "First Name is Required"); } else
	 * if(lastName.equals("")) { addFieldError("lastName", "Last Name is required");
	 * } else if(gender == null) { addFieldError("gender", "Gender is required"); }
	 * 
	 * else if(age == null) { addFieldError("age", "Age is required"); } else
	 * if(age<=18) { addFieldError("age", "Age Should be greater than 18"); }
	 * 
	 * else if(email.equals("")) { addFieldError("email", "email is required"); } }
	 */
	
}
