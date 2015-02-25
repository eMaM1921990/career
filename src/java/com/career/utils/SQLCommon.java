/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.utils;

/**
 *
 * @author emam
 */
public class SQLCommon {

    public String REGISTER = "INSERT INTO employment.users("
            + "            u_name, password, f_name, l_name, bod, nationality_id, mail,"
            + "            hear_about_us, gender, notification_register)"
            + "    VALUES (?, ?, ?, ?, ?::date, ?, ?,"
            + "            ?, ?, ?);";

    public String GET_NATIONAL = "SELECT id, name"
            + "  FROM employment.nationality_type;";

    public String GET_CAREER_LEVEL = "SELECT id, name"
            + "  FROM employment.career_level;";

    public String EMPLOYMENT_STATUS = "SELECT id, name"
            + "  FROM employment.employment_status;";

    public String GET_EMP_TYPE = "SELECT id, name FROM employment.employment_type;";

    public String GET_SALARY = "SELECT id, name"
            + "  FROM employment.salary_type;";

    public String GET_PERID = "SELECT id, name"
            + "  FROM employment.notice_period;";

    public String GET_VISA = "SELECT id, name"
            + "  FROM employment.visa_status;";

    public String GET_CITY = "SELECT id, name, nationality_fk"
            + "  FROM employment.cities;";

    public String GET_LOGIN = "SELECT u_name, password, f_name, l_name, bod, nationality_id, mail, "
            + "       hear_about_us, gender, notification_register"
            + "  FROM employment.users WHERE u_name=? AND password=?;";

    public String GET_JOB = "SELECT  id,job_name, job_desc, employment_type_id, employement_status_id, \n"
            + "       salary_amount, salary_id, career_level_id, notice_period_id, \n"
            + "       last_salary_amount, last_salary_id\n"
            + "  FROM employment.required_job WHERE users_cvs_id=?::integer;";

    public String GET_JOB_BYID = "SELECT  id,job_name, job_desc, employment_type_id, employement_status_id, \n"
            + "       salary_amount, salary_id, career_level_id, notice_period_id, \n"
            + "       last_salary_amount, last_salary_id\n"
            + "  FROM employment.required_job WHERE id=?::integer;";

    public String INSERT_JOB = "INSERT INTO employment.required_job("
            + "             job_name, job_desc, employment_type_id, employement_status_id, "
            + "            salary_amount, salary_id, career_level_id, notice_period_id, "
            + "            last_salary_amount, last_salary_id, users_cvs_id)"
            + "    VALUES ( ?, ?, ?, ?, "
            + "            ?, ?, ?, ?, "
            + "            ?, ?, ?);";

    public String UPDATE_JOB = "UPDATE employment.required_job"
            + "   SET  job_name=?,job_desc=?, employment_type_id=?, employement_status_id=?, "
            + "       salary_amount=?, salary_id=?, career_level_id=?, notice_period_id=?, "
            + "       last_salary_amount=?, last_salary_id=?, users_cvs_id=? "
            + " WHERE id=?::integer;";

    public String INSERT_CV = "INSERT INTO employment.users_cvs("
            + "             username)"
            + "    VALUES ( ?);";

    public String GET_INFO = "SELECT id, f_name, surename, dob, gender, nationality_id, visa_status_id, "
            + "       material_status, no_of_own, driving_license, cv_user_id"
            + "  FROM employment.info WHERE cv_user_id=?::integer;";

    public String INSERT_INFO = "INSERT INTO employment.info("
            + "             f_name, surename, dob, gender, nationality_id, visa_status_id, "
            + "            material_status, no_of_own, driving_license, cv_user_id)"
            + "    VALUES (?, ?, ?::date, ?, ?, ?, "
            + "            ?, ?, ?, ?);";

    public String UPDATE_INFO = "UPDATE employment.info"
            + "   SET  f_name=?, surename=?, dob=?::date, gender=?, nationality_id=?, "
            + "       visa_status_id=?, material_status=?, no_of_own=?, driving_license=? "
            + " WHERE id=?;";

