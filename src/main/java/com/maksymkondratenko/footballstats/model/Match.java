package com.maksymkondratenko.footballstats.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Match {
	
	@NotNull(message="{home-name.empty.error}")
	private Club homeClub;
	
	@NotNull(message="{away-name.empty.error}")
	private Club awayClub;
	
	@Min(value=0, message="{score.min.error}") 
	@Max(value=20, message="{score.max.error}")
	private int homeScore;
	
	@Min(value=0, message="{score.min.error}") 
	@Max(value=20, message="{score.max.error}")
	private int awayScore;
	
	private String date;
	
	public Match() {
		
	}
	public Match(Club homeClub, Club awayClub, int homeScore, int awayScore) {
		this.setHomeClub(homeClub);
		this.setAwayClub(awayClub);
		this.setHomeScore(homeScore);
		this.setAwayScore(awayScore);
	}
	public Match(Club homeClub, Club awayClub, int homeScore, int awayScore, String date) {
		this.setHomeClub(homeClub);
		this.setAwayClub(awayClub);
		this.setHomeScore(homeScore);
		this.setAwayScore(awayScore);
		this.setDate(date);
	}
	public Club getHomeClub() {
		return homeClub;
	}
	public void setHomeClub(Club homeClub) {
		if(homeClub.getName().trim().equals("")) {
			this.homeClub = null;
		} else {
			this.homeClub = homeClub;
		}
	}
	public Club getAwayClub() {
		return awayClub;
	}
	public void setAwayClub(Club awayClub) {
		if(awayClub.getName().trim().equals("")) {
			this.awayClub = null;
		} else {
			this.awayClub = awayClub;
		}
	}
	public int getHomeScore() {
		return homeScore;
	}
	public void setHomeScore(int homeScore) {
		this.homeScore = homeScore;
	}
	public int getAwayScore() {
		return awayScore;
	}
	public void setAwayScore(int awayScore) {
		this.awayScore = awayScore;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
