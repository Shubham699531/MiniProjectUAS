package com.cg.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.entity.Application;
import com.cg.entity.ProgramsScheduled;
import com.cg.utility.JdbcUtil;

public class ApplicantDaoImpl implements ApplicantDao {

	ProgramsScheduled program;
	List<ProgramsScheduled> programs;

	@Override
	public List<ProgramsScheduled> listAllScheduledPrograms() {
		Connection conn = null;

		try {
			conn = JdbcUtil.getConnection();
			programs = new ArrayList<ProgramsScheduled>();
			Statement stmt = conn.createStatement();
			ResultSet results = stmt.executeQuery(getAllQuery);
			while (results.next()) {
				program = new ProgramsScheduled();

				program.setScheduledProgramId(results.getInt(1));
				program.setProgramName(results.getString(2));
				program.setLocation(results.getString(3));
				program.setStartDate(results.getDate(4));
				program.setEndDate(results.getDate(5));
				program.setSessionPerWeek(results.getInt(6));

				programs.add(program);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return programs;
	}

	@Override
	public Application retrieveApplicationStatus(int applicantId) {
		Application application = null;
		Connection conn = null;

		try {
			conn = JdbcUtil.getConnection();
			PreparedStatement statement = conn.prepareStatement(getOneQuery);
			statement.setInt(1, applicantId);
			ResultSet rs = statement.executeQuery();

			if (rs.next()) {
				application = new Application();

				application.setApplicationId(rs.getInt(1));
				application.setFullName(rs.getString(2));
				application.setDateOfBirth(rs.getDate(3));
				application.setHighestQualification(rs.getString(4));
				application.setMarksObtained(rs.getDouble(5));
				application.setGoals(rs.getString(6));
				application.setMailId(rs.getString(7));
				application.setScheduledProgramId(rs.getInt(8));
				application.setStatus(rs.getString(9));
				application.setDateOfInterview(rs.getDate(10));
			}
			return application;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public int applyOnline(Application app, int scheduledProgramId) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getConnection();

			// status and date of interview to be set afterwards by MAC...
			PreparedStatement stmt2 = conn.prepareStatement(registerApp);
			stmt2.setString(1, app.getFullName());
			stmt2.setDate(2, (Date) new java.sql.Date(app.getDateOfBirth().getTime()));
			stmt2.setString(3, app.getHighestQualification());
			stmt2.setDouble(4, app.getMarksObtained());
			stmt2.setString(5, app.getGoals());
			stmt2.setString(6, app.getMailId());
			stmt2.setInt(7, app.getScheduledProgramId());
			stmt2.setString(8, app.getStatus());
			stmt2.setDate(9, (Date) new java.sql.Date(app.getDateOfInterview().getTime()));
			stmt2.executeQuery();
			
			ResultSet rs1 = conn.createStatement().executeQuery(seqQuery);
			if(rs1.next()) {
				int applicationId = rs1.getInt(1);
				return applicationId;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
