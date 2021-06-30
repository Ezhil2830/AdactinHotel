package org.BaseCucu;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateJvmReport(String jsonpath) {
		
		File f=new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\JvmReport");
		Configuration con= new Configuration(f,"Adactin Hotel App");
		con.addClassifications("platform", "Windows 10");
		con.addClassifications("Browsername", "Chrome");
		con.addClassifications("Browserversion", "89.0");
		con.addClassifications("sprint", "10");
		
		List<String> list= new ArrayList<String>();
		list.add(jsonpath);
		
		ReportBuilder r= new ReportBuilder(list,con);
		r.generateReports();
		
		
		
	}

}
