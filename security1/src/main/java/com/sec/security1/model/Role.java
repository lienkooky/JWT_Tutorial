package com.sec.security1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Role {

	  SUPERADMIN("ROLE_SUPERADMIN"),
	    ADMIN("ROLE_ADMIN");
	
	
	private String value;
}
