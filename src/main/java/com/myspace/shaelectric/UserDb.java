package com.myspace.shaelectric;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class UserDb implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "USERDB_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "USERDB_ID_GENERATOR", sequenceName = "USERDB_ID_SEQ")
	private java.lang.Long id;

	private java.lang.String name;

	private java.lang.String surname;

	private java.lang.String email;

	private java.lang.String bankAccount;

	public UserDb() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getSurname() {
		return this.surname;
	}

	public void setSurname(java.lang.String surname) {
		this.surname = surname;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getBankAccount() {
		return this.bankAccount;
	}

	public void setBankAccount(java.lang.String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public UserDb(java.lang.Long id, java.lang.String name,
			java.lang.String surname, java.lang.String email,
			java.lang.String bankAccount) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.bankAccount = bankAccount;
	}

}