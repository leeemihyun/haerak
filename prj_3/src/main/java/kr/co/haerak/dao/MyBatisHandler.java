package kr.co.haerak.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisHandler {

	private static MyBatisHandler mbh;
	private static SqlSessionFactory ssf;
	
	private MyBatisHandler() {
		org.apache.ibatis.logging.LogFactory.useLog4JLogging();
	}
	
	public static MyBatisHandler getInstance() {
		if(mbh==null) {
			mbh=new MyBatisHandler();
		}
		return mbh;
	}
	
	private SqlSessionFactory getSqlSessionFactory() {
		if(ssf==null) {
			//1.설정파일과 연결
			try {
				Reader reader = Resources.getResourceAsReader("kr/co/haerak/dao/mybatis-config.xml");
				//2.Mybatis Framework 생성
				ssf = new SqlSessionFactoryBuilder().build(reader);
				if(reader!=null)reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//end catch
			//3.스트림끊기
		}//end if
		
		return ssf;
	}
	public SqlSession getMyBatisHandler(boolean commitFlag) {
		
		return getSqlSessionFactory().openSession(commitFlag);
	}//getMyBatisHandler
	
	
}
