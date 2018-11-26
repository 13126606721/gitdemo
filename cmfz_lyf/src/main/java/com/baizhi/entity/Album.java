package com.baizhi.entity;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Album {
	private Integer albumId;
	private String albumTitle;
	private String albumCover;
	private Integer albumCount;
	private String albumAuthor;
	private String albumBroadCast;
	@JSONField(format="yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date albumPublishDate;
	private String albumBrief;
	private String albumScore;
	private List<Chapter> children;
	public Integer getAlbumId() {
		return albumId;
	}
	public void setAlbumId(Integer albumId) {
		this.albumId = albumId;
	}
	public String getAlbumTitle() {
		return albumTitle;
	}
	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}
	public String getAlbumCover() {
		return albumCover;
	}
	public void setAlbumCover(String albumCover) {
		this.albumCover = albumCover;
	}
	public Integer getAlbumCount() {
		return albumCount;
	}
	public void setAlbumCount(Integer albumCount) {
		this.albumCount = albumCount;
	}
	public String getAlbumAuthor() {
		return albumAuthor;
	}
	public void setAlbumAuthor(String albumAuthor) {
		this.albumAuthor = albumAuthor;
	}
	public String getAlbumBroadCast() {
		return albumBroadCast;
	}
	public void setAlbumBroadCast(String albumBroadCast) {
		this.albumBroadCast = albumBroadCast;
	}
	public Date getAlbumPublishDate() {
		return albumPublishDate;
	}
	public void setAlbumPublishDate(Date albumPublishDate) {
		this.albumPublishDate = albumPublishDate;
	}
	public String getAlbumBrief() {
		return albumBrief;
	}
	public void setAlbumBrief(String albumBrief) {
		this.albumBrief = albumBrief;
	}
	public String getAlbumScore() {
		return albumScore;
	}
	public void setAlbumScore(String albumScore) {
		this.albumScore = albumScore;
	}
	public List<Chapter> getChildren() {
		return children;
	}
	public void setChildren(List<Chapter> children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "Album [albumId=" + albumId + ", albumTitle=" + albumTitle
				+ ", albumCover=" + albumCover + ", albumCount=" + albumCount
				+ ", albumAuthor=" + albumAuthor + ", albumBroadCast="
				+ albumBroadCast + ", albumPublishDate=" + albumPublishDate
				+ ", albumBrief=" + albumBrief + ", albumScore=" + albumScore
				+ ", children=" + children + "]";
	}
	public Album(Integer albumId, String albumTitle, String albumCover,
			Integer albumCount, String albumAuthor, String albumBroadCast,
			Date albumPublishDate, String albumBrief, String albumScore,
			List<Chapter> children) {
		super();
		this.albumId = albumId;
		this.albumTitle = albumTitle;
		this.albumCover = albumCover;
		this.albumCount = albumCount;
		this.albumAuthor = albumAuthor;
		this.albumBroadCast = albumBroadCast;
		this.albumPublishDate = albumPublishDate;
		this.albumBrief = albumBrief;
		this.albumScore = albumScore;
		this.children = children;
	}
	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
