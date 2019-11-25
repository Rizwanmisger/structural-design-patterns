
package adapter;

public class EmployeeLdap {

	private String cn;
	private String name;
	private String lastName;
	private String mail;

	public EmployeeLdap(String cn, String name, String lastName, String mail) {

		this.cn = cn;
		this.name = name;
		this.lastName = lastName;
		this.mail = mail;
	}

	public String getCn() {

		return cn;
	}

	public void setCn(String cn) {

		this.cn = cn;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getLastName() {

		return lastName;
	}

	public void setLastName(String lastName) {

		this.lastName = lastName;
	}

	public String getMail() {

		return mail;
	}

	public void setMail(String mail) {

		this.mail = mail;
	}
}
