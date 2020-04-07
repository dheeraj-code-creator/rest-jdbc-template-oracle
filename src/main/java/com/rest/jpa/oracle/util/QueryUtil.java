package com.rest.jpa.oracle.util;

public class QueryUtil {
	
	public String getUserInformation(int T2_ID) {
		String str = "SELECT T2_ID, T2_NAME, T2_MONSALARY from Demo where T2_ID = :T2_ID AND T2_COMPANY = 'SYNTEL' ";
		return str;
	}
}
