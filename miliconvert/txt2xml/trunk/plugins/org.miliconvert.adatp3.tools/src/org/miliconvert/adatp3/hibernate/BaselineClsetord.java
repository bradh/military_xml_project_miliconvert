package org.miliconvert.adatp3.hibernate;

// Generated 3 sept. 2009 09:13:44 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * BaselineClsetord generated by hbm2java
 */
public class BaselineClsetord implements java.io.Serializable {

	private double key;
	private Double setref;
	private Double context;
	private Double setordno;
	private String setcond;
	private String setrep;
	private String ignoreseq;
	private Date auditdate;
	private String setname;
	private String segmentname;
	private String strtbraket;
	private String stopbraket;

	public BaselineClsetord() {
	}

	public BaselineClsetord(double key) {
		this.key = key;
	}

	public BaselineClsetord(double key, Double setref, Double context,
			Double setordno, String setcond, String setrep, String ignoreseq,
			Date auditdate, String setname, String segmentname,
			String strtbraket, String stopbraket) {
		this.key = key;
		this.setref = setref;
		this.context = context;
		this.setordno = setordno;
		this.setcond = setcond;
		this.setrep = setrep;
		this.ignoreseq = ignoreseq;
		this.auditdate = auditdate;
		this.setname = setname;
		this.segmentname = segmentname;
		this.strtbraket = strtbraket;
		this.stopbraket = stopbraket;
	}

	public double getKey() {
		return this.key;
	}

	public void setKey(double key) {
		this.key = key;
	}

	public Double getSetref() {
		return this.setref;
	}

	public void setSetref(Double setref) {
		this.setref = setref;
	}

	public Double getContext() {
		return this.context;
	}

	public void setContext(Double context) {
		this.context = context;
	}

	public Double getSetordno() {
		return this.setordno;
	}

	public void setSetordno(Double setordno) {
		this.setordno = setordno;
	}

	public String getSetcond() {
		return this.setcond;
	}

	public void setSetcond(String setcond) {
		this.setcond = setcond;
	}

	public String getSetrep() {
		return this.setrep;
	}

	public void setSetrep(String setrep) {
		this.setrep = setrep;
	}

	public String getIgnoreseq() {
		return this.ignoreseq;
	}

	public void setIgnoreseq(String ignoreseq) {
		this.ignoreseq = ignoreseq;
	}

	public Date getAuditdate() {
		return this.auditdate;
	}

	public void setAuditdate(Date auditdate) {
		this.auditdate = auditdate;
	}

	public String getSetname() {
		return this.setname;
	}

	public void setSetname(String setname) {
		this.setname = setname;
	}

	public String getSegmentname() {
		return this.segmentname;
	}

	public void setSegmentname(String segmentname) {
		this.segmentname = segmentname;
	}

	public String getStrtbraket() {
		return this.strtbraket;
	}

	public void setStrtbraket(String strtbraket) {
		this.strtbraket = strtbraket;
	}

	public String getStopbraket() {
		return this.stopbraket;
	}

	public void setStopbraket(String stopbraket) {
		this.stopbraket = stopbraket;
	}

}
