package com.Fawkes.network;

public class ParcelMessage extends Parcel {


	private String body;

	public ParcelMessage (String body, Sender sender) {

		super (sender);

		this.body = body;

	}

	public String getBody () {
		return body;
	}

}