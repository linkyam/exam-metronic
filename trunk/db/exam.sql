/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016/1/27 17:09:34                           */
/*==============================================================*/


drop table if exists t_paper_blank_filling;

drop table if exists t_paper_multiplc_choice;

drop table if exists t_paper_one_choice;

drop table if exists t_paper_simple_answer;

drop table if exists t_paper_true_false;

drop table if exists t_question_blank_filling;

drop table if exists t_question_multiplc_choice;

drop table if exists t_question_one_choice;

drop table if exists t_question_simple_answer;

drop table if exists t_question_true_false;

drop table if exists t_sch_class;

drop table if exists t_sch_class_teacher;

drop table if exists t_sch_colleges;

drop table if exists t_sch_course;

drop table if exists t_sch_speciality;

drop table if exists t_sch_speciality_sourse;

drop table if exists t_sch_speyears;

drop table if exists t_sys_user;

drop table if exists t_test_paper;

drop table if exists t_user_student;

drop table if exists t_user_teacher;

/*==============================================================*/
/* Table: t_paper_blank_filling                                 */
/*==============================================================*/
create table t_paper_blank_filling
(
   question_id          int not null auto_increment comment '主键ID',
   paper_id             int,
   question_no          varchar(36) comment '题目编号',
   title                varchar(2000) comment '题干',
   option_1             varchar(1000) comment '选项1',
   option_2             varchar(1000) comment '选项2',
   option_3             varchar(1000) comment '选项3',
   option_4             varchar(1000) comment '选项4',
   option_5             varchar(1000) comment '选项5',
   option_6             varchar(1000) comment '选项6',
   option_7             varchar(1000) comment '选项7',
   option_8             varchar(1000) comment '选项8',
   correct_answe        varchar(30) comment '正确答案',
   score                double(5,2) comment '分值',
   file_path            varchar(300) comment '资源路径',
   sign                 varchar(30) comment '标记',
   primary key (question_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_paper_blank_filling comment '题库-填空题';

/*==============================================================*/
/* Table: t_paper_multiplc_choice                               */
/*==============================================================*/
create table t_paper_multiplc_choice
(
   question_id          int not null auto_increment comment '主键ID',
   paper_id             int,
   question_no          varchar(36) comment '题目编号',
   title                varchar(2000) comment '题干',
   option_1             varchar(1000) comment '选项1',
   option_2             varchar(1000) comment '选项2',
   option_3             varchar(1000) comment '选项3',
   option_4             varchar(1000) comment '选项4',
   option_5             varchar(1000) comment '选项5',
   option_6             varchar(1000) comment '选项6',
   option_7             varchar(1000) comment '选项7',
   option_8             varchar(1000) comment '选项8',
   correct_answe        varchar(30) comment '正确答案',
   score                double(5,2) comment '分值',
   file_path            varchar(300) comment '资源路径',
   sign                 varchar(30) comment '标记',
   primary key (question_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_paper_multiplc_choice comment '题库-不定项选择题';

/*==============================================================*/
/* Table: t_paper_one_choice                                    */
/*==============================================================*/
create table t_paper_one_choice
(
   question_id          int not null auto_increment comment '主键ID',
   paper_id             int,
   question_no          varchar(36) comment '题目编号',
   title                varchar(2000) comment '题干',
   option_1             varchar(1000) comment '选项1',
   option_2             varchar(1000) comment '选项2',
   option_3             varchar(1000) comment '选项3',
   option_4             varchar(1000) comment '选项4',
   option_5             varchar(1000) comment '选项5',
   option_6             varchar(1000) comment '选项6',
   option_7             varchar(1000) comment '选项7',
   option_8             varchar(1000) comment '选项8',
   correct_answe        varchar(30) comment '正确答案',
   score                double(5,2) comment '分值',
   file_path            varchar(300) comment '资源路径',
   sign                 varchar(30) comment '标记',
   primary key (question_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_paper_one_choice comment '题库-单项选择题';

/*==============================================================*/
/* Table: t_paper_simple_answer                                 */
/*==============================================================*/
create table t_paper_simple_answer
(
   question_id          int not null auto_increment comment '主键ID',
   paper_id             int,
   question_no          varchar(36) comment '题目编号',
   title                varchar(2000) comment '题干',
   correct_answe        varchar(3000) comment '正确答案',
   difficulty           int(1) comment '难易度',
   score                double(5,2) comment '分值',
   file_path            varchar(300) comment '资源路径',
   sign                 varchar(30) comment '标记',
   primary key (question_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_paper_simple_answer comment '题库-简答题';

/*==============================================================*/
/* Table: t_paper_true_false                                    */
/*==============================================================*/
create table t_paper_true_false
(
   question_id          int not null auto_increment comment '主键ID',
   paper_id             int,
   question_no          varchar(36) comment '题目编号',
   title                varchar(2000) comment '题干',
   option_1             varchar(1000) comment '选项1',
   option_2             varchar(1000) comment '选项2',
   option_3             varchar(1000) comment '选项3',
   option_4             varchar(1000) comment '选项4',
   option_5             varchar(1000) comment '选项5',
   option_6             varchar(1000) comment '选项6',
   option_7             varchar(1000) comment '选项7',
   option_8             varchar(1000) comment '选项8',
   correct_answe        varchar(30) comment '正确答案',
   score                double(5,2) comment '分值',
   file_path            varchar(300) comment '资源路径',
   sign                 varchar(30) comment '标记',
   primary key (question_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_paper_true_false comment '题库-判断题';

/*==============================================================*/
/* Table: t_question_blank_filling                              */
/*==============================================================*/
create table t_question_blank_filling
(
   question_id          int not null auto_increment comment '主键ID',
   course_id            int,
   question_no          varchar(36) comment '题目编号',
   title                varchar(2000) comment '题干',
   option_1             varchar(1000) comment '选项1',
   option_2             varchar(1000) comment '选项2',
   option_3             varchar(1000) comment '选项3',
   option_4             varchar(1000) comment '选项4',
   option_5             varchar(1000) comment '选项5',
   option_6             varchar(1000) comment '选项6',
   option_7             varchar(1000) comment '选项7',
   option_8             varchar(1000) comment '选项8',
   correct_answe        varchar(30) comment '正确答案',
   difficulty           int(1) comment '难易度',
   score                double(5,2) comment '分值',
   file_path            varchar(300) comment '资源路径',
   sign                 varchar(30) comment '标记',
   remark               varchar(300) comment '备注',
   level                varchar(30) comment '适用层次',
   primary key (question_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_question_blank_filling comment '题库-填空题';

/*==============================================================*/
/* Table: t_question_multiplc_choice                            */
/*==============================================================*/
create table t_question_multiplc_choice
(
   question_id          int not null auto_increment comment '主键ID',
   course_id            int,
   question_no          varchar(36) comment '题目编号',
   title                varchar(2000) comment '题干',
   option_1             varchar(1000) comment '选项1',
   option_2             varchar(1000) comment '选项2',
   option_3             varchar(1000) comment '选项3',
   option_4             varchar(1000) comment '选项4',
   option_5             varchar(1000) comment '选项5',
   option_6             varchar(1000) comment '选项6',
   option_7             varchar(1000) comment '选项7',
   option_8             varchar(1000) comment '选项8',
   correct_answe        varchar(30) comment '正确答案',
   difficulty           int(1) comment '难易度',
   score                double(5,2) comment '分值',
   file_path            varchar(300) comment '资源路径',
   sign                 varchar(30) comment '标记',
   remark               varchar(300) comment '备注',
   level                varchar(30) comment '适用层次',
   primary key (question_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_question_multiplc_choice comment '题库-不定项选择题';

/*==============================================================*/
/* Table: t_question_one_choice                                 */
/*==============================================================*/
create table t_question_one_choice
(
   question_id          int not null auto_increment comment '主键ID',
   course_id            int,
   question_no          varchar(36) comment '题目编号',
   title                varchar(2000) comment '题干',
   option_1             varchar(1000) comment '选项1',
   option_2             varchar(1000) comment '选项2',
   option_3             varchar(1000) comment '选项3',
   option_4             varchar(1000) comment '选项4',
   option_5             varchar(1000) comment '选项5',
   option_6             varchar(1000) comment '选项6',
   option_7             varchar(1000) comment '选项7',
   option_8             varchar(1000) comment '选项8',
   correct_answe        varchar(30) comment '正确答案',
   difficulty           int(1) comment '难易度',
   score                double(5,2) comment '分值',
   file_path            varchar(300) comment '资源路径',
   sign                 varchar(30) comment '标记',
   remark               varchar(300) comment '备注',
   level                varchar(30) comment '适用层次',
   primary key (question_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_question_one_choice comment '题库-单项选择题';

/*==============================================================*/
/* Table: t_question_simple_answer                              */
/*==============================================================*/
create table t_question_simple_answer
(
   question_id          int not null auto_increment comment '主键ID',
   course_id            int,
   question_no          varchar(36) comment '题目编号',
   title                varchar(2000) comment '题干',
   correct_answe        varchar(3000) comment '正确答案',
   difficulty           int(1) comment '难易度',
   score                double(5,2) comment '分值',
   file_path            varchar(300) comment '资源路径',
   sign                 varchar(30) comment '标记',
   remark               varchar(300) comment '备注',
   level                varchar(30) comment '适用层次',
   primary key (question_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_question_simple_answer comment '题库-简答题';

/*==============================================================*/
/* Table: t_question_true_false                                 */
/*==============================================================*/
create table t_question_true_false
(
   question_id          int not null auto_increment comment '主键ID',
   course_id            int,
   question_no          varchar(36) comment '题目编号',
   title                varchar(2000) comment '题干',
   option_1             varchar(1000) comment '选项1',
   option_2             varchar(1000) comment '选项2',
   option_3             varchar(1000) comment '选项3',
   option_4             varchar(1000) comment '选项4',
   option_5             varchar(1000) comment '选项5',
   option_6             varchar(1000) comment '选项6',
   option_7             varchar(1000) comment '选项7',
   option_8             varchar(1000) comment '选项8',
   correct_answe        varchar(30) comment '正确答案',
   difficulty           int(1) comment '难易度',
   score                double(5,2) comment '分值',
   file_path            varchar(300) comment '资源路径',
   sign                 varchar(30) comment '标记',
   remark               varchar(300) comment '备注',
   level                varchar(30) comment '适用层次',
   primary key (question_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_question_true_false comment '题库-判断题';

/*==============================================================*/
/* Table: t_sch_class                                           */
/*==============================================================*/
create table t_sch_class
(
   class_id             int not null auto_increment,
   speciality_id        int,
   class_name           varchar(100) comment '班级名称',
   student_count        int(3) default 0 comment '学生人数',
   primary key (class_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_sch_class comment '班级表';

/*==============================================================*/
/* Table: t_sch_class_teacher                                   */
/*==============================================================*/
create table t_sch_class_teacher
(
   class_id             int,
   teacher_id           int,
   course_id            int,
   duty                 varchar(100) comment '老师在班级中的身份',
   status               int(1) default 1 comment '状态'
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_sch_class_teacher comment '班级老师课程关系表';

/*==============================================================*/
/* Table: t_sch_colleges                                        */
/*==============================================================*/
create table t_sch_colleges
(
   college_id           int not null auto_increment,
   college_name         varchar(200),
   primary key (college_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_sch_colleges comment '学院表';

/*==============================================================*/
/* Table: t_sch_course                                          */
/*==============================================================*/
create table t_sch_course
(
   course_id            int not null auto_increment,
   course_name          varchar(100) comment '课程名称',
   is_public            int(1) default 0 comment '是否公共课 0 公共课 1专业课',
   is_major             int(1) default 0 comment '是否辅修课 0 辅修 1主修',
   is_optional          int(1) default 0 comment '是否选修     0选修  1必修',
   one_choice_totle     int(8) default 0 comment '单选选择题总数',
   multiplc_choice_totle int(8) default 0 comment '不定项选择题总数',
   true_false_totle     int(8) default 0 comment '判断题总数',
   blank_filling_totle  int(8) default 0 comment '填空题总数',
   simple_anser_totle   int(8) default 0 comment '简答题总数',
   primary key (course_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_sch_course comment '课程表';

/*==============================================================*/
/* Table: t_sch_speciality                                      */
/*==============================================================*/
create table t_sch_speciality
(
   speciality_id        int not null auto_increment,
   college_id           int,
   speyears_id          int,
   speciality_name      varchar(100) comment '专业名称',
   primary key (speciality_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_sch_speciality comment '专业表';

/*==============================================================*/
/* Table: t_sch_speciality_sourse                               */
/*==============================================================*/
create table t_sch_speciality_sourse
(
   speciality_id        int,
   course_id            int
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_sch_speciality_sourse comment '专业课程';

/*==============================================================*/
/* Table: t_sch_speyears                                        */
/*==============================================================*/
create table t_sch_speyears
(
   speyears_id          int not null auto_increment,
   speyears_name        varchar(100) comment '学制名称',
   speyears_years       int(4) comment '时间 单位"年"',
   primary key (speyears_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_sch_speyears comment '学制表';

/*==============================================================*/
/* Table: t_sys_user                                            */
/*==============================================================*/
create table t_sys_user
(
   user_id              int not null auto_increment comment 'id自增',
   user_name            varchar(100) comment '姓名',
   cell_phone           varchar(100) comment '手机号',
   email                varchar(100) comment 'email',
   card                 varchar(30) comment '身份证',
   login_id             varchar(100) comment '帐号',
   pwd                  varchar(20) comment '密码',
   sex                  varchar(1) comment '性别 F男M女',
   role                 int(1) comment '权限',
   status               int(1) default 1 comment '状态',
   primary key (user_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_sys_user comment '用户表';

/*==============================================================*/
/* Table: t_test_paper                                          */
/*==============================================================*/
create table t_test_paper
(
   paper_id             int not null auto_increment,
   course_id            int,
   paper_title          varchar(200) comment '试卷标题',
   create_date          date comment '创建时间',
   create_user_id       int comment '创建人ID',
   create_user_name     varchar(100) comment '创建人姓名',
   perfect_score        int(3) comment '满分',
   pass_score           int(3) comment '及格分',
   one_choice_totle     int(8) default 0 comment '单选选择题总数',
   multiplc_choice_totle int(8) default 0 comment '不定项选择题总数',
   true_false_totle     int(8) default 0 comment '判断题总数',
   blank_filling_totle  int(8) default 0 comment '填空题总数',
   simple_anser_totle   int(8) default 0 comment '简答题总数',
   need_marking         int(1) default 1 comment '是否需要人工阅卷',
   paper_type           int(1) default 1 comment '考卷类型 1:考试 2 :测验',
   need_makeup          int(1) default 0 comment '是否需要补考',
   primary key (paper_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table t_test_paper comment '试卷表';

/*==============================================================*/
/* Table: t_user_student                                        */
/*==============================================================*/
create table t_user_student
(
   student_id           int not null auto_increment,
   class_id             int,
   student_num          varchar(20) comment '学号',
   enter_year           date comment '入学时间',
   origin               varchar(100) comment '籍贯',
   primary key (student_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

/*==============================================================*/
/* Table: t_user_teacher                                        */
/*==============================================================*/
create table t_user_teacher
(
   teacher_id           int not null auto_increment,
   teacher_name         varchar(100),
   employee_number      varchar(20) comment '员工编号',
   major                varchar(100) comment '专业',
   professional         varchar(100) comment '职称',
   degree               varchar(100) comment '学位',
   comment              varcher(1000) comment '说明',
   primary key (teacher_id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

