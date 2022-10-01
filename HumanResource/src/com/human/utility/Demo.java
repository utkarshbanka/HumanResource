package com.human.utility;

import java.sql.Connection;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Connection con = Dbutil.provideconnection();
		 System.out.println(con);
	}

}
