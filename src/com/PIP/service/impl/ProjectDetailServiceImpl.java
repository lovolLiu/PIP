package com.pip.service.impl;

import java.util.List;

import com.pip.dao.IProjectScoreDAO;
import com.pip.dao.impl.ProjectScoreDAOImpl;
import com.pip.domain.ProjectScore;
import com.pip.service.ProjectDetailService;

public class ProjectDetailServiceImpl implements ProjectDetailService {

	//IOC DAO
	ProjectScoreDAOImpl projectScoreDAO;
	
	
	@Override
	public List<ProjectScore> showProjectDetailList() {
		return projectScoreDAO.findAll();
	}

	@Override
	public void updateProjectDetail(ProjectScore projectScore) {
		projectScoreDAO.update(projectScore);
	}

}
