package com.pip.service.impl;

import java.util.List;

import com.pip.dao.impl.StudentDAOImpl;
import com.pip.dao.impl.TeamDAOImpl;
import com.pip.domain.Student;
import com.pip.domain.Team;
import com.pip.service.TeamService;

public class TeamServiceImpl implements TeamService {

	//IOC Service
	TeamDAOImpl teamDAO;
	StudentDAOImpl studentDAO;
	
	@Override
	public Integer insertTeam(Team team) {
		return (Integer)teamDAO.save(team);
	}

	@Override
	public void deleteTeam(Integer teamID) {
		teamDAO.delete(teamDAO.findTeamById(teamID));
	}

	@Override
	public void updateTeam(Team team) {
		teamDAO.update(team);
	}

	@Override
	public Team seleteTeam(Integer id) {
		return teamDAO.findTeamById(id);
	}

	@Override
	public List<Team> showTeamList() {
		return teamDAO.findAll();
	}

	@Override
	public List<Student> showStudentByTeamID(Integer teamID) {
		return studentDAO.findStudentByTeamID(teamID);
	}

}
