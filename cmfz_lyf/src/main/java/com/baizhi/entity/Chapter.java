package com.baizhi.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Chapter {
	@JSONField(name="albumId")
	private Integer chapterId;
	@JSONField(name="albumTitle")
	private String chapterTitle;
	private String chapterSize;
	private String chapterDuration;
	private String chapterDownloadPath;
	@JSONField(format="yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date chapterUploadDate;
	private Album album;
	public Integer getChapterId() {
		return chapterId;
	}
	public void setChapterId(Integer chapterId) {
		this.chapterId = chapterId;
	}
	public String getChapterTitle() {
		return chapterTitle;
	}
	public void setChapterTitle(String chapterTitle) {
		this.chapterTitle = chapterTitle;
	}
	public String getChapterSize() {
		return chapterSize;
	}
	public void setChapterSize(String chapterSize) {
		this.chapterSize = chapterSize;
	}
	public String getChapterDuration() {
		return chapterDuration;
	}
	public void setChapterDuration(String chapterDuration) {
		this.chapterDuration = chapterDuration;
	}
	public String getChapterDownloadPath() {
		return chapterDownloadPath;
	}
	public void setChapterDownloadPath(String chapterDownloadPath) {
		this.chapterDownloadPath = chapterDownloadPath;
	}
	public Date getChapterUploadDate() {
		return chapterUploadDate;
	}
	public void setChapterUploadDate(Date chapterUploadDate) {
		this.chapterUploadDate = chapterUploadDate;
	}
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	@Override
	public String toString() {
		return "Chapter [chapterId=" + chapterId + ", chapterTitle="
				+ chapterTitle + ", chapterSize=" + chapterSize
				+ ", chapterDuration=" + chapterDuration
				+ ", chapterDownloadPath=" + chapterDownloadPath
				+ ", chapterUploadDate=" + chapterUploadDate + ", album="
				+ album + "]";
	}
	public Chapter(Integer chapterId, String chapterTitle, String chapterSize,
			String chapterDuration, String chapterDownloadPath,
			Date chapterUploadDate, Album album) {
		super();
		this.chapterId = chapterId;
		this.chapterTitle = chapterTitle;
		this.chapterSize = chapterSize;
		this.chapterDuration = chapterDuration;
		this.chapterDownloadPath = chapterDownloadPath;
		this.chapterUploadDate = chapterUploadDate;
		this.album = album;
	}
	public Chapter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
