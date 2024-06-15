// Order.java
package com.bazarify.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    
   
    private Integer purAmt;
    
   
    private String orDate;

    @ManyToOne
    @JoinColumn(name = "personId")
    private Person person;

    // Getters and setters
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getPurAmt() {
        return purAmt;
    }

    public void setPurAmt(Integer purAmt) {
        this.purAmt = purAmt;
    }

    public String getOrDate() {
        return orDate;
    }

    public void setOrDate(String orDate) {
        this.orDate = orDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", purAmt=" + purAmt + ", orDate=" + orDate + ", person=" + person + "]";
	}
    
    
}
