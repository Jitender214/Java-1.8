package com.test;

import java.io.IOException;
import java.sql.SQLException;

public class AllGoesWrong {
	
	public static void main(String[] args) {
		AllGoesWrong a = new AllGoesWrong();
		try {
			a.blowup();
			System.out.println("a");
		}
		catch(IOException e|SQLException e) {
			System.out.println("c");
		}
		finally{
			System.out.println("d");
		}
	}
	void blowup() throws IOException,SQLException{
		throw new SQLException();
	}

}
