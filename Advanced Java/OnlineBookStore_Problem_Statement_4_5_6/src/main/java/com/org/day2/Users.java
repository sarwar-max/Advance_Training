package com.org.day2;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_Id")
	private int User_Id;
	private String first_name;
	private String address;
	private String email;
	private String user_name;
	private String password;
	private String registration_date;

	public Users() {

	}

	public Users(int User_Id, String first_name, String address, String email, String user_name, String password,
			String registration_date) {

		this.User_Id = User_Id;
		this.first_name = first_name;
		this.address = address;
		this.email = email;
		this.user_name = user_name;
		this.password = password;
		this.registration_date = registration_date;
	}

	public int getUser_Id() {
		return User_Id;
	}

	public void setUser_Id(int user_Id) {
		User_Id = user_Id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(String registration_date) {
		this.registration_date = registration_date;
	}

	@Override
	public String toString() {
		return "Users [User_Id=" + User_Id + ", first_name=" + first_name + ", address=" + address + ", email=" + email
				+ ", user_name=" + user_name + ", password=" + password + ", registration_date=" + registration_date
				+ "]";
	}

}
