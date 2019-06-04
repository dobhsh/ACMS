package com.acmsmongo.mongo1.model;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "feedback")
public class Feedback {

	private String Customerid;

	private String Storeid;

	private String rating1;
	private String rating2;
	private String rating3;


	//private String model;

	private String suggestion;

	public String getCustomerId() {
		return Customerid;
	}

	public void setCustomerId(String Customerid) {
		this.Customerid = Customerid;
	}
	public String getStoreId() {
		return Storeid;
	}

	public void setStoreId(String Storeid) {
		this.Storeid = Storeid;
	}

	@NotEmpty(message="Can not be empty")
	public String Rating1() {
		return rating1;
	}

	public void setq1(String rating1) {
		this.rating1 = rating1;
	}
	@NotEmpty(message="Can not be empty")
	public String Rating2() {
		return rating2;
	}

	public void setq2(String rating2) {
		this.rating2 = rating2;
	}
	@NotEmpty(message="Can not be empty")
	public String Rating3() {
		return rating3;
	}

	public void setq3(String rating3) {
		this.rating3 = rating3;
	}


	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}




}
