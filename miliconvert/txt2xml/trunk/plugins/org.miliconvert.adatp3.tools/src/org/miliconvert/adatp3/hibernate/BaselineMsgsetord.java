package org.miliconvert.adatp3.hibernate;

// Generated 3 sept. 2009 09:13:44 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * BaselineMsgsetord generated by hbm2java
 */
public class BaselineMsgsetord implements java.io.Serializable {

	private double key;
	private Double context;
	private Double setref;
	private Double setordno;
	private String setcond;
	private String setrep;
	private String strtbraket;
	private String stopbraket;
	private String replnaind;
	private String ignoreseq;
	private Date auditdate;
	private String segmentname;
	private String setname;

	public BaselineMsgsetord() {
	}

	public BaselineMsgsetord(double key) {
		this.key = key;
	}

	public BaselineMsgsetord(double key, Double context, Double setref,
			Double setordno, String setcond, String setrep, String strtbraket,
			String stopbraket, String replnaind, String ignoreseq,
			Date auditdate, String segmentname, String setname) {
		this.key = key;
		this.context = context;
		this.setref = setref;
		this.setordno = setordno;
		this.setcond = setcond;
		this.setrep = setrep;
		this.strtbraket = strtbraket;
		this.stopbraket = stopbraket;
		this.replnaind = replnaind;
		this.ignoreseq = ignoreseq;
		this.auditdate = auditdate;
		this.segmentname = segmentname;
		this.setname = setname;
	}

	public double getKey() {
		return this.key;
	}

	public void setKey(double key) {
		this.key = key;
	}

	public Double getContext() {
		return this.context;
	}

	public void setContext(Double context) {
		this.context = context;
	}

	public Double getSetref() {
		return this.setref;
	}

	public void setSetref(Double setref) {
		this.setref = setref;
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

	public String getReplnaind() {
		return this.replnaind;
	}

	public void setReplnaind(String replnaind) {
		this.replnaind = replnaind;
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

	public String getSegmentname() {
		return this.segmentname;
	}

	public void setSegmentname(String segmentname) {
		this.segmentname = segmentname;
	}

	public String getSetname() {
		return this.setname;
	}

	public void setSetname(String setname) {
		this.setname = setname;
	}

}
