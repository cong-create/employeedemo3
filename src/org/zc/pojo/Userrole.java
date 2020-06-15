package org.zc.pojo;

public class Userrole {

	private int id;
	private String uname;
	private String role;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Userrole [id=" + id + ", uname=" + uname + ", role=" + role + "]";
	}
}
