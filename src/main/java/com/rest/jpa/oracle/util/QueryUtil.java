package com.rest.jpa.oracle.util;

public class QueryUtil {
	
	public String getUserInformation(int T2_ID) {
		// below as id, as name, as monthlySalary etc.. it will map to dto classes attributes.
		String str = "SELECT T2_ID as id, T2_NAME as name, T2_MONSALARY as monthlySalry from Demo where T2_ID = :T2_ID AND T2_COMPANY = 'SYNTEL' ";
		return str;
	}
}
