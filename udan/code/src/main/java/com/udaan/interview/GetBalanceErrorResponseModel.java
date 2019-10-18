package com.udaan.interview;

public class GetBalanceErrorResponseModel {
	private int httpCode;
	private String httpMessage;
	private String moreInformation;
	GetBalanceErrorResponseModel(){
		
	}
	public GetBalanceErrorResponseModel(int httpCode, String httpMessage, String moreInformation) {
		this.httpCode = httpCode;
		this.httpMessage = httpMessage;
		this.moreInformation = moreInformation;
	}
	public int getHttpCode() {
		return httpCode;
	}
	public void setHttpCode(int httpCode) {
		this.httpCode = httpCode;
	}
	public String getHttpMessage() {
		return httpMessage;
	}
	public void setHttpMessage(String httpMessage) {
		this.httpMessage = httpMessage;
	}
	public String getMoreInformation() {
		return moreInformation;
	}
	public void setMoreInformation(String moreInformation) {
		this.moreInformation = moreInformation;
	}

}
