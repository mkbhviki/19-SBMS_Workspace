package in.mritunjay.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("Mysql")
@Primary
public class MysqlReportDaoImpl implements ReportDao {
	
	public MysqlReportDaoImpl() {
		System.out.println("MysqlReportDaoImpl :: Constructor");
	}

	@Override
	public String finddata() {
		System.out.println("fetching MysqlReportDaoImpl from db...");
		return "Report Data";
	}

}
