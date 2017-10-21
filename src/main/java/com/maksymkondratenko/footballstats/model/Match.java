package com.maksymkondratenko.footballstats.model;

public class Match {
	private Club homeClub;
	private Club awayClub;
	private int homeScore;
	private int awayScore;
	private String date;
	
	public Match() {
		
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
		this.homeClub = homeClub;
	}
	public Club getAwayClub() {
		return awayClub;
	}
	public void setAwayClub(Club awayClub) {
		this.awayClub = awayClub;
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
