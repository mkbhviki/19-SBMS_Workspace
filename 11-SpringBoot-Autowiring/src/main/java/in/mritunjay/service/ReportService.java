package in.mritunjay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

import in.mritunjay.dao.ReportDao;

@Service
public class ReportService {
	
	private ReportDao reportDao;
	
	/*
	 * @Autowired 
	 * 
	 * @Qualifier("Mysql") public void setReportDao(ReportDao reportDao) {
	 * System.out.println("setReportDao() method called....");
	 * this.reportDao=reportDao; }
	 */
	
	public ReportService() {
		
		System.err.println("ReportService :: 0-Param Constructor called...");
		
	}
	
    @Autowired
	public ReportService(ReportDao reportDao) {
		System.err.println("ReportService :: Param Constructor called...");
		
		this.reportDao = reportDao;
	}

	
	
	public void generateReport() {
		
		 reportDao.finddata();
		System.out.println("Generating Report....!!!");
		
	}

	
}
