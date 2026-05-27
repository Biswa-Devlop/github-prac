package com.tcs.uco;

import in.biswa.security.PwdSecurityService;

public class UserReg {
	public static void main(String[] args) {
		PwdSecurityService p = new PwdSecurityService();
		String encode = p.encode("Ranjan");
		System.out.println(encode);
		System.out.println("hello");

	}

}
