package sakila.dao;

import java.sql.Connection;
import sakila.vo.Stats;

public class StatsDao {
	// rs.next()있으면 true, 없으면 false
	public boolean selectDay(Connection conn, Stats stats) throws Exception {
		/*
		if(rs.next()){
			return true; // update
		}
		*/
		return false; // insert
	}
	//
	public void insertStats(Connection conn, Stats stats) throws Exception {
		
	}
	//
	public void updateStats(Connection conn) throws Exception {
		
	}
}
