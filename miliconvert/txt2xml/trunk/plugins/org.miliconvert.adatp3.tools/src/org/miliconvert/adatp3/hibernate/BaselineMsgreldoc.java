package org.miliconvert.adatp3.hibernate;

// Generated 3 sept. 2009 09:13:44 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * BaselineMsgreldoc generated by hbm2java
 */
public class BaselineMsgreldoc implements java.io.Serializable {

	private double key;
	private String class_;
	private Date auditdate;
	private String msgreldoc;

	public BaselineMsgreldoc() {
	}

	public BaselineMsgreldoc(double key) {
		this.key = key;
	}

	public BaselineMsgreldoc(double key, String class_, Date auditdate,
			String msgreldoc) {
		this.key = key;
		this.class_ = class_;
		this.auditdate = auditdate;
		this.msgreldoc = msgreldoc;
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

	public String getMsgreldoc() {
		return this.msgreldoc;
	}

	public void setMsgreldoc(String msgreldoc) {
		this.msgreldoc = msgreldoc;
	}

}
