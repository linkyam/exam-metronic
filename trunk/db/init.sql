INSERT INTO `t_sys_navigation` VALUES (10, '我的', '与个人相关内容', NULL, 1, NULL, 1);
INSERT INTO `t_sys_navigation` VALUES (20, '人员信息', '包括老师信息、学生信息', NULL, 2, NULL, 1);
INSERT INTO `t_sys_navigation` VALUES (30, '学校信息', '学校信息维护，包括学院、学制、专业、课程、班级', NULL, 3, NULL, 1);
INSERT INTO `t_sys_navigation` VALUES (40, '题库管理', '题库增删改查', NULL, 4, NULL, 1);
INSERT INTO `t_sys_navigation` VALUES (50, '考试管理', '建立考试，人工阅卷', NULL, 5, NULL, 1);
INSERT INTO `t_sys_navigation` VALUES (60, '成绩查询', '查询成绩', NULL, 6, NULL, 1);



INSERT INTO `t_sys_menu` VALUES (100, 10, '我的考试', NULL, NULL, '/views/exam/myExam.jsp', 1, 1, 0, NULL);
INSERT INTO `t_sys_menu` VALUES (110, 10, '我的成绩', NULL, NULL, '/views/info/myTestScores.jsp', 2, 1, 0, NULL);
INSERT INTO `t_sys_menu` VALUES (200, 20, '学生信息管理', NULL, NULL, '/views/info/studentInfo.jsp', 1, 1, 0, NULL);
INSERT INTO `t_sys_menu` VALUES (210, 20, '教师信息管理', NULL, NULL, '/views/info/teacherInfo.jsp', 2, 1, 0, NULL);
INSERT INTO `t_sys_menu` VALUES (300, 30, '学院信息管理', NULL, NULL, '/views/info/collegeInfo.jsp', 1, 1, 0, NULL);
INSERT INTO `t_sys_menu` VALUES (310, 30, '专业信息管理', NULL, NULL, '/views/info/specialityInfo.jsp', 2, 1, 0, NULL);
INSERT INTO `t_sys_menu` VALUES (320, 30, '班级信息管理', NULL, NULL, '/views/info/classInfo.jsp', 3, 1, 0, NULL);
INSERT INTO `t_sys_menu` VALUES (400, 40, '试题管理', NULL, NULL, '/views/exam/examDatabase.jsp', 1, 1, 0, NULL);
INSERT INTO `t_sys_menu` VALUES (410, 40, '试卷管理', NULL, NULL, '/views/exam/testPaper.jsp', 2, 1, 0, NULL);
INSERT INTO `t_sys_menu` VALUES (500, 50, '考试信息管理', NULL, NULL, '/views/exam/testManager.jsp', 1, 1, 0, NULL);
INSERT INTO `t_sys_menu` VALUES (510, 50, '人工阅卷', NULL, NULL, '/views/exam/marking.jsp', 2, 1, 0, NULL);
INSERT INTO `t_sys_menu` VALUES (600, 60, '成绩查询', NULL, NULL, '/views/info/testScores.jsp', 0, 1, 0, NULL);
