package org.jvm;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
public static void jvmReportGenerate(String json) {
	File f = new File("C:\\Users\\intel\\eclipse-workspace\\FebCucumber\\Reports\\JVMReports");
	Configuration c = new Configuration(f, "fb application");
	c.addClassifications("Platform", "Windows");
	c.addClassifications("Browser", "Chrome");
	List<String> l = new LinkedList<String>();
	l.add(json);
	ReportBuilder r = new ReportBuilder(l, c);
	r.generateReports();
	
}
}
