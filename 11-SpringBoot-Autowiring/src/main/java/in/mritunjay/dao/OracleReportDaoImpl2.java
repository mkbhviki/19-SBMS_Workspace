package in.mritunjay.dao;

import org.springframework.stereotype.Repository;

@Repository("Oracle")
public class OracleReportDaoImpl2 implements ReportDao {
	
	public OracleReportDaoImpl2() {
		System.out.println("OracleReportDaoImpl2 :: Constructor");
	}

	@Override
	public String finddata() {
		System.out.println("fetching OracleReportDaoImpl2 from db...");
		return "Report Data";
	}

}