    public String GET_CONTACT_INFO = "SELECT id, mail, phone1, phone2, counrty_id, citiy_id, if_other, address1, "
            + "       address2, postalcode, box, fax, weburl, cv_id, mobile"
            + "  FROM employment.contact_info WHERE cv_id=?::integer;";

    public String INSERT_CONTACT_INFO = "INSERT INTO employment.contact_info("
            + "             mail, phone1, phone2, counrty_id, citiy_id, address1, "
            + "            address2, postalcode, box, fax, weburl, cv_id, mobile)"
            + "    VALUES ( ?, ?, ?, ?, ?, ?, "
            + "            ?, ?, ?, ?, ?, ?,?);";

    public String UPDATE_CONTACT_INFO = "UPDATE employment.contact_info"
            + "   SET  mail=?, phone1=?, phone2=?, counrty_id=?, citiy_id=?,"
            + "       address1=?, address2=?, postalcode=?, box=?, fax=?, weburl=?,"
            + "       cv_id=?, mobile=?"
            + " WHERE id=?;";

    public String INSERT_EXPERIENCE = "INSERT INTO employment.experience("
            + "             startdate, enddate, national_id, address, companyname, company_industry_id, "
            + "            career_role_id, role_name, jobdesc, cv_id)"
            + "    VALUES (?::date, ?::date, ?, ?, ?, ?, ?, "
            + "            ?, ?, ?);";

    public String DELETE_EXPERINCE = "DELETE FROM employment.experience"
            + " WHERE id=?;";

    public String UPDATE_EXPERIENCE = "UPDATE employment.experience"
            + "   SET  startdate=?::date, enddate=?::date, national_id=?, address=?, companyname=?, "
            + "       company_industry_id=?, career_role_id=?, role_name=?, jobdesc=?, "
            + "       cv_id=?"
            + " WHERE id=?;";

    public String GET_CURRENT_EXPER = "SELECT id, startdate, enddate, national_id, address, companyname, company_industry_id, "
            + "       career_role_id, role_name, jobdesc, cv_id"
            + "  FROM employment.experience WHERE cv_id=?;";

    public String GET_INDUSRTY = "SELECT id, name"
            + "  FROM employment.company_industry_type;";

    public String GET_CAREER_ROLE = "SELECT id, name"
            + "  FROM employment.career_role;";

    public String GET_CURRENT_EXPER_BYID = "SELECT id, startdate, enddate, national_id, address, companyname, company_industry_id, "
            + "       career_role_id, role_name, jobdesc, cv_id"
            + "  FROM employment.experience WHERE id=?;";

    public String GET_RATE_LEVEL = "SELECT id, name\n"
            + "  FROM employment.rate_level";

    public String GET_CURRENT_EDU = "SELECT id, conutry_id, city_id, major, certificate, rate_id, rate_degree, \n"
            + "       enddate, \"desc\", cv_id,instatute_name\n"
            + "  FROM employment.educations  WHERE cv_id=?";

    public String INSERT_EDU = "INSERT INTO employment.educations(\n"
            + "            conutry_id, city_id, major, certificate, rate_id, rate_degree, \n"
            + "            enddate, \"desc\", cv_id, instatute_name)\n"
            + "    VALUES ( ?, ?, ?, ?, ?, ?, \n"
            + "            ?::date, ?, ?, ?);";

    public String GET_SKILLS_LEVEL = "SELECT id, name\n"
            + "  FROM employment.skill_level";

    public String GET_SKILLS_EXPERIENCE_LEVEL = "SELECT id, name\n"
            + "  FROM employment.skillexperience_level";

    public String GET_LASTWORKING_SKILLS = "SELECT id, name\n"
            + "  FROM employment.skill_level_last_working";

    public String GET_SKILL_LIST = "SELECT id, skill_name, skill_level_id, skill_leve_last_work_id, skillexperince_leve_id\n"
            + "  FROM employment.skill_list WHERE cv_id=?";

