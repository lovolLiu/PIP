package com.pip.action;

import java.util.List;

import com.pip.domain.ProjectScore;
import com.pip.domain.Student;
import com.pip.service.IProjectDetailService;
import com.pip.service.ITeamService;

public class ShowTeamDetailAction {
	//IOC Service
	ITeamService teamService;
	IProjectDetailService projectScoreService;
	
	//in
	Integer teamID;
	
	//out
	List<Student> teamMemberList;
	List<ProjectScore> projectScoreList;
	
	public  String execute(){
		teamMemberList = teamService.showStudentByTeamID(teamID);
		Integer projectID = teamService.seleteTeam(teamID).getProjectID();
		projectScoreList = projectScoreService.showProjectDetailListByProjectID(projectID);
		return "success";
	}


	public ITeamService getTeamService() {
		return teamService;
	}


	public void setTeamService(ITeamService teamService) {
		this.teamService = teamService;
	}


	public Integer getTeamID() {
		return teamID;
	}


	public void setTeamID(Integer teamID) {
		this.teamID = teamID;
	}


	public List<Student> getTeamMemberList() {
		return teamMemberList;
	}


	public void setTeamMemberList(List<Student> teamMemberList) {
		this.teamMemberList = teamMemberList;
	}


	public IProjectDetailService getProjectScoreService() {
		return projectScoreService;
	}


	public void setProjectScoreService(IProjectDetailService projectScoreService) {
		this.projectScoreService = projectScoreService;
	}


	public List<ProjectScore> getProjectScoreList() {
		return projectScoreList;
	}


	public void setProjectScoreList(List<ProjectScore> projectScoreList) {
		this.projectScoreList = projectScoreList;
	}
	
	
	
}
