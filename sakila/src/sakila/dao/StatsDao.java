package sakila.dao;

import java.sql.Connection;
import sakila.vo.Stats;

public class StatsDao {
	
	public Stats selectDay(Connection conn, Stats stats) throws Exception {
		Stats returnStats = null;
		/*
		if(rs.next()) {
			returnStats = new Stats();
			//....
		}
		*/
		return returnStats; 
	}
	//
	public void insertStats(Connection conn, Stats stats) throws Exception {
		
	}
	//
	public void updateStats(Connection conn) throws Exception {
		
	}
}
