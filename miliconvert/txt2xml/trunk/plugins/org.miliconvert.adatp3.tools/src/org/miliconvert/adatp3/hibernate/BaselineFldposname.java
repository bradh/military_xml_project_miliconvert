package org.miliconvert.adatp3.hibernate;

// Generated 3 sept. 2009 09:13:44 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * BaselineFldposname generated by hbm2java
 */
public class BaselineFldposname implements java.io.Serializable {

	private double key;
	private String class_;
	private Date auditdate;
	private String posname;

	public BaselineFldposname() {
	}

	public BaselineFldposname(double key) {
		this.key = key;
	}

	public BaselineFldposname(double key, String class_, Date auditdate,
			String posname) {
		this.key = key;
		this.class_ = class_;
		this.auditdate = auditdate;
		this.posname = posname;
	}

	public double getKey() {
		return this.key;
	}

	public void setKey(double key) {
		this.key = key;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public Date getAuditdate() {
		return this.auditdate;
	}

	public void setAuditdate(Date auditdate) {
		this.auditdate = auditdate;
	}

	public String getPosname() {
		return this.posname;
	}

	public void setPosname(String posname) {
		this.posname = posname;
	}

}