    public String INSERT_SKILL_LIST = "INSERT INTO employment.skill_list(\n"
            + "             skill_name, skill_level_id, skill_leve_last_work_id, skillexperince_leve_id, \n"
            + "            cv_id)\n"
            + "    VALUES (?, ?, ?, ?, \n"
            + "            ?)";

    public String DELETE_SKILL_BY_ID = "DELETE FROM employment.skill_list\n"
            + " WHERE id=?";

    public String GET_LANGAUGE = "SELECT id, \"NAME\""
            + "  FROM employment.\"Languages\"";

    public String GET_LANGAUGE_CURRENT = "SELECT id, NAME"
            + "  FROM employment.Languages WHERE CV_ID=?";

    public String GET_USER_LANG_LIST = "SELECT LL.id,L.\"NAME\",LL.\"LANG_ID\",LL.\"SKILL_EXPERINCE_ID\",LL.\"SKILL_LAST_WORK_ID\",LL.\"SKILL_LEVEL_ID\" FROM employment.\"LanguageList\" LL INNER JOIN employment.\"Languages\" L\n"
            + "            ON LL.\"LANG_ID\"=L.id\n"
            + "            INNER JOIN employment.skillexperience_level SL \n"
            + "            ON LL.\"SKILL_EXPERINCE_ID\"=SL.id\n"
            + "           INNER JOIN employment.skill_level_last_working LASTW\n"
            + "            ON LL.\"SKILL_LAST_WORK_ID\"=LASTW.id\n"
            + "            INNER JOIN employment.skill_level SLEVEL\n"
            + "            ON LL.\"SKILL_LEVEL_ID\"=SLEVEL.id\n"
            + "            AND LL.\"CV_ID\"=?";

    public String INSERT_USER_LANG = "INSERT INTO employment.\"LanguageList\"(\n"
            + "             \"SKILL_LEVEL_ID\", \"SKILL_LAST_WORK_ID\", \"SKILL_EXPERINCE_ID\", \n"
            + "            \"LANG_ID\", \"CV_ID\")\n"
            + "    VALUES (?, ?, ?, ?, \n"
            + "            ?)";

    public String REMOVE_LANG_LIST = "DELETE FROM employment.\"LanguageList\"\n"
            + " WHERE id=?";

    public String GET_EDIT_LANG_BY_ID = "SELECT id, \"SKILL_LEVEL_ID\", \"SKILL_LAST_WORK_ID\", \"SKILL_EXPERINCE_ID\", \n"
            + "       \"LANG_ID\", \"CV_ID\"\n"
            + "  FROM employment.\"LanguageList\" WHERE id=?";

    public String EDIT_USER_LANG = "UPDATE employment.\"LanguageList\"\n"
            + "   SET  \"SKILL_LEVEL_ID\"=?, \"SKILL_LAST_WORK_ID\"=?, \"SKILL_EXPERINCE_ID\"=?, \n"
            + "       \"LANG_ID\"=?\n"
            + " WHERE id=?";

    public String INSERT_IDENTIFIER = "INSERT INTO employment.\"IdentifierList\"(\n"
            + "             \"NAME\", \"COMPANY_NAME\", \"POSITION_NAME\", \"PHONE\", \"EMAIL\", \n"
            + "            \"USER_CV\")\n"
            + "    VALUES ( ?, ?, ?, ?, ?, \n"
            + "            ?)";

    public String GET_IDENTIFIER_BY_CV = "SELECT id, \"NAME\", \"COMPANY_NAME\", \"POSITION_NAME\", \"PHONE\", \"EMAIL\", \n"
            + "       \"USER_CV\"\n"
            + "  FROM employment.\"IdentifierList\" WHERE \"USER_CV\"=?";

    public String DELETE_USER_IDENTIFIER = "DELETE FROM employment.\"IdentifierList\"\n"
            + " WHERE id=?";

    public String UPDATE_USER_IDENTIFIER = "UPDATE employment.\"IdentifierList\"\n"
            + "   SET \"NAME\"=?, \"COMPANY_NAME\"=?, \"POSITION_NAME\"=?, \"PHONE\"=?, \n"
            + "       \"EMAIL\"=?\n"
            + " WHERE id=?";

}
