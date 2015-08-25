/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2008-4-11 22:08:33                           */
/*==============================================================*/



/*==============================================================*/
/* Table: user           								       */
/*==============================================================*/
create table user
(
   id                   bigint not null auto_increment,  
   username             varchar(64),
   password             varchar(64),
   fullname             varchar(64),
   pingyin_name			varchar(64),
   birthday             datetime,
   qq                   varchar(64),
   msn                  varchar(64),
   email                varchar(64),
   telephone            varchar(64),
   admin                tinyint,
   valid                tinyint,   
   LastIp               varchar(64),
   imageId				bigint,   
   created_by           bigint,
   created_date         datetime,
   updated_by           bigint,
   updated_date         datetime,
   deleted              tinyint,
   primary key (id)
);

/*==============================================================*/
/* Table: news                                                  */
/*==============================================================*/
create table news
(
   id               	bigint not null auto_increment,  
   categoryId       	bigint,
   title            	varchar(128),
   content         	 	text,
   keyword				varchar(512),
   isOpen           	tinyint,
   reprint           	varchar(256),
   reprintAddress    	varchar(256),
   count            	int,
   created_by           bigint,
   created_date         datetime,
   updated_by           bigint,
   updated_date         datetime,
   deleted              tinyint,
   primary key (id)
);

/*==============================================================*/
/* Table: news_category                                         */
/*==============================================================*/
create table news_category
(
   id                   bigint not null auto_increment,  
   name     varchar(128),
   remark   text,
   father		 bigint,
   created_by           bigint,
   created_date         datetime,
   updated_by           bigint,
   updated_date         datetime,
   deleted              tinyint,
   primary key (id)
);



/*==============================================================*/
/* Table: attachment                                            */
/*==============================================================*/
create table attachment
(
   id                   bigint not null auto_increment,  
   newsId               bigint, 
   name       			varchar(64),  
   size      				 float,
   number			     int,
   path       			varchar(256),
   ext						varchar(32),
   created_by           bigint,
   created_date         datetime,
   updated_by           bigint,
   updated_date         datetime,
   deleted              tinyint,
   primary key (id)
);



/*==============================================================*/
/* Table: City                                                  */
/*==============================================================*/
/*create table City
/*(
/*   Cid                  smallint,
/*   CityID               varchar(6),
/*   City                 varchar(32),
 /*  father               varchar(6)
/*);


/*==============================================================*/
/* Table: comment                                               */
/*==============================================================*/
create table comment
(
   id                   bigint not null auto_increment,  
   newsId            	bigint,    
   content       		text,
   number       	 	int,
   comment_ip			varchar(128),   
   created_by           bigint, 
   created_date			datetime, 
   updated_by           bigint,
   updated_date         datetime,
   deleted              tinyint,
   primary key (id)
);

/*==============================================================*/
/* Table: revert                                                */
/*==============================================================*/
create table revert
(
   id                   bigint not null auto_increment,   
   newsId				bigint, 
   commentId            bigint,   
   content        		text,
   number         		int,
   revert_Ip			varchar(128),   
   created_by           bigint, 
   created_date			datetime,  
   updated_by           bigint,
   updated_date         datetime,
   deleted              tinyint,
   primary key (id)
);


/*==============================================================*/
/* Table: friends_links                                         */
/*==============================================================*/
create table friends_links
(
   id                   bigint not null auto_increment,    
   name            		varchar(64),
   path            		varchar(512),
   remark          		varchar(512),
   created_by           bigint,
   created_date         datetime,
   updated_by           bigint,
   updated_date         datetime,
   deleted              tinyint,
   primary key (id)
);

/*==============================================================*/
/* Table: image                                                 */
/*==============================================================*/
create table image
(
   id                   bigint not null auto_increment,     
   number          		int,
   name            		varchar(128),
   saveName        		varchar(128),   
   path            		varchar(256),
   ext					varchar(32),
   remark          		varchar(512),
   created_by           bigint,
   created_date         datetime,
   updated_by           bigint,
   updated_date         datetime,
   deleted              tinyint,
   primary key (id)
);
/*==============================================================*/
/* Table: mail                                    update 2008.9.15  mail*/
/*==============================================================*/
create table mail
(
	id				bigint not null auto_increment primary key,  
	title			varchar(512),
	content			text,
	sendDate		datetime,	
	created_by		bigint,
	created_date	datetime,
	updated_by		bigint,
	updated_date	datetime,
	deleted			tinyint
   
);
create table user_mail
(
	 id                   bigint not null auto_increment,   
	useId           bigint,
	mailId		bigint,
	primary key (id)
);
/*==============================================================*/
/* Table: leaveWord                                             */
/*==============================================================*/
create table leaveWord
(
   id                   bigint not null auto_increment,   
   userId        		varchar(32),
   content         		varchar(512),   
   isOpen          		tinyint,
   isRead          		tinyint,
   number          		int,
   count           		int,
   created_by           bigint,
   created_date         datetime,
   updated_by           bigint,
   updated_date         datetime,
   deleted              tinyint,
   primary key (id)
);




/*==============================================================*/
/* Table: photo                                                 */
/*==============================================================*/
create table photo
(
   id                 bigint not null auto_increment,  
   boxId           bigint,
   name            varchar(512),  
   photoPath        varchar(512),
   remark          text,
   created_by           bigint,
   created_date         datetime,
   updated_by           bigint,
   updated_date         datetime,
   deleted              tinyint,
   primary key (id)
);

/*==============================================================*/
/* Table: photoBox                                              */
/*==============================================================*/
create table photoBox
(
   id                   bigint not null auto_increment,    
   number       		int,
   name         		varchar(512),
   isOpen       		tinyint,
   remark       		text,
   created_by           bigint,
   created_date         datetime,
   updated_by           bigint,
   updated_date         datetime,
   deleted              tinyint,
   primary key (id)
);

/*==============================================================*/
/* Table: privilege                    update PrivilegeName by bigint to varchar(32)         */
/*==============================================================*/
create table privilege
(
   id                   bigint not null auto_increment,  
   privilegeValue       bigint,
   privilegeName        varchar(32),
   privilegeRemark      text,
   primary key (id)
);

/*==============================================================*/
/* Table: user_privilege                                        */
/*==============================================================*/
create table user_privilege
(
   id                   bigint not null auto_increment,  
   privilegeId          bigint,
   userId           	bigint,
   primary key (id)
);

create table stat
(
	id                 bigint not null auto_increment primary key,
	count		       bigint,
	accessDate	       date
);

create table `function`
(
	id 					bigint not null auto_increment,
	pos				int,
	module 		varchar(64),
	name			varchar(64),
	lable				varchar(128),
	path				int(11),
	userData		varchar(128),
	primary key(id)
);

create table `fun_path_desc`
(
	id				bigint not null auto_increment,
	path			int,
	url				varchar(512),
	`desc	`		varchar(512),
	module		varchar(64),
	name		varchar(64),
	primary key (id)	
);


