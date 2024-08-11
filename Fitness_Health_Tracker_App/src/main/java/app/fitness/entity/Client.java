package app.fitness.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String name;
	private double iWeight; // in kgs
	private double cWeight; // in kgs
	private double height; // in m
	private double bmi;
	@Column(name = "u_name")
	private String user;
	private String pass;
	
	
	// zero param constructor
	public Client() {
		System.out.println("App Started");
	}

	// constructor with params
	public Client(Integer id, String name, double iWeight, double cWeight, double height, double bmi, String user,
			String pass) {
		super();
		this.id = id;
		this.name = name;
		this.iWeight = iWeight;
		this.cWeight = cWeight;
		this.height = height;
		this.bmi = bmi;
		this.user = user;
		this.pass = pass;
	}
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getiWeight() {
		return iWeight;
	}


	public void setiWeight(double iWeight) {
		this.iWeight = iWeight;
	}


	public double getcWeight() {
		return cWeight;
	}


	public void setcWeight(double cWeight) {
		this.cWeight = cWeight;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getBmi() {
		return bmi;
	}


	public void setBmi(double bmi) {
		this.bmi = bmi;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", iWeight=" + iWeight + ", cWeight=" + cWeight + ", height="
				+ height + ", bmi=" + bmi + ", user=" + user + ", pass=" + pass + "]";
	}

}
