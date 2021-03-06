
package application;

import java.sql.Date;
import java.util.Formatter;

public class EmployeeInfo {

	private int EmployeeID;
	private String FirstName;
	private String LastName;
	private int Phone;
	private String Gender;
	private String Address;
	private String NIDnumber;
	private String Designation;
	private Date JoiningDate;
	private double Salary;

	public EmployeeInfo() {
	}
//generteEmployeeID()

	public EmployeeInfo(int EmployeeID, String Designation, Date JoiningDate, double Salary, String Address,
			String NIDnumber, String FirstName, String LastName, int Phone, String Gender) {
		this.EmployeeID = EmployeeID;
		this.NIDnumber = NIDnumber;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Phone = Phone;
		this.Gender = Gender;
		this.Address = Address;
		this.Designation = Designation;
		this.JoiningDate = JoiningDate;
		this.Salary = Salary;

	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public String getDesignation() {
		return Designation;
	}

	public int getPhone() {
		return Phone;
	}

	public String getGender() {
		return Gender;
	}

	public Date getJoiningDate() {
		return JoiningDate;
	}

	public double getSalary() {
		return Salary;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public String getAddress() {
		return Address;
	}

	public String getNIDnumber() {
		return NIDnumber;
	}

	public void setEmployeeID(int EmployeeID) {
		this.EmployeeID = EmployeeID;
	}

	public void setNIDnumber(String NIDnumber) {
		this.NIDnumber = NIDnumber;
	}

	public void setDesignation(String Designation) {
		this.Designation = Designation;
	}

	public void setJoinDate(Date JoinDate) {
		this.JoiningDate = JoinDate;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public void setPhone(int Phone) {
		this.Phone = Phone;
	}

	public void setGender(String Gender) {
		this.Gender = Gender;
	}

	public void setSalary(double Salary) {
		this.Salary = Salary;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	String s = new String("falsea");

	@Override
	public String toString() {
		return null;
	}

}
