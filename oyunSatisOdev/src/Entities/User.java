package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String nationalNumber;
	private Date dateOfBirth;
	private int wallet=0;
	private List<Game> library=new ArrayList<Game>();

	public User() {

	}

	public User(int id, String firstName, String lastName, String email,String password, String nationalNumber, Date dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password=password;
		this.nationalNumber = nationalNumber;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNationalNumber() {
		return nationalNumber;
	}

	public void setNationalNumber(String nationalNumber) {
		this.nationalNumber = nationalNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getWallet() {
		return wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}

	public List<Game> getLibrary() {
		return library;
	}

	public void setLibrary(List<Game> library) {
		this.library = library;
	}

}
