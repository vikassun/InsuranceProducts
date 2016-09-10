
package com.ibm.insurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="PRODUCT_INFO")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private int product_id;
	
	@Column(name = "PRODUCT_NAME")
	private String product_name;
	
	@Column(name = "PRODUCT_DESCRIPTION")
	private String product_description;
	
	@Column(name = "PREMIUM")
	private int premium;
	
	@Column(name = "STATUS")
	private String status;
	
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public int getPremium() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}	
}
