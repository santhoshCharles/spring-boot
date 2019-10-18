package com.udaan.interview;

public class GetBalanceErrorResponseModelDetails {
	private int httpCode;
	private String httpMessage;
	private String moreInformation;
	GetBalanceErrorResponseModelDetails(){
		
	}
	public GetBalanceErrorResponseModelDetails(int httpCode, String httpMessage, String moreInformation) {
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