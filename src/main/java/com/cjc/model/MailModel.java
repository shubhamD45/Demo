package com.cjc.model;

import org.springframework.beans.factory.annotation.Value;

public class MailModel {

	@Value("${mailinfo.from}")
	private String from;
	private String to;
	private String msg;
	private String sub;

	
	
	@Override
	public String toString() {
		return "MailModel [from=" + from + ", to=" + to + ", msg=" + msg + ", sub=" + sub + "]";
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

}
