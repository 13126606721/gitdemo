/*
Navicat Oracle Data Transfer
Oracle Client Version : 10 2 0 5 0

Source Server         : oracle
Source Server Version : 100200
Source Host           : 192 168 0 57:1521
Source Schema         :  

Target Server Type    : ORACLE
Target Server Version : 100200
File Encoding         : 65001

Date: 2018-11-11 09:46:53
*/


-- ----------------------------
-- Table structure for cmfz_article
-- ----------------------------
DROP TABLE      cmfz_article ;
CREATE TABLE cmfz_article  (
 articleId  Integer NOT NULL ,
 articleName  VARCHAR(30) ,
 articleAuthod  VARCHAR(30) ,
 articleCreateTime  DATE  ,
 articleImgPath  VARCHAR(50) ,
 articleFilePath  VARCHAR(50)  
)
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of cmfz_article
-- ----------------------------

-- ----------------------------
-- Table structure for cmfz_chapter
-- ----------------------------
DROP TABLE      cmfz_chapter ;
CREATE TABLE      cmfz_chapter  (
 chapterId  NUMBER NOT NULL ,
 chapterName  VARCHAR2(30 BYTE) NULL ,
 chapterPath  VARCHAR2(30 BYTE) NULL ,
 chapterCapacity  VARCHAR2(30 BYTE) NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of cmfz_chapter
-- ----------------------------

-- ----------------------------
-- Table structure for cmfz_counter
-- ----------------------------
DROP TABLE      cmfz_counter ;
CREATE TABLE      cmfz_counter  (
 counterId  NUMBER NOT NULL ,
 counterName  VARCHAR2(20 BYTE) NULL ,
 counterCount  VARCHAR2(20 BYTE) NULL ,
 counterUpdate  DATE NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

select counterId c_counterId,
				c.counterTitle   c_counterTitle,
				c.counterCount   c_counterCount,
				c.counterCreateTime   c_counterCreateTime,
				c1.courseTitle   c1_courseTitle,
				u.userName      u_userName
				from cmfz_counter c
				left join cmfz_course c1 on c.courseId=c1.courseId
				left join cmfz_user   u  on c.userId=u.userId

-- ----------------------------
-- Records of cmfz_counter
-- ----------------------------

-- ----------------------------
-- Table structure for cmfz_course
-- ----------------------------
DROP TABLE      cmfz_course ;
CREATE TABLE      cmfz_course  (
 courseId  NUMBER NOT NULL ,
 courseName  VARCHAR2(30 BYTE) NULL 
)
LOGGING
NOCOMPRESS
NOCACHE
select c.courseId  c_courseId,
				c.courseTitle  c_courseTitle,
				c.courseMarking  c_courseMarking,
				c.courseCreateTime  c_courseCreateTime,
				c.courseStatus    c_courseStatus,
				u.userName   u_userName
				from cmfz_course c
				left join cmfz_user u
				on c.userId=u.userId
;

-- ----------------------------
-- Records of cmfz_course
-- ----------------------------

-- ----------------------------
-- Table structure for cmfz_guru
-- ----------------------------
DROP TABLE      cmfz_guru ;
CREATE TABLE      cmfz_guru  (
 guruId  NUMBER NOT NULL ,
 guruName  VARCHAR2(20 BYTE) NULL ,
 ruruImgPath  VARCHAR2(50 BYTE) NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of cmfz_guru
-- ----------------------------

-- ----------------------------
-- Table structure for cmfz_img
-- ----------------------------
DROP TABLE cmfz_banner ;
CREATE TABLE cmfz_banner(
 bannerId  Integer  primary key,
 bannerName  VARCHAR2(20),
 bannerPath  VARCHAR2(50),
 bannerCreateTime date,
 bannerStatus Integer,
 userId   Integer,
 guruId   Integer,
 articleId   Integer,
 voiceId   Integer
);
insert into cmfz_img values(1,'a','d',1,null,null,null)
LOGGING
NOCOMPRESS
NOCACHE
select bannerId,bannerTitle,bannerPath,bannerStatus,bannerCreateTime from cmfz_banner
;

-- ----------------------------
-- Records of cmfz_img
-- ----------------------------

-- ----------------------------
-- Table structure for cmfz_manager
-- ----------------------------
DROP TABLE      cmfz_manager ;
CREATE TABLE      cmfz_manager  (
 managerId  NUMBER primary key,
 managerName  VARCHAR2(20) ,
 managerPassword  VARCHAR2(20)  
)
select * from cmfz_manager
create sequence seq_manager
insert into cmfz_manager values(seq_manager.nextval,'lyf','123456')
drop sequence seq_manager
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of cmfz_manager
-- ----------------------------

-- ----------------------------
-- Table structure for cmfz_user
-- ----------------------------
DROP TABLE      cmfz_user ;
CREATE TABLE      cmfz_user  (
 userId  NUMBER NOT NULL ,
 userReligiousName  VARCHAR2(20 BYTE) NULL ,
 userName  VARCHAR2(20 BYTE) NULL ,
 userImgPath  VARCHAR2(50 BYTE) NULL ,
 userSex  VARCHAR2(10 BYTE) NULL ,
 userSignature  VARCHAR2(50 BYTE) NULL ,
 addressId  NUMBER NULL ,
 userPassword  VARCHAR2(20 BYTE) NULL ,
 userGuru  VARCHAR2(20 BYTE) NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of cmfz_user
-- ----------------------------

-- ----------------------------
-- Table structure for cmfz_voice
-- ----------------------------
DROP TABLE      cmfz_voice ;
CREATE TABLE      cmfz_voice  (
 voiceId  NUMBER NOT NULL ,
 voiceName  VARCHAR2(20 BYTE) NULL ,
 voiceAuthor  VARCHAR2(20 BYTE) NULL ,
 voiceAnnouncer  VARCHAR2(20 BYTE) NULL ,
 voiceCreateTime  DATE NULL ,
 voiceImgPath  VARCHAR2(50 BYTE) NULL ,
 voiceFilePath  VARCHAR2(50 BYTE) NULL 
)
select a.albumId  a_albumId,
				a.albumTitle    a_albumTitle,
				a.albumCover    a_albumCover,
				a.albumCount    a_albumCount,
				a.albumAuthor    a_albumAuthor,
				a.albumBroadCast    a_albumBroadCast,
				a.albumPublishDate   a_albumPublishDate,
				a.albumBrief      a_albumBrief,
				a.albumScore    a_albumScore,
				c.chapterId    c_chapterId,
				c.chapterTitle   c_chapterTitle,
				c.chapterSize   c_chapterSize,
				c.chapterDuration   c_chapterDuration,
				c.chapterDownloadPath  c_chapterDownloadPath,
				c.chapterUploadDate   c_chapterUploadDate
			from cmfz_album a 
			left join cmfz_chapter c
			on a.albumId =c.albumId	



LOGGING
NOCOMPRESS
NOCACHE

;
drop table cmfz_category
create table cmfz_category(
	categoryId   Integer primary key,
	categoryName  varchar2(50),
	categoryUrl   varchar2(100),
	parentId   Integer
);
select 
				c.categoryId  c_categoryId,
				c.categoryName  c_categoryName,
				c.categoryUrl   c_categoryUrl,
				cc.categoryId  cc_categoryId,
				cc.categoryName  cc_categoryName,
				cc.categoryUrl   cc_categoryUrl
				from cmfz_category  c
				inner join cmfz_category cc
				on c.categoryid=cc.parentId
insert into cmfz_category values(1,'主页','/cmfz_lyf/zhuye.jsp',0);
insert into cmfz_category values(2,'轮播图管理','/cmfz_lyf/imgmain.jsp',0);
insert into cmfz_category values(3,'轮播图上传','/cmfz_lyf/imgregister.jsp',2);
insert into cmfz_category values(4,'轮播图修改','/cmfz_lyf/imgupdate.jsp',2);
insert into cmfz_category values(5,'轮播图删除','/cmfz_lyf/imgdelete.jsp',2);

insert into cmfz_category values(6,'吉祥妙音','/cmfz_lyf/jixiang.jsp',0);
insert into cmfz_category values(7,'专辑的发布','/cmfz_lyf/jixiangregister.jsp',6);
insert into cmfz_category values(8,'专辑的删除','/cmfz_lyf/jixiangdelete.jsp',6);
insert into cmfz_category values(9,'音频的添加','/cmfz_lyf/voiceinsert.jsp',6);

insert into cmfz_category values(10,'功课管理','/cmfz_lyf/source.jsp',0);
insert into cmfz_category values(11,'必修课的添加','/cmfz_lyf/sourceinsert.jsp',10);
insert into cmfz_category values(12,'必修课的删除','/cmfz_lyf/sourcedelete.jsp',10);
insert into cmfz_category values(13,'自定义功课的查询','/cmfz_lyf/sourceselect.jsp',10);
insert into cmfz_category values(14,'计数器的查询','/cmfz_lyf/counter.jsp',10);

insert into cmfz_category values(15,'个人中心','/cmfz_lyf/user.jsp',0);
insert into cmfz_category values(16,'用户的查询','/cmfz_lyf/userselect.jsp',15);
insert into cmfz_category values(17,'用户的冻结','/cmfz_lyf/userupdate.jsp',15);

insert into cmfz_category values(18,'上师管理','/cmfz_lyf/guru.jsp',0);
insert into cmfz_category values(19,'上师添加','/cmfz_lyf/gururegister.jsp',18);
insert into cmfz_category values(20,'上师的冻结','/cmfz_lyf/guruupdate.jsp',18);

-- ----------------------------
-- Records of cmfz_voice
-- ----------------------------

-- ----------------------------
-- Indexes structure for table cmfz_article
-- ----------------------------

-- ----------------------------
-- Checks structure for table cmfz_article
-- ----------------------------
ALTER TABLE      cmfz_article  ADD CHECK ( articleId  IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table cmfz_article
-- ----------------------------
ALTER TABLE      cmfz_article  ADD PRIMARY KEY ( articleId );

-- ----------------------------
-- Indexes structure for table cmfz_chapter
-- ----------------------------

-- ----------------------------
-- Checks structure for table cmfz_chapter
-- ----------------------------
ALTER TABLE      cmfz_chapter  ADD CHECK ( chapterId  IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table cmfz_chapter
-- ----------------------------
ALTER TABLE      cmfz_chapter  ADD PRIMARY KEY ( chapterId );

-- ----------------------------
-- Indexes structure for table cmfz_counter
-- ----------------------------

-- ----------------------------
-- Checks structure for table cmfz_counter
-- ----------------------------
ALTER TABLE      cmfz_counter  ADD CHECK ( counterId  IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table cmfz_counter
-- ----------------------------
ALTER TABLE      cmfz_counter  ADD PRIMARY KEY ( counterId );

-- ----------------------------
-- Indexes structure for table cmfz_course
-- ----------------------------

-- ----------------------------
-- Checks structure for table cmfz_course
-- ----------------------------
ALTER TABLE      cmfz_course  ADD CHECK ( courseId  IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table cmfz_course
-- ----------------------------
ALTER TABLE      cmfz_course  ADD PRIMARY KEY ( courseId );

-- ----------------------------
-- Checks structure for table cmfz_guru
-- ----------------------------
ALTER TABLE      cmfz_guru  ADD CHECK ( guruId  IS NOT NULL);

-- ----------------------------
-- Indexes structure for table cmfz_img
-- ----------------------------

-- ----------------------------
-- Checks structure for table cmfz_img
-- ----------------------------
ALTER TABLE      cmfz_img  ADD CHECK ( id  IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table cmfz_img
-- ----------------------------
ALTER TABLE      cmfz_img  ADD PRIMARY KEY ( id );

-- ----------------------------
-- Indexes structure for table cmfz_manager
-- ----------------------------

-- ----------------------------
-- Checks structure for table cmfz_manager
-- ----------------------------
ALTER TABLE      cmfz_manager  ADD CHECK ( managerId  IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table cmfz_manager
-- ----------------------------
ALTER TABLE      cmfz_manager  ADD PRIMARY KEY ( managerId );

-- ----------------------------
-- Indexes structure for table cmfz_user
-- ----------------------------

-- ----------------------------
-- Checks structure for table cmfz_user
-- ----------------------------
ALTER TABLE      cmfz_user  ADD CHECK ( userId  IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table cmfz_user
-- ----------------------------
ALTER TABLE      cmfz_user  ADD PRIMARY KEY ( userId );

-- ----------------------------
-- Indexes structure for table cmfz_voice
-- ----------------------------

-- ----------------------------
-- Checks structure for table cmfz_voice
-- ----------------------------
ALTER TABLE      cmfz_voice  ADD CHECK ( voiceId  IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table cmfz_voice
-- ----------------------------
ALTER TABLE      cmfz_voice  ADD PRIMARY KEY ( voiceId );
