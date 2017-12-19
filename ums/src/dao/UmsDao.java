package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.UmsVo;

public class UmsDao {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	int rows = 0;

	public List<UmsVo> getAllStudentList() {
		String sql = "SELECT * FROM student ORDER BY st_id";
		List<UmsVo> list = new ArrayList<>();
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				UmsVo vo = new UmsVo(rs.getInt("st_id"), rs.getString("name"), rs.getString("sex"), rs.getInt("birth"),
						rs.getString("pw"), rs.getString("role"));
				list.add(vo);
				System.out.println(vo);

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(rs, ps, con);
		}

		return list;
	}
}
