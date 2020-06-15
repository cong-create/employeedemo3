package org.zc.pojo;

public class Employee {

	private int id;
	private String uname;
	private String upass;
	private int age;
	private String phone;
	private String address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String uname, String upass, int age, String phone, String address) {
		super();
		this.id = id;
		this.uname = uname;
		this.upass = upass;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", uname=" + uname + ", upass=" + upass + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}
}
