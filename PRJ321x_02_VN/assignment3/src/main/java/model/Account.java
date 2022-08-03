package model;
public class Account {
	private int id;

	private String email,psw;
	private int role;
	private String name, address,phone;
	private int check;
	
	public Account() {}
	
	public Account(String email, String psw, int role, String name, String address, String phone, int check) {
		super();
		this.email = email;
		this.psw = psw;
		this.role = role;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.check = check;
	}
	
	public Account(String email, String psw, int role, String name, String address, String phone) {
		super();
		this.email = email;
		this.psw = psw;
		this.role = role;
		this.name = name;
		this.address = address;
		this.phone = phone;
		
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getCheck() {
		return check;
	}
	public void setCheck(int check) {
		this.check = check;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Account [email=" + email + ", psw=" + psw + ", role=" + role + ", name=" + name + ", address=" + address
				+ ", phone=" + phone + "]";
	}
	
}
