package com.yanis.getmyphonenumber;

/**
 * 
 * @author yechao
 * @说明 通讯录信息封装类
 */
public class PhoneInfo {
	private String phoneName;
	private String phoneNumber;

	public PhoneInfo(String phoneName, String phoneNumber) {
		setPhoneName(phoneName);
		setPhoneNumber(phoneNumber);
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
