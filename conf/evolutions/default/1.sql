# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table gam (
  id                        bigint auto_increment not null,
  foracid                   varchar(255),
  schm_type                 varchar(255),
  schm_code                 varchar(255),
  freeze_status             varchar(255),
  date_of_freeze            varchar(255),
  close_status              varchar(255),
  date_of_closure           varchar(255),
  date_of_opening           varchar(255),
  eff_acct_balance          varchar(255),
  acct_balance              varchar(255),
  constraint uq_gam_foracid unique (foracid),
  constraint pk_gam primary key (id))
;

create table gcm (
  id                        bigint auto_increment not null,
  bvn                       varchar(255),
  cust_name                 varchar(255),
  email                     varchar(255),
  address                   varchar(255),
  dob                       timestamp,
  phone                     varchar(255),
  constraint uq_gcm_bvn unique (bvn),
  constraint pk_gcm primary key (id))
;

create table gtd (
  id                        bigint not null,
  part_tran_type            varchar(255),
  value_date                timestamp,
  amount                    double,
  currency                  varchar(255),
  tran_details              varchar(255),
  constraint pk_gtd primary key (id))
;

create table gum (
  id                        bigint auto_increment not null,
  user_name                 varchar(255),
  role_id                   varchar(255),
  password                  varchar(255),
  constraint uq_gum_user_name unique (user_name),
  constraint uq_gum_1 unique (user_name),
  constraint pk_gum primary key (id))
;

create sequence gtd_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists gam;

drop table if exists gcm;

drop table if exists gtd;

drop table if exists gum;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists gtd_seq;

