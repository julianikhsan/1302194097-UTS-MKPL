package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {

	// data Employee
	private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;

	private boolean isForeigner;
	private boolean gender; //true = Laki-laki, false = Perempuan
		
	public Employee(String employeeId, String firstName, String lastName, String idNumber, String address, boolean isForeigner, boolean gender) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
		this.gender = gender;


	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public String getAddress() {
		return address;
	}
	public boolean isForeigner() {
		return isForeigner;
	}

    public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
}
