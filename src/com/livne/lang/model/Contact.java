package com.livne.lang.model;

/**
 * This Class will represent our Contact man	
 * @author Livne
 *
 */
public class Contact {
	private String name;
	private int id;
	private int phone;
	
	/**
	 * Contact Constructor
	 * @param name
	 * @param id
	 * @param phone
	 */
	public Contact(String name, int id, int phone) {
		super();
		this.name = name;
		this.id = id;
		this.phone = phone;
	}
	
	

	@Override
	public String toString() {
		return "Contact [name=" + name + ", id=" + id + ", phone=" + phone
				+ "]";
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	
	
}
